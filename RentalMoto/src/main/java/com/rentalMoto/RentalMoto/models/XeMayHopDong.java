package com.rentalMoto.RentalMoto.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class XeMayHopDong {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float gia_thue;
	private String mo_ta;
	private Date ngay_nhan;
	private Date ngay_tra;
	
	@ManyToOne
	@JoinColumn(name = "hop_dong_id",referencedColumnName = "id")
	@JsonBackReference
	private HopDong hopdong;
	
	@ManyToOne
	@JoinColumn(name = "xe_may_id")
	private XeMay xemay;
	
	@OneToMany(mappedBy = "xeMayHopDong",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<LoiXeChiTiet> listLoiXe = new ArrayList<>();
}
