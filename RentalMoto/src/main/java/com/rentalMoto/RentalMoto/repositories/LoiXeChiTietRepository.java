package com.rentalMoto.RentalMoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.LoiXeChiTiet;

@Repository
public interface LoiXeChiTietRepository extends JpaRepository<LoiXeChiTiet, Integer>{

}
