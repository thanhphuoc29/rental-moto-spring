package com.rentalMoto.RentalMoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.NhanVienQuanLy;

@Repository
public interface NhanVienQuanLyRepository extends JpaRepository<NhanVienQuanLy, Integer>{
	@Query(value = "SELECT * FROM nhan_vien_quan_ly WHERE username = ?1 AND password = ?2", nativeQuery = true)
	NhanVienQuanLy findByUserNameAndPassword(String username, String password);
}
