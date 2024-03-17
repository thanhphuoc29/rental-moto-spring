package com.rentalMoto.RentalMoto.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "loi_xe_kh_thue")
public class LoiXeKhThue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date ngay_kiem_tra;
	private float don_gia;
	@Column(name = "is_den_bu")
	private boolean is_den_bu;
	private String ghi_chu;
	private int so_luong;
	
	@ManyToOne
	@JoinColumn(name = "xe_kh_thue_id")
	@JsonBackReference
	private XeMayKhThue xe_kh_thue;
	
	@ManyToOne
	@JoinColumn(name = "loi_xe_id")
	private LoiXe loixe;
}
