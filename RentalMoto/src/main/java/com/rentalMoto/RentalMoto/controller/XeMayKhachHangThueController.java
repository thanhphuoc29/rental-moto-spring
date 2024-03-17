package com.rentalMoto.RentalMoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.XeMayKhThue;
import com.rentalMoto.RentalMoto.services.XeMayKhThueService;

@RestController
@CrossOrigin
public class XeMayKhachHangThueController {
	@Autowired
	private XeMayKhThueService Service;
	
	@GetMapping("/lich-su-xe/{id}")
	public List<XeMayKhThue> getLichSuKhThueXe(@PathVariable String id) {
		try {
			int idXe = Integer.parseInt(id);
			return Service.getLichSuKhThueXeBuIdXe(idXe);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
