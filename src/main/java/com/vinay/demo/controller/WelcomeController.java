package com.vinay.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class WelcomeController {
	
	
	@GetMapping(value = "/getData", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getWelcome(){
		
		return new ResponseEntity<String>("Welcome", HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/getData/{data}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getWelcome(@PathVariable(name = "data") String name){
		
		
		if(name.equalsIgnoreCase("vinay")) {
			return new ResponseEntity<String>("Male", HttpStatus.OK); 
		}else if(name.equalsIgnoreCase("megha")) {
			return new ResponseEntity<String>("Female", HttpStatus.OK); 
		}else {
			return new ResponseEntity<String>("Dont know", HttpStatus.OK); 
		}
		
		
	}

}
