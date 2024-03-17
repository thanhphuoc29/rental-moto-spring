package com.rentalMoto.RentalMoto.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class ThanhVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ten;
	private String diachi;
	private String sdt;
	private String email;
	private String so_cmnd;
}
