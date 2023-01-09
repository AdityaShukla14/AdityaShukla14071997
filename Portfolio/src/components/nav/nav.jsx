import React from 'react'
import './nav.css'
import {BiHomeSmile} from 'react-icons/bi'
import {MdContacts} from 'react-icons/md'
import {FaAward} from 'react-icons/fa'
import {BiUserCircle} from 'react-icons/bi'
import { useState } from 'react'
const Nav = () => {
  const [activeNav,setActiveNav]=useState('#')
  return (
    <nav>
      <a id='social' onClick={()=> setActiveNav('#')}  className={ activeNav === '#' ? 'active' : ''} href='#'><BiHomeSmile/></a>
      <a id='social' onClick={()=> setActiveNav('#about')} className={ activeNav === '#about' ? 'active' : ''} href='#about'><BiUserCircle/></a>
      <a id='social' onClick={()=> setActiveNav('#experience')} className={ activeNav === '#experience' ? 'active' : ''} href='#experience'><FaAward/></a>
      <a id='social' onClick={()=> setActiveNav('#contact')} className={ activeNav === '#contact' ? 'active' : ''} href='#contact'><MdContacts/></a>
      {/* <a id='social' href='#footer'></a> */}
    </nav>
  )
}

export default Nav