/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.cinema.controllers;


import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import edu.eci.arsw.cinema.persistence.CinemaPersitence;



@RestController
@Service
@RequestMapping(value = "/cinema")
public class CinemaAPIController {
	@Autowired
	private CinemaPersitence cp=null;
	public void setCp(CinemaPersitence cp) {
		this.cp=cp;
	}
	public CinemaPersitence getCp() {
		return cp;
	}
	 
@RequestMapping(method = RequestMethod.GET)
public ResponseEntity<?> manejadorGetRecursoCinemaAPIController(){
    try {
        //obtener datos que se enviarán a través del API
        return new ResponseEntity<>(cp.getAllCinemas(),HttpStatus.ACCEPTED);
    } catch (Exception ex) {
        Logger.getLogger(CinemaAPIController.class.getName()).log(Level.SEVERE, null, ex);
        return new ResponseEntity<>("Error bla bla bla",HttpStatus.NOT_FOUND);
    }        
}
}
