package com.iskaz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iskaz.model.Odjel;
import com.iskaz.service.OdjelService;

@RestController
public class Rest {

	@Autowired
	OdjelService odjelService;

	@PostMapping("/odjel/{brOdjela}")
	public void addOdjel(@PathVariable int brOdjela) {
		odjelService.addOdjel(brOdjela);
	}
	
	@GetMapping("/odjel/{brOdjela}")
	public Odjel getOdjel(@PathVariable int brOdjela) {
		return odjelService.getOdjel(brOdjela);
	}
	
	@PutMapping("/odjel/{brOdjela}/{newbBrOdjela}")
	public void updateOdjel(@PathVariable int brOdjela,@PathVariable int  newbBrOdjela ) {
		 odjelService.updateOdjel(brOdjela,newbBrOdjela);
	}
	
	@DeleteMapping("/odjel/{brOdjela}")
	public void deleteOdjel(@PathVariable int brOdjela) {
		 odjelService.deleteOdjel(brOdjela);
	}
	
}
