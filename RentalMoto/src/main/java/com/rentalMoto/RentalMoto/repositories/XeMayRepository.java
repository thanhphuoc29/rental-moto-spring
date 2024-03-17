package com.rentalMoto.RentalMoto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalMoto.RentalMoto.models.XeMay;

@Repository
public interface XeMayRepository extends JpaRepository<XeMay, Integer>{

}
