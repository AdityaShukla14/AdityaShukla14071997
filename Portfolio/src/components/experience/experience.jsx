import React from 'react'
import './experience.css'
import {BsFillPatchCheckFill} from 'react-icons/bs'
const Experience = () => {
  return (
    <section id='experience'>
      <h5>What skills i have ? </h5>
      <h2>Experience</h2>
      <div className="container experience__container">
        <div className="experience_cards">
          <article className='experience_card'>
            <h2>Front End</h2>
            <ul>
              <li><i><BsFillPatchCheckFill/></i>  JSP</li>
              <li><i><BsFillPatchCheckFill/></i>  HTML</li>
              <li><i><BsFillPatchCheckFill/></i>  CSS</li>
              <li><i><BsFillPatchCheckFill/></i>  Bootstrap</li>
              <li><i><BsFillPatchCheckFill/></i>  React</li>
            </ul>
          </article>
        
        <article className='experience_card'>
            <h2>Back End</h2>
            <ul>
              <li><i><BsFillPatchCheckFill/></i>  Java</li>
              <li><i><BsFillPatchCheckFill/></i>  Spring</li>
              <li><i><BsFillPatchCheckFill/></i>  Jquery</li>
              <li><i><BsFillPatchCheckFill/></i>  MySQL</li>
            </ul>
          </article>
        
        <article className='experience_card'>
            <h2>Tools & Platforms</h2>
            <ul>
              <li><i><BsFillPatchCheckFill/></i>  Mulesoft </li>
              <li><i><BsFillPatchCheckFill/></i>  Git </li>
              <li><i><BsFillPatchCheckFill/></i>  Eclipse & Visual Studio</li>
              <li><i><BsFillPatchCheckFill/></i>  Azure</li>
            </ul>
          </article>
          
        </div><br></br>
        <p className='experience_para'>
            <small>Tata Consultancy Services</small> <strong>/ DEVELOPER</strong><br></br>
            Building an end-to-end B2C e-commerce website consuming all the capabilities provided by SAP HYBRIS Cloud.( Java Spring Boot ) <br></br>Involving CI/CD with Testing. 
             Building an API with Batch ETL / CRUD  Integrations provides all the extract/transform/load tools needed for connecting to data sources,<br></br> 
              extracting and transforming data, and passing it along to the Amazon S3 bucket & MySQL Server using Mulesoft .
              <br></br>Working on a Data Migration Project utilizing Mulesoft and various AWS Services like Redshift, S3, Glue, Cloudwatch, and Lambda. 
            </p>
      </div>
    </section>
    
  )
}

export default Experience