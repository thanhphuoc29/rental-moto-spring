package com.rentalMoto.RentalMoto.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class DoiTac extends ThanhVien{
	private String ghichu;
	
	@OneToMany(mappedBy = "doitac",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HopDong> listHopDong = new ArrayList<>();
}
