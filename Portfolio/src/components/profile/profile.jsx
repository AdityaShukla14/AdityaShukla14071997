import React from 'react'
import './profile.css'
import IMG from '../../resources/profile_main.jpg'
import CTA from './cta'
import Socials from './socials'
const Profile = () => {
  return (
    <>
    <header>
    
      <div className="container header__container">
          <div className="profile-image">
              <img src={IMG} alt="img" id='profile-image'></img> 
          </div>
        <h5 className='text-light'>Hello I'm</h5>
        <h2>Aditya Shukla</h2>
        <h5 className='text-light'>Software Developer</h5>
        <CTA/>
        <Socials/>
        
      </div>
      
      <a href='#contact' className='scroll_down'>Scroll Down</a>
    </header>
    
    </>
    
  )
}

export default Profile