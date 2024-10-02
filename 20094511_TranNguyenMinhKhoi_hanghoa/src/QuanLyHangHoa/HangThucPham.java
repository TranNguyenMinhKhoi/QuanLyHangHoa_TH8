package QuanLyHangHoa;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class HangThucPham extends HangHoa{
	private String nhaCungCap;
	private LocalDate ngaySX;
	private LocalDate ngayHetHan;
	
	//dong goi
	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(LocalDate ngaySX) throws Exception {
		if (ngaySX.isAfter(LocalDate.now())) {
			this.ngaySX = ngaySX;
		}else {
			throw new Exception("Ngày sản xuất phải trước ngày hiện tại");
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) throws Exception {
		if (ngayHetHan.isBefore(ngaySX)) {
			this.ngaySX = ngaySX;
		}else {
			throw new Exception("Ngày hết hạn phải sau ngày sản xuất");
		}
	}
	
	//phuong thuc
	public HangThucPham(String maHang, String tenhang, double d, double donGia) throws Exception {
		super(maHang, tenhang, d, donGia);
		// TODO Auto-generated constructor stub
	}
	public HangThucPham(String maHang, String tenhang, double d, double donGia, String nhaCungCap, LocalDate ngaySX,
			LocalDate ngayHetHan) throws Exception {
		super(maHang, tenhang, d, donGia);
		this.nhaCungCap = nhaCungCap;
		this.ngaySX = ngaySX;
		this.ngayHetHan = ngayHetHan;
	}

	@Override
	public double getTienVAT() {
		// TODO Auto-generated method stub
		return donGia * 0.05;
	}
	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		return (soLuongTon > 0 && ngayHetHan.isBefore(now)) ? "Khó bán" : "";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		DecimalFormat df = new DecimalFormat("#,##0, #");
		String s3 = "";
		s3+=s3.format("|%10s|%10s|", getTienVAT(), danhGia());
		return super.toString()+s3;
	}
}
