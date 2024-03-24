import '../Styles/LoginForm.css';
import InputBox from "../../CommonComponents/Inputs/InputBox";
import InputButton from "../../CommonComponents/Inputs/InputButton";
import {useEffect, useState} from "react";
import LogoComponent from "../../CommonComponents/Resources/LogoComponent";
function LoginFrom() {
    const [username, setUsername] = useState();
    const [password, setPassword] = useState();
    const [loginBtPress, setLoginBtPress] = useState(false);
    const[loginState, setLoginState] = useState('');

    const loginButtonPress = ()=>{
        setLoginBtPress(!loginBtPress);
    }

    const loginUser = async ()=>{
       await fetch("http://127.0.0.1:8080/api/users/authorizeUser", {
            method :'POST',
            headers: {"Content-type" : "application/json; charset=UTF-8"},
            body: JSON.stringify({
                username : username,
                password : password
            }
            )
        })
            .then(response => response.json())
            .then(jsonResponse => jsonResponse === true ?  setLoginState("Login success") :
                setLoginState("Login failed"))
            .catch(error => console.log("Error in communication with server"))
    }

    return (
        <div className="loginForm">
            <LogoComponent/>
            <InputBox inputLabel={"Username"} inputType={"text"} inputId={"userId"} onChange={setUsername}/>
            <InputBox inputLabel={"Password"} inputType={"password"} inputId={"userPwd"} onChange={setPassword}/>
            <InputButton buttonText={"Login"} username={username} password={password} clickFunction={loginUser}/>
            <span>{loginState}</span>
        </div>
    )
}
export default LoginFrom;