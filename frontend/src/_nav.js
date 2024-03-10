import React from 'react'
import CIcon from '@coreui/icons-react'
import {
  cilAccountLogout,
  cilChartPie,
  cilClipboard, cilContact,
  cilDescription,
  cilMagnifyingGlass, cilSpeedometer, cilTrash,
  cilUser,
  cilUserFollow,
  cilUserPlus
} from '@coreui/icons'
import {CNavGroup, CNavItem} from '@coreui/react'

const _nav = [
  {
    component: CNavGroup,
    name: 'Praticantes',
    to: '/base',
    icon: <CIcon icon={cilUser} customClassName="nav-icon"/>,
    items: [
      {
        component: CNavItem,
        name: 'Novo',
        to: '/formulario/cadastrar-praticante',
        icon:<CIcon icon={cilUserPlus} customClassName={"nav-icon"} />
      },
      {
        component: CNavItem,
        name: 'Atualizar',
        to: '/formulario/atualizar-praticante',
        icon: <CIcon icon={cilContact} customClassName={"nav-icon"} />
      },
      {
        component: CNavItem,
        name: 'Pesquisar',
        to: '/formulario/pesquisar-praticante',
        icon: <CIcon icon={cilMagnifyingGlass} customClassName={"nav-icon"}/>
      }
    ],
  },
  {
    component: CNavItem,
    name: 'Relatórios',
    to: '/relatorio-praticantes',
    icon: <CIcon icon={cilClipboard} customClassName="nav-icon"/>,
  },
  {
    component: CNavItem,
    name: 'Gráficos',
    to: '/graficos-praticantes',
    icon: <CIcon icon={cilChartPie} customClassName="nav-icon"/>,
  },
  {
    component: CNavGroup,
    name: 'Funcionários',
    to: '/buttons',
    icon: <CIcon icon={cilUser} customClassName="nav-icon"/>,
    items: [
      {
        component: CNavItem,
        name: 'Novo',
        to: '/formulario/cadastrar-funcionario',
        icon:<CIcon icon={cilUserPlus} customClassName={"nav-icon"}/>
      },
      {
        component: CNavItem,
        name: 'Atualizar',
        to: '/formulario/atualizar-funcionario',
        icon: <CIcon icon={cilContact} customClassName={"nav-icon"} />
      },
      {
        component: CNavItem,
        name: 'Pesquisar',
        to: '/formulario/pesquisar-funcionario',
        icon: <CIcon icon={cilMagnifyingGlass} customClassName={"nav-icon"}/>
      },
      {
        component: CNavItem,
        name: 'Deletar',
        to: '/formulario/deletar-funcionario',
        icon:<CIcon icon={cilTrash} customClassName={"nav-icon"} />
      },
    ],
  },
  {
    component: CNavItem,
    name: 'Sair',
    href: '/sair',
    icon: <CIcon icon={cilAccountLogout} customClassName="nav-icon"/>,
  },
]

export default _nav
