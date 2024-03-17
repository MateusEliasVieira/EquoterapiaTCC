import DadosPessoais from "./fichaCadastroAdmissional/DadosPessoais";
import Educacao from "./fichaCadastroAdmissional/Educacao";
import ResponsavelPeloPraticante from "./fichaCadastroAdmissional/ResponsavelPeloPraticante";
import OutrasAtividadesManha from "./fichaCadastroAdmissional/OutrasAtividadesManha";
import OutrasAtividadesTarde from "./fichaCadastroAdmissional/OutrasAtividadesTarde";
import Emergencia from "./fichaCadastroAdmissional/Emergencia";

const CadastroPraticante = () => {
    return (
        <div>
            <DadosPessoais/>
            <Educacao/>
            <ResponsavelPeloPraticante/>
            <OutrasAtividadesManha/>
            <OutrasAtividadesTarde/>
            <Emergencia/>
        </div>
    )
}

export default CadastroPraticante
