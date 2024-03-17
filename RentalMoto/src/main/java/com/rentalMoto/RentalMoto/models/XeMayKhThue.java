package com.rentalMoto.RentalMoto.models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "xe_may_kh_thue")
public class XeMayKhThue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float gia_thue;
	private String ghichu;
	private float giam_gia;
	
	@ManyToOne
	@JoinColumn(name = "hop_dong_kh_id",referencedColumnName = "id")
	private HopDongKHThueXe hop_dong_kh;
	
	@ManyToOne
	@JoinColumn(name = "xe_may_id")
	private XeMay xe_may;
	
	@OneToMany(mappedBy = "xe_kh_thue",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<LoiXeKhThue> list_loi_xe = new ArrayList<>();
}
