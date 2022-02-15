package tuan2;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class SinhVien {
	private String maSinhVien;
	private String hoTenSV;
	private int tuoiSV;
	private GregorianCalendar ngayThi;
	
	public GregorianCalendar getNgayThi() {
		return ngayThi;
	}
	public void setNgayThi(GregorianCalendar ngayThi) {
		this.ngayThi = ngayThi;
	}
	// property get và set
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoTenSV() {
		return hoTenSV;
	}
	public void setHoTenSV(String hoTenSV) {
		this.hoTenSV = hoTenSV;
	}
	public int getTuoiSV() {
		return tuoiSV;
	}
	public void setTuoiSV(int tuoiSV) {
		this.tuoiSV = tuoiSV;
	}
	// Tao constructor
	public SinhVien() {
		
	}
	public SinhVien(String maSinhVien, String hoTenSV, int tuoiSV, GregorianCalendar ngThi) {
		this.maSinhVien = maSinhVien;
		this.hoTenSV = hoTenSV;
		this.tuoiSV = tuoiSV;
		this.ngayThi=ngThi;
	}
	public boolean soSanh(int a, int b) {
		if (a>b) {
			return true;
		} else {
			return false;
		}
	}
	public void tieuDe() {
		for (int i = 0; i < 55; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%12s|%-25s|%5s|%8s|\n","Ma Sinh Vien","Ho ten Sinh vien","Tuoi", "Ngay thi");
		for (int i = 0; i < 55; i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	public String toString() {
		String s="";
		s+=s.format("|%-12s|%-27s|%5s|%8s|",getMaSinhVien(), getHoTenSV(), getTuoiSV(),df.format(getNgayThi().getTime().getTime()));
		return s;
	}
	
	
	

}
