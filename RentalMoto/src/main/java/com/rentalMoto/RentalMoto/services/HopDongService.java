package com.rentalMoto.RentalMoto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.HopDong;
import com.rentalMoto.RentalMoto.models.XeMay;
import com.rentalMoto.RentalMoto.models.XeMayHopDong;
import com.rentalMoto.RentalMoto.repositories.HopDongRepository;
import com.rentalMoto.RentalMoto.repositories.XeMayHopDongRepository;
import com.rentalMoto.RentalMoto.repositories.XeMayRepository;

@Service
public class HopDongService {
	@Autowired
	HopDongRepository HopDongRepo;
	@Autowired
	XeMayRepository XeMayRepo;
	
	@Autowired
	XeMayHopDongRepository XeMayHopDongRepo;
	
	public boolean saveHopDong(HopDong hopdong) {

		try {
			for(XeMayHopDong xehd : hopdong.getListXeMayHopDong()) {
				if(XeMayHopDongRepo.hasSameContract(xehd.getXemay().getId(), xehd.getNgay_nhan(), xehd.getNgay_tra()) != 0) {
					return false;
				}
				XeMay xe = xehd.getXemay();
				if(xe.getId() == 0) {
					XeMayRepo.save(xe);
				}
			}
			HopDong check = HopDongRepo.save(hopdong);
		return check != null;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
