package com.rentalMoto.RentalMoto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.NhanVienQuanLy;
import com.rentalMoto.RentalMoto.repositories.NhanVienQuanLyRepository;

@Service
public class NhanVienQuanLyService {
	@Autowired
	NhanVienQuanLyRepository nvRepo;
	
	public NhanVienQuanLy checkLogin(NhanVienQuanLy nv) {
		NhanVienQuanLy nvql = null;
		try {
			nvql= nvRepo.findByUserNameAndPassword(nv.getUsername(),nv.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return nvql;
	}
}
