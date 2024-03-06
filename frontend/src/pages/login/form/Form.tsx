import { Button, TextField } from "@mui/material";
import { useState } from "react";
import axios from "axios";
import "./Form.css";
import { ENDPOINT_LOGIN } from "../../../global/Endpoint";

export const Form = () => {

    const [nomeUsuario, setNomeUsuario] = useState("");
    const [senha, setSenha] = useState("");

    const sendForAPI = () => {
        axios.post(ENDPOINT_LOGIN, { nomeUsuario: nomeUsuario, senha: senha })
            .then((response) => {
                alert("Deu bom")
                console.log(response.data);

            })
            .catch((error) => {
                for(let i = 0; i < error.response.data.lista.length; i++){
                    alert(error.response.data.lista[i].mensagem)
                }
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
                onChange={event => { setNomeUsuario(event.target.value); }} />

            <TextField
                id="textfield-password-div-form-login"
                className="textfield-div-form-login"
                label="Senha"
                variant="outlined"
                type="password"
                fullWidth
                onChange={event => { setSenha(event.target.value); }} />

            <Button
                id="button-div-form-login"
                variant="contained"
                size="large"
                onClick={(event) => { event.preventDefault(); sendForAPI();}}> Entrar </Button>

            <a id="id-link-recuperar-senha" href={"/recuperar-senha"}>Esqueceu a senha?</a>

        </div>
    )
}