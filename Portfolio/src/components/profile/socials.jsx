import React from 'react'
import {BsLinkedin} from 'react-icons/bs'
import {BsInstagram} from 'react-icons/bs'
const Socials = () => {
  return (
    <div className='header__socials'>
        <a id='social' href='https://www.linkedin.com/in/aditya-shukla-sde/' target="_blank"><BsLinkedin/></a>
        <a  id='social' href='https://www.instagram.com/_i_am_adi/?hl=en' target="_blank"><BsInstagram/></a>
    </div>
  )
}

export default Socials