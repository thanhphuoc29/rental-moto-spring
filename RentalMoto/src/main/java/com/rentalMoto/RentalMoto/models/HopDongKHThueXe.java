package com.rentalMoto.RentalMoto.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HopDongKHThueXe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date ngay_tao;
	private Date ngay_bat_dau;
	private Date ngay_ket_thuc;
	private String ghi_chu;
	
	@ManyToOne
	@JoinColumn(name = "hoa_don_doi_tac_id",referencedColumnName = "id")
	@JsonBackReference
	private HoaDon hoa_don_doi_tac;
	
	@ManyToOne
	@JoinColumn(name = "kh_id",referencedColumnName = "id")
	private KhachHang khach_hang;
}
