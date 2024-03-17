package com.rentalMoto.RentalMoto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.LoiXe;
import com.rentalMoto.RentalMoto.repositories.LoiXeRepository;

@Service
public class LoiXeService {
	
	@Autowired
	LoiXeRepository LoiXeRepo;
	
	public List<LoiXe> getListLoiXe() {
		try {
			return LoiXeRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
