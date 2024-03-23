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
import Linguagem from "./avaliacaoPsicologica/Linguagem";
import Compreensao from "./avaliacaoPsicologica/Compreensao";
import SaudeMental from "./avaliacaoPsicologica/SaudeMental";
import Socializacao from "./avaliacaoPsicologica/Socializacao";
import Comportamento from "./avaliacaoPsicologica/Comportamento";
import HabilidadesSociais from "./avaliacaoPsicologica/HabilidadesSociais";
import Afetividade from "./avaliacaoPsicologica/Afetividade";
import RelacaoDaFamiliaComOExaminado from "./avaliacaoPsicologica/RelacaoDaFamiliaComOExaminado";
import AvaliacaoPsicologica from "./avaliacaoPsicologica/AvaliacaoPsicologica";

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
      <Linguagem/>
      <Compreensao/>
      <SaudeMental/>
      <Socializacao/>
      <Comportamento/>
      <HabilidadesSociais/>
      <Afetividade/>
      <RelacaoDaFamiliaComOExaminado/>
      <AvaliacaoPsicologica/>
    </div>
  )
}

export default CadastroPraticante
