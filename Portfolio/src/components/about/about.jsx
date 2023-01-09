import React from 'react'
import './about.css'
import School from '../../resources/school-icon.png'
import College from '../../resources/college-icon.png'
//import {BsInfoCircle} from 'react-icons/bs'
const About = () => {
  return (
    <section id='about'>
      <h5>In a nutshell </h5>
      <h2>About Me</h2>
      <div className="container about__container">
        <div className="about_content">
          <div className="about_cards">
            <article className='about_card'>
              <img src={School} alt="school" id='logo'></img>  
              <h5>High School</h5>
              <small>Vidya Bhumi Public School , Chhindwara </small><br></br>
              <small>CBSE</small>
              {/* <i><BsInfoCircle/></i>
              <span class="extra-info">
                School Info
              </span> */}
            </article>
            
            <article className='about_card'>
                <img src={College} alt="college" id='logo'></img>  
                <h5>College</h5>
                <small>Technocrats Institute of Technology , Bhopal</small><br></br>
              <small>Bachelor of Engineering </small><br></br>
              <medium>Information Technology</medium>
                {/* <i><BsInfoCircle/></i>
                <span class="extra-info">
                  College Info
                </span> */}
              </article>
            </div>
            <p className='about_me_para'>
            I'm a Software Developer with combined 2+ years of training and industry-level software development.<br></br> I offer solutions to customers and clients with amenities, skills, and expertise, depending on the needs of the clients.
            <br></br>I get elevated about opportunities where I can enhance my abilities to acquire more knowledge and utilize my expertise and be a Perpetual student.
            <br></br>I love connecting with new people, you can reach me at adi.adishukla7@gmail.com
            </p>
            <a href='#contact' id='about_contact_btn'className='btn btn-primary'>Let's Talk</a>
          </div>
            
        </div>
    </section>
  )
}

export default About