package com.rentalMoto.RentalMoto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalMoto.RentalMoto.models.HoaDon;
import com.rentalMoto.RentalMoto.models.LoiXeChiTiet;
import com.rentalMoto.RentalMoto.models.XeMayHopDong;
import com.rentalMoto.RentalMoto.repositories.HoaDonRepository;
import com.rentalMoto.RentalMoto.repositories.LoiXeChiTietRepository;

@Service
public class HoaDonService {
	@Autowired
	HoaDonRepository HoaDonRepo;
	
	@Autowired
	LoiXeChiTietRepository LoiXeChiTietRepo;
	
	public List<HoaDon> getListHoaDonByIdDoiTac(int id) {
		try {
			return HoaDonRepo.findByIdDoiTac(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean saveHoaDon(HoaDon hoadon) {
		boolean ok = false;
		try {
			if(hoadon.getId() == 0 && hoadon.getHopdong() != null && HoaDonRepo.isExist(hoadon.getHopdong().getId(), hoadon.getNgay_thanh_toan()) != 0) {
				return false;
			}
			for (XeMayHopDong xehd : hoadon.getHopdong().getListXeMayHopDong()) {
				for (LoiXeChiTiet loixe : xehd.getListLoiXe()) {
					if(loixe.getId() == 0) {
						LoiXeChiTietRepo.save(loixe);
					}
				}
			}
			HoaDonRepo.save(hoadon);
			//trường hợp thanh toán 1 phần sẽ tạo ra hóa đơn mới
			if(hoadon.getTong_thanh_toan() != hoadon.getSo_tien_thuc_nhan()) {
				HoaDon newHoaDon = new HoaDon();
			    newHoaDon.setSo_tien_da_thanh_toan(hoadon.getSo_tien_thuc_nhan());
			    newHoaDon.setTong_thanh_toan(hoadon.getTong_thanh_toan() - hoadon.getSo_tien_thuc_nhan());
			    newHoaDon.setTrang_thai_thanh_toan(false);
			    newHoaDon.setSo_tien_thuc_nhan(0);
			    newHoaDon.setHopdong(hoadon.getHopdong());
			    newHoaDon.setNgay_tao(new java.sql.Date(System.currentTimeMillis()));
			    newHoaDon.setNvql(hoadon.getNvql());
			    
			    HoaDonRepo.save(newHoaDon);
			}
			ok = true;
		} catch (Exception e) {
			ok = false;
			e.printStackTrace();
		}
		return ok;
	}
}
