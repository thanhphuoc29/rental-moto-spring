package com.rentalMoto.RentalMoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.HopDong;

@Repository
public interface HopDongRepository extends JpaRepository<HopDong, Integer>{

}
