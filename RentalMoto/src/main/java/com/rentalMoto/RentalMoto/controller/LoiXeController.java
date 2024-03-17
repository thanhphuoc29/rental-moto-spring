package com.rentalMoto.RentalMoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.LoiXe;
import com.rentalMoto.RentalMoto.services.LoiXeService;

@RestController
@CrossOrigin
public class LoiXeController {
	
	@Autowired
	LoiXeService Service;
	
	@GetMapping("/list-loi-xe")
	public List<LoiXe> ListLoiXe() {
		return Service.getListLoiXe();
	}
}
