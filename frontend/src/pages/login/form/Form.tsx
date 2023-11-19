import { Button, TextField } from "@mui/material";
import { useState } from "react";
import axios from "axios";
import "./Form.css";
import { ENDPOINT_LOGIN } from "../../../global/Endpoint";

export const Form = () => {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");

    const validationFields = () => {

    }

    const sendForAPI = () => {
        axios.post(ENDPOINT_LOGIN, { username: username, password: password })
            .then((response) => {
                console.log(response.data);
            })
            .catch((error) => {
                console.error(error)
            })
    }

    return (
        <div id="div-form-login">

            <TextField
                id="textfield-username-div-form-login"
                className="textfield-div-form-login"
                label="Usuário"
                variant="outlined"
                fullWidth
                onChange={event => { setUsername(event.target.value); }} />

            <TextField
                id="textfield-password-div-form-login"
                className="textfield-div-form-login"
                label="Senha"
                variant="outlined"
                type="password"
                fullWidth
                onChange={event => { setPassword(event.target.value); }} />

            <Button
                id="button-div-form-login"
                variant="contained"
                size="large"
                onClick={(event) => { event.preventDefault(); sendForAPI(); }}> Entrar </Button>

        </div>
    )
}