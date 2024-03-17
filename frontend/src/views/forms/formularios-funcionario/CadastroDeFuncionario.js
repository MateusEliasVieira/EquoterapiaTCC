import React, { useState } from 'react';
import {
  CButton,
  CCard,
  CCardBody,
  CCardHeader,
  CCol,
  CForm,
  CFormLabel,
  CRow,
  CFormInput,
  CFormSelect,
} from '@coreui/react';
import axios from 'axios';

const CadastroDeFuncionario = () => {
  const [formData, setFormData] = useState({
    nome: '',
    foto: '',
    dataNascimento: '',
    cpf: '',
    estadoCivil: '',
    telefone: '',
    email: '',
    nomeUsuario: '',
    senha: '',
    detalhesFormacao: '',
    cidade: '',
    bairro: '',
    logradouro: '',
    role: '',
    vinculo: '',
    possuiFormacao: false,
  });

  const salvar = async () => {
    const dados = {
      ...formData,
    };

    try {
      const response = await axios.post(
          SEU_ENDPOINT_DE_SALVAR_AQUI,
          JSON.stringify(dados),
          {
            headers: {
              'Content-Type': 'application/json',
            },
          }
      );
      console.log('Dados do usuário salvos com sucesso:', response.data);
    } catch (error) {
      console.log('Erro ao salvar os dados do usuário:', error);
    }
  };

  return (
      <CRow>
        <CCol xs={12}>
          <CCard className="mb-4">
            <CCardHeader>
              <strong>Registro de Usuário</strong>
            </CCardHeader>
            <CCardBody>
              <CForm>
                <div className="mb-3">
                  <CFormLabel htmlFor="nome">Nome</CFormLabel>
                  <CFormInput
                      id="nome"
                      value={formData.nome}
                      onChange={(e) => setFormData({ ...formData, nome: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="foto">Foto</CFormLabel>
                  <CFormInput
                      id="foto"
                      type="file"
                      onChange={(e) => setFormData({ ...formData, foto: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="dataNascimento">Data de Nascimento</CFormLabel>
                  <CFormInput
                      id="dataNascimento"
                      type="date"
                      value={formData.dataNascimento}
                      onChange={(e) => setFormData({ ...formData, dataNascimento: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="cpf">CPF</CFormLabel>
                  <CFormInput
                      id="cpf"
                      value={formData.cpf}
                      onChange={(e) => setFormData({ ...formData, cpf: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="estadoCivil">Estado Civil</CFormLabel>
                  <CFormSelect
                      id="estadoCivil"
                      value={formData.estadoCivil}
                      onChange={(e) => setFormData({ ...formData, estadoCivil: e.target.value })}
                  >
                    <option value="">Selecionar</option>
                    {/* Opções para Estado Civil */}
                  </CFormSelect>
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="telefone">Telefone</CFormLabel>
                  <CFormInput
                      id="telefone"
                      value={formData.telefone}
                      onChange={(e) => setFormData({ ...formData, telefone: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="email">Email</CFormLabel>
                  <CFormInput
                      id="email"
                      type="email"
                      value={formData.email}
                      onChange={(e) => setFormData({ ...formData, email: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="nomeUsuario">Nome de Usuário</CFormLabel>
                  <CFormInput
                      id="nomeUsuario"
                      value={formData.nomeUsuario}
                      onChange={(e) => setFormData({ ...formData, nomeUsuario: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="senha">Senha</CFormLabel>
                  <CFormInput
                      id="senha"
                      type="password"
                      value={formData.senha}
                      onChange={(e) => setFormData({ ...formData, senha: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="detalhesFormacao">Detalhes da Formação</CFormLabel>
                  <CFormInput
                      id="detalhesFormacao"
                      type="text"
                      value={formData.detalhesFormacao}
                      onChange={(e) => setFormData({ ...formData, detalhesFormacao: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="cidade">Cidade</CFormLabel>
                  <CFormInput
                      id="cidade"
                      value={formData.cidade}
                      onChange={(e) => setFormData({ ...formData, cidade: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="bairro">Bairro</CFormLabel>
                  <CFormInput
                      id="bairro"
                      value={formData.bairro}
                      onChange={(e) => setFormData({ ...formData, bairro: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="logradouro">Logradouro</CFormLabel>
                  <CFormInput
                      id="logradouro"
                      value={formData.logradouro}
                      onChange={(e) => setFormData({ ...formData, logradouro: e.target.value })}
                  />
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="role">Role</CFormLabel>
                  <CFormSelect
                      id="role"
                      value={formData.role}
                      onChange={(e) => setFormData({ ...formData, role: e.target.value })}
                  >
                    <option value="">Selecionar</option>
                    {/* Opções para Role */}
                  </CFormSelect>
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="vinculo">Vínculo</CFormLabel>
                  <CFormSelect
                      id="vinculo"
                      value={formData.vinculo}
                      onChange={(e) => setFormData({ ...formData, vinculo: e.target.value })}
                  >
                    <option value="">Selecionar</option>
                    {/* Opções para Vínculo */}
                  </CFormSelect>
                </div>

                <div className="mb-3">
                  <CFormLabel htmlFor="possuiFormacao">Possui Formação?</CFormLabel>
                  <CFormSelect
                      id="possuiFormacao"
                      value={formData.possuiFormacao}
                      onChange={(e) => setFormData({ ...formData, possuiFormacao: e.target.value })}
                  >
                    <option value="">Selecionar</option>
                    <option value={true}>Sim</option>
                    <option value={false}>Não</option>
                  </CFormSelect>
                </div>

                <CButton color="primary" onClick={salvar}>
                  Salvar
                </CButton>
              </CForm>
            </CCardBody>
          </CCard>
        </CCol>
      </CRow>
  );
};

export default CadastroDeFuncionario;
