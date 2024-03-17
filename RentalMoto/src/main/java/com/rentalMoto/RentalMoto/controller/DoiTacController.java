package com.rentalMoto.RentalMoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.DoiTac;
import com.rentalMoto.RentalMoto.services.DoiTacService;

@CrossOrigin
@RestController
public class DoiTacController {
	@Autowired
	DoiTacService Service;
	
	@GetMapping("delete/{id}")
	public boolean DeleteDoiTacById(@PathVariable String id) {
		boolean ok = false;
		try {
			ok = Service.deleteDoiTacById(Integer.parseInt(id));
		} catch (Exception e) {
			ok = false;
		}
		return ok;
	}
	@GetMapping("DoiTacByName/{name}")
	public List<DoiTac> ListDoiTacByName(@PathVariable String name) {
		return Service.getListDoiTacByName(name);
	}
	
	@PostMapping("/update-doi-tac")
	public boolean updateDoiTac(@RequestBody DoiTac doitac) {
		return Service.updateDoiTac(doitac);
	}
}
