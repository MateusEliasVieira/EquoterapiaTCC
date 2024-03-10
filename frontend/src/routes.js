import React from 'react'

const Dashboard = React.lazy(() => import('./views/dashboard/Dashboard'))

//Forms
const CadastroPraticante = React.lazy(() => import('./views/forms/formularios-praticante/CadastroPraticante'))
const CadastroFuncionario = React.lazy(() => import('./views/forms/formularios-funcionario/CadastroDeFuncionario'))

// Gráfico
const Grafico = React.lazy(() => import('./views/graficos/Grafico'))

const routes = [
  { path: '/', exact: true, name: 'Início' },
  { path: '/dashboard', name: 'Dashboard', element: Dashboard },
  { path: '/graficos-praticantes', name: 'Gráficos', element: Grafico },
  { path: '/formulario/cadastrar-praticante', name: 'Cadastro de Praticante', element: CadastroPraticante },
  { path: '/formulario/cadastrar-funcionario', name: 'Cadastro de Funcionário', element: CadastroFuncionario }
]
export default routes
