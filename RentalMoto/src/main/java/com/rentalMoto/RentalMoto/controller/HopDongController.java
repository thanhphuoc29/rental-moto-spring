package com.rentalMoto.RentalMoto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.HopDong;
import com.rentalMoto.RentalMoto.services.HopDongService;

@RestController
@CrossOrigin
public class HopDongController {
	@Autowired
	HopDongService Service;
	
	@PostMapping("/save-hopdong")
	public boolean saveHopDong(@RequestBody HopDong hopdong) {
		return Service.saveHopDong(hopdong);
	}
}
