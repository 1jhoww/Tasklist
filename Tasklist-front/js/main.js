import {signout} from "./auth.js"
import {check} from "./auth.js"
document.onreadystatechange = () => {

    setInterval(check, 10000);
    $("signout-b").click(signout);
}
