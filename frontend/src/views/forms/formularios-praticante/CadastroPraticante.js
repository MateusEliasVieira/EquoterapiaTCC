import DadosPessoais from "./fichaCadastroAdmissional/DadosPessoais";
import Educacao from "./fichaCadastroAdmissional/Educacao";
import ResponsavelPeloPraticante from "./fichaCadastroAdmissional/ResponsavelPeloPraticante";
import OutrasAtividadesManha from "./fichaCadastroAdmissional/OutrasAtividadesManha";
import OutrasAtividadesTarde from "./fichaCadastroAdmissional/OutrasAtividadesTarde";
import Emergencia from "./fichaCadastroAdmissional/Emergencia";
import CompletudeMatricula from "./fichaCadastroAdmissional/CompletudeMatricula";
import SobreACrianca from "./avaliacaoPsicologica/SobreACrianca";
import Saude from "./avaliacaoPsicologica/Saude";
import Rotina from "./avaliacaoPsicologica/Rotina";
import CuidadosPessoais from "./avaliacaoPsicologica/CuidadosPessoais";
import TracoDePersonalidade from "./avaliacaoPsicologica/TracoDePersonalidade";

const CadastroPraticante = () => {
    return (
        <div>
            <DadosPessoais/>
            <Educacao/>
            <ResponsavelPeloPraticante/>
            <OutrasAtividadesManha/>
            <OutrasAtividadesTarde/>
            <Emergencia/>
            <CompletudeMatricula/>
            <SobreACrianca/>
            <Saude/>
            <Rotina/>
            <CuidadosPessoais/>
            <TracoDePersonalidade/>
        </div>
    )
}

export default CadastroPraticante
