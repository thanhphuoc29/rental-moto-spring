package com.rentalMoto.RentalMoto.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class LoiXe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ten_loi;
	private float don_gia;
}
