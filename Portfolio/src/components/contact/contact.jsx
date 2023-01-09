import React from 'react'
import './contact.css'
import {BiMailSend} from 'react-icons/bi'
import {BsMessenger} from 'react-icons/bs'
import {BsWhatsapp} from 'react-icons/bs'
const Contact = () => {
  return (
    <section id='contact'>
      <h5>Let's Connect !</h5>
      <h2>Contact Me</h2>
      <div className="container contact_container">
        <div className="contact_options">
          <article className='contact_option'>
            <BiMailSend className='contact_option_icon' />
            <h4>Email</h4>
            <h5>adi.adishukla7@gmail.com</h5>
            <a href="mailto:adi.adishukla7@gmail.com" target={'_blank'}>Send a Mail</a>
          </article>
          <article className='contact_option'>
            <BsMessenger className='contact_option_icon'/>
            <h4>Message</h4>
            <h5>Aditya Shukla</h5>
            <a href="https://m.me/aditya.shukla.oo7" target={'_blank'}>Send a Message</a>
          </article>
          <article className='contact_option'>
            <BsWhatsapp className='contact_option_icon'/>
            <h4>What's App</h4>
            <h5>+91 - 8770460744</h5>
            <a href="https://api.whatsapp.com/send?phone=+918770460744" target={'_blank'}>Start Chat</a>
          </article>
        </div>
        {/* <form action=''>
          <input type="text" name="name" placeholder='Full Name' required></input>
          <input type="email" name="email" placeholder='Email' required></input>
          <textarea rows='8' type="text" name="text_area" placeholder='Message' required></textarea>
          <button type='submit' className='btn btn-primary'>Send Message</button>
        </form> */}
      </div>
    </section>
  )
}

export default Contact