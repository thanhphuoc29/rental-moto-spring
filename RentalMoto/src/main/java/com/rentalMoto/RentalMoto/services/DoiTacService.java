package com.rentalMoto.RentalMoto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.DoiTac;
import com.rentalMoto.RentalMoto.repositories.DoiTacRepository;

@Service
public class DoiTacService {
	@Autowired
	DoiTacRepository DoiTacRepo;
	
	
	public List<DoiTac> getListDoiTacByName(String name) {
		try {
			return DoiTacRepo.findByName(name);
		} catch (Exception e) {
			return null;
		}
	}
	
	public boolean updateDoiTac(DoiTac doitac) {
		DoiTac check = DoiTacRepo.save(doitac);
		return check != null;
	}
	
	public boolean deleteDoiTacById(int id) {
		boolean status = false;
		try {
			DoiTacRepo.deleteById(id);
			status = true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}
}
