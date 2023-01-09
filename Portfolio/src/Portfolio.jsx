import React from 'react'
import Profile from './components/profile/profile'
import Nav from './components/nav/nav'
import Contact from './components/contact/contact'
import Experience from './components/experience/experience'
import About from './components/about/about'
const Portfolio  = () => {
  return (
   <>
    <Profile />
    <Nav />
    <About/>
    <Experience />    
    <Contact />
   </>
  )
}

export default Portfolio 