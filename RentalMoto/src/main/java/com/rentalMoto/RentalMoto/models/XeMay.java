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
public class XeMay {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ten;
	private String hang;
	private String bienso;
	private String doi_xe;
	private String loai_xe;
	private String mota;
	
}
