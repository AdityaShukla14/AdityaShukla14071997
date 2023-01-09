import React from 'react'
import CV from '../../resources/Aditya_Shukla.pdf'
const Cta = () => {
  return (
    <div className='cta_main'>
        
        <div className="cta">
          <a href={CV} download className='btn'>Download CV</a>
          <a href='#contact' className='btn btn-primary'>Let's Talk</a>
        </div>
      </div>
  )
}

export default Cta