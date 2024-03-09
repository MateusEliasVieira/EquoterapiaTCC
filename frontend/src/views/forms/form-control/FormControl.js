import React from 'react'
import {
  CButton,
  CCard,
  CCardBody,
  CCardHeader,
  CCol,
  CForm,
  CFormCheck,
  CFormInput,
  CFormLabel,
  CFormSelect,
  CFormTextarea,
  CRow,
} from '@coreui/react'
import { IMaskMixin } from 'react-imask'
const FormControl = () => {
  const estados = [
    'Selecione',
    { label: 'Acre', value: 'AC' },
    { label: 'Alagoas', value: 'AL' },
    { label: 'Amapá', value: 'AP' },
    { label: 'Amazonas', value: 'AM' },
    { label: 'Bahia', value: 'BA' },
    { label: 'Ceará', value: 'CE' },
    { label: 'Distrito Federal', value: 'DF' },
    { label: 'Espírito Santo', value: 'ES' },
    { label: 'Goiás', value: 'GO' },
    { label: 'Maranhão', value: 'MA' },
    { label: 'Mato Grosso', value: 'MT' },
    { label: 'Mato Grosso do Sul', value: 'MS' },
    { label: 'Minas Gerais', value: 'MG' },
    { label: 'Pará', value: 'PA' },
    { label: 'Paraíba', value: 'PB' },
    { label: 'Paraná', value: 'PR' },
    { label: 'Pernambuco', value: 'PE' },
    { label: 'Piauí', value: 'PI' },
    { label: 'Rio de Janeiro', value: 'RJ' },
    { label: 'Rio Grande do Norte', value: 'RN' },
    { label: 'Rio Grande do Sul', value: 'RS' },
    { label: 'Rondônia', value: 'RO' },
    { label: 'Roraima', value: 'RR' },
    { label: 'Santa Catarina', value: 'SC' },
    { label: 'São Paulo', value: 'SP' },
    { label: 'Sergipe', value: 'SE' },
    { label: 'Tocantins', value: 'TO' },
  ]
  const tipoSanguineo = [
    'Selecione',
    { label: 'A +', value: 'A_POSITIVO' },
    { label: 'A -', value: 'A_NEGATIVO' },
    { label: 'B +', value: 'B_POSITIVO' },
    { label: 'B -', value: 'B_NEGATIVO' },
    { label: 'AB +', value: 'AB_POSITIVO' },
    { label: 'AB -', value: 'AB_NEGATIVO' },
    { label: 'O +', value: 'O_POSITIVO' },
    { label: 'O -', value: 'O_NEGATIVO' },
  ]
  const CFormInputWithMask = IMaskMixin(({ inputRef, ...props }) => (
    <CFormInput {...props} ref={inputRef} />
  ))
  return (
    <CRow>
      <CCol xs={12}>
        <CCard className="mb-4">
          <CCardHeader>
            <strong>Dados Pessoais</strong>
          </CCardHeader>
          <CCardBody>
            <CForm>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Nome Completo</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Diagnóstico Clínico</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Data de Nascimento</CFormLabel>
                <CFormInput type="date" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Peso</CFormLabel>
                <CFormInput type="number" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Tipo Sanguíneo</CFormLabel>
                <CFormSelect options={tipoSanguineo} />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Fator RH</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Sexo</CFormLabel>
                <CFormCheck
                  type="radio"
                  name="sexo"
                  id="flexRadioDefault1"
                  label="Masculino"
                  value={'MASCULINO'}
                />
                <CFormCheck
                  type="radio"
                  name="sexo"
                  id="flexRadioDefault2"
                  label="Feminino"
                  value={'FEMININO'}
                  defaultChecked
                />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Naturalidade</CFormLabel>
                <CFormSelect options={estados} />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">CPF</CFormLabel>
                <CFormInputWithMask mask="000.000.000-00" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Nº Cartão do SUS</CFormLabel>
                <CFormInputWithMask mask="000 0000 0000 0000" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Endereço Residencial</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Bairro</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">Cidade</CFormLabel>
                <CFormInput type="text" />
              </div>
              <div className="mb-3">
                <CFormLabel htmlFor="exampleFormControlInput1">CEP</CFormLabel>
                <CFormInputWithMask mask="00000-000" />
              </div>
              <CButton color="primary">Salvar</CButton>
            </CForm>
          </CCardBody>
        </CCard>
      </CCol>
    </CRow>
  )
}

export default FormControl
