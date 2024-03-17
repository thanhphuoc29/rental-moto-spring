package com.rentalMoto.RentalMoto.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class NhanVienQuanLy extends ThanhVien{
	private String username;
	private String password;
	private String chucvu;
	
}
