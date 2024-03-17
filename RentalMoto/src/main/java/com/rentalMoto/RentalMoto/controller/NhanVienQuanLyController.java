package com.rentalMoto.RentalMoto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalMoto.RentalMoto.models.NhanVienQuanLy;
import com.rentalMoto.RentalMoto.services.NhanVienQuanLyService;

@RestController
@CrossOrigin
public class NhanVienQuanLyController {
	@Autowired
	NhanVienQuanLyService Service;
	
	@PostMapping("/checklogin")
	public ResponseEntity<?> checkLogin(@RequestBody NhanVienQuanLy nvql) {
		NhanVienQuanLy nv = Service.checkLogin(nvql);
		if(nv != null) {
			return ResponseEntity.ok(nv);
		} else {
			return ResponseEntity.ok(false);
		}
	}
}
