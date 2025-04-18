import { data } from "jquery";

const base_url = 'http://localhost:8081'

const authenticate = () => {
    const email = $("#e").val();
    const password = $("#p").val();
    const body = `{"email": "${email}", "password": "${password}"}`

    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/signin`,
        contentType: 'application/json',
        dataType: 'json',
        data: body,
        success: (res) => {console.log(res);
            localStorage.setItem("token", res.token);
            window.location.href = "main.html";
        }

    })

}

const signout = () => {
    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/signout`,
        headers: {"token": localStorage.getItem("token")},
        sucess: (res) => {console.log('success', res)},
        error: (res) => {console.log('error', res); check()}
    })
}

const check = () => {
    $.ajax({
        type: 'POST',
        url: `${base_url}/auth/check`,
        headers: {"token": localStorage.getItem("token")},
        sucess: (res) => {console.log('success', res)},
        error: (res) => {console.log('error', res);
            localStorage.removeItem("token");
            winndow.location.href = "index.html";
        }
    })

}

export {authenticate, signout, check}