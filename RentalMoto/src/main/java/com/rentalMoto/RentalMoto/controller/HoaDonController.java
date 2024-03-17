package com.rentalMoto.RentalMoto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.HoaDon;
import com.rentalMoto.RentalMoto.services.HoaDonService;

@RestController
@CrossOrigin
public class HoaDonController {
	@Autowired
	HoaDonService Service;
	
	@GetMapping("/list-hoa-don/{id}")
	public List<HoaDon> getListHoaDonByIdDoiTac(@PathVariable String id) {
		try {
			int idDoiTac = Integer.parseInt(id);
			return Service.getListHoaDonByIdDoiTac(idDoiTac);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@PostMapping("/save-hoa-don")
	public boolean saveHoaDon(@RequestBody HoaDon hoadon) {
		return Service.saveHoaDon(hoadon);
	}
}
