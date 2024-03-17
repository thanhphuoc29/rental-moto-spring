package com.rentalMoto.RentalMoto.models;

import java.sql.Date;
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
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class HoaDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date ngay_tao;
	private Date ngay_thanh_toan;
	private float so_tien_da_thanh_toan;
	private float so_tien_thuc_nhan;
	private float tong_thanh_toan;
	private String ghichu;
	private boolean trang_thai_thanh_toan;
	
	@ManyToOne
	@JoinColumn(name = "hop_dong_id",referencedColumnName = "id")
	private HopDong hopdong;
	
	@ManyToOne
	@JoinColumn(name = "nvql_id",referencedColumnName = "id")
	private NhanVienQuanLy nvql;
	
	@OneToMany(mappedBy = "hoa_don_doi_tac",cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<HopDongKHThueXe> lichSuKhachHang = new ArrayList<>();
}
