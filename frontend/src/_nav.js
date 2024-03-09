import React from 'react'
import CIcon from '@coreui/icons-react'
import { cilChartPie, cilDescription, cilNotes, cilUser, cilUserFollow } from '@coreui/icons'
import { CNavGroup, CNavItem } from '@coreui/react'
const _nav = [
  {
    component: CNavGroup,
    name: 'Praticantes',
    to: '/base',
    icon: <CIcon icon={cilUserFollow} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: 'Cadastrar',
        to: '/forms/form-control',
      },
      {
        component: CNavItem,
        name: 'Atualizar',
        to: '/base/breadcrumbs',
      },
      {
        component: CNavItem,
        name: 'Pesquisar',
        to: '/base/cards',
      },
      {
        component: CNavItem,
        name: 'Geral',
        to: '/base/carousels',
      },
    ],
  },
  {
    component: CNavGroup,
    name: 'Funcionários',
    to: '/buttons',
    icon: <CIcon icon={cilUser} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: 'Cadastrar',
        to: '/forms/form-control',
      },
      {
        component: CNavItem,
        name: 'Atualizar',
        to: '/buttons/button-groups',
      },
      {
        component: CNavItem,
        name: 'Deletar',
        to: '/buttons/dropdowns',
      },
    ],
  },
  {
    component: CNavGroup,
    name: 'Forms',
    icon: <CIcon icon={cilNotes} customClassName="nav-icon" />,
    items: [
      {
        component: CNavItem,
        name: 'Form Control',
        to: '/forms/form-control',
      },
      {
        component: CNavItem,
        name: 'Select',
        to: '/forms/select',
      },
      {
        component: CNavItem,
        name: 'Checks & Radios',
        to: '/forms/checks-radios',
      },
      {
        component: CNavItem,
        name: 'Range',
        to: '/forms/range',
      },
      {
        component: CNavItem,
        name: 'Input Group',
        to: '/forms/input-group',
      },
      {
        component: CNavItem,
        name: 'Floating Labels',
        to: '/forms/floating-labels',
      },
      {
        component: CNavItem,
        name: 'Layout',
        to: '/forms/layout',
      },
      {
        component: CNavItem,
        name: 'Validation',
        to: '/forms/validation',
      },
    ],
  },
  {
    component: CNavItem,
    name: 'Gráficos',
    to: '/charts',
    icon: <CIcon icon={cilChartPie} customClassName="nav-icon" />,
  },
  {
    component: CNavItem,
    name: 'Sair',
    href: 'https://coreui.io/react/docs/templates/installation/',
    icon: <CIcon icon={cilDescription} customClassName="nav-icon" />,
  },
]

export default _nav
