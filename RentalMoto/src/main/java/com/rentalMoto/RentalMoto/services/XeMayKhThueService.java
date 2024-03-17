package com.rentalMoto.RentalMoto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.XeMayKhThue;
import com.rentalMoto.RentalMoto.repositories.XeMayKhThueRepository;

@Service
public class XeMayKhThueService {
	
	@Autowired
	private XeMayKhThueRepository XeMayKhThueRepo;
	
	public List<XeMayKhThue> getLichSuKhThueXeBuIdXe(int id) {
		try {
			return XeMayKhThueRepo.findByIdXe(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
