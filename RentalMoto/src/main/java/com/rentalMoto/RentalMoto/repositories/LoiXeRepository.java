package com.rentalMoto.RentalMoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.LoiXe;

@Repository
public interface LoiXeRepository extends JpaRepository<LoiXe, Integer>{

}
