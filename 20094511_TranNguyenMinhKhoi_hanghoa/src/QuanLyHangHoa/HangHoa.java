package QuanLyHangHoa;

import java.text.DecimalFormat;

public abstract class HangHoa {
	protected String maHang;
	protected String tenHang;
	protected double soLuongTon;
	protected double donGia;
	
	public HangHoa(String maHang) throws Exception {
		this(maHang, "xxx", 0.0, 0);
	}
	
	//dong goi
	public String getMaHang() {
		return maHang;
	}
	public void setMaHang(String maHang) throws Exception {
		if (maHang != null) {
			this.maHang = maHang;
		}else {
			throw new Exception("Lỗi! Mã hàng không được rỗng");
		}	
	}
	public String getTenhang() {
		return tenHang;
	}
	public void setTenhang(String tenhang) throws Exception {
		if (tenHang != null) {
			this.tenHang = tenHang;
		}else {
			throw new Exception("Lỗi! Tên hàng không được rỗng");
		}
	}
	public double getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) throws Exception {
		if(soLuongTon >= 0) {
			this.soLuongTon = soLuongTon;
		}else {
			throw new Exception("Lỗi! Số lượng tồn phải lớn hơn hoặc bằng 0");
		}
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if (donGia > 0) {
			this.donGia = donGia;
		}else {
			throw new Exception("Lỗi! đơn giá phải lớn 0");
		}
	}
	
	//
	public HangHoa(String maHang, String tenHang, double soLuongTon, double donGia) throws Exception {
		if (maHang != null) {
			this.maHang = maHang;
		}else {
			throw new Exception("Lỗi! Mã hàng không được rỗng");
		}
		this.tenHang = tenHang;
		this.soLuongTon = soLuongTon;
		if (donGia > 0) {
			this.donGia = donGia;
		}else {
			throw new Exception("Lỗi! đơn giá phải lớn 0");
		}
	}
	
	//phuong thuc
	public abstract double getTienVAT();
	public abstract String danhGia();
	
	
	@Override
	public String toString() {
//		DecimalFormat df = new DecimalFormat("#,##0, #");
		return String.format("|%10s|%20s|%10s|%10s|%10s|%10s|", getMaHang(), getTenhang(), getSoLuongTon(), getDonGia(),
				getTienVAT(), danhGia());
	}
}
