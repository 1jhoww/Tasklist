import {authenticate} from "./auth.js";

document.onreadystatechange = () => {
    $("#signin-b").click(authenticate);
}