package com.rentalMoto.RentalMoto.repositories;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.XeMayHopDong;

@Repository
public interface XeMayHopDongRepository extends JpaRepository<XeMayHopDong, Integer>{
	@Query(value = "SELECT COUNT(*) FROM xe_may_hop_dong as xehd WHERE xe_may_id = ?1 AND ((?2 >= xehd.ngay_nhan AND ?2 <= xehd.ngay_tra) OR (?3 >= xehd.ngay_nhan AND ?3 <= xehd.ngay_tra))", nativeQuery = true)
	int hasSameContract(int idXe,Date ngay_nhan, Date ngay_tra);
}
