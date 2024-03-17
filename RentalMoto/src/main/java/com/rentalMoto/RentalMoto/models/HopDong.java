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
public class HopDong {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date ngay_tao;
	private Date ngay_bat_dau;
	private Date ngay_ket_thuc;
	private String ghichu;
	private String dieu_khoan;
	
	@ManyToOne
	@JoinColumn(name = "doitac_id",referencedColumnName = "id")
	@JsonBackReference
	private DoiTac doitac;
	
	@ManyToOne
	@JoinColumn(name = "nhan_vien_quan_ly_id",referencedColumnName = "id")
	private NhanVienQuanLy quanly;
	
	@OneToMany(mappedBy = "hopdong",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<XeMayHopDong> listXeMayHopDong = new ArrayList<>();
	
}
