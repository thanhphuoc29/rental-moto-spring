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
public class LoiXeChiTiet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float don_gia;
	private String mo_ta;
	private Date ngay_kiem_tra;
	private int so_luong;
	private boolean isdenbu;
	
	@ManyToOne
	@JoinColumn(name = "loi_xe_id",referencedColumnName = "id")
	private LoiXe loixe;
	@ManyToOne
	@JoinColumn(name = "xe_may_hop_dong_id",referencedColumnName = "id")
	@JsonBackReference
	private XeMayHopDong xeMayHopDong;
}
