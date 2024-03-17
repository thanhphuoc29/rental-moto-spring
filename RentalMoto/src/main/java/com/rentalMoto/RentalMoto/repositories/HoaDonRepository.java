package com.rentalMoto.RentalMoto.repositories;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.HoaDon;

@Repository
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer>{
	@Query(value = "SELECT hd.* FROM hoa_don as hd, hop_dong WHERE hd.hop_dong_id = hop_dong.id AND hop_dong.doitac_id = ?1 ", nativeQuery = true)
	List<HoaDon> findByIdDoiTac(int id);
	
	@Query(value = "SELECT COUNT(*) FROM hoa_don WHERE hop_dong_id = ?1 AND DATEDIFF(?2, ngay_thanh_toan) < 30;",nativeQuery = true)
	int isExist(int id,Date payment_date);
}
