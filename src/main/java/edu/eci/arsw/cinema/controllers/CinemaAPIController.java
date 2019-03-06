/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.cinema.controllers;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import edu.eci.arsw.cinema.persistence.CinemaPersitence;



@RestController
@Service

public class CinemaAPIController {
	@Autowired
	private CinemaPersitence cp=null;
	public void setCp(CinemaPersitence cp) {
		this.cp=cp;
	}
	public CinemaPersitence getCp() {
		return cp;
	}
	
	
	@RequestMapping(value = "/cinema",method = RequestMethod.GET)
	public ResponseEntity<?> manejadorGetRecursoCinemaAPIController(){
	    try {
	        //obtener datos que se enviarán a través del API
	        return new ResponseEntity<>(cp.getAllCinemas(),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
	        return new ResponseEntity<>("Error no cinemas found",HttpStatus.NOT_FOUND);
	    }        
	}
	
	@RequestMapping(value="/cinema/{name}",method = RequestMethod.GET)
	public ResponseEntity<?> getRecursosCinemaEspecifico(@PathVariable String name){
		try {
			
	        return new ResponseEntity<>(cp.getCinema(name),HttpStatus.ACCEPTED);
	    } catch (Exception ex) {
	        Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
	        return new ResponseEntity<>("Error "+ex.getMessage(),HttpStatus.NOT_FOUND);
	    }    
		
	}
}
