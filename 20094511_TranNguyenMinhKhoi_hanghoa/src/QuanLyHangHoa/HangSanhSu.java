package QuanLyHangHoa;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HangSanhSu extends HangHoa{

	private String nhaSX;
	private LocalDate ngayNhapKho;
	
	
	
	public String getNhaSX() {
		return nhaSX;
	}

	public void setNhaSX(String nhaSX) {
		this.nhaSX = nhaSX;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) throws Exception {
		if (ngayNhapKho.isAfter(LocalDate.now())) {
			this.ngayNhapKho = ngayNhapKho;
		}else {
			throw new Exception("Ngày nhập kho phải trước ngày hiện tại");
		}
	}
	
	

	public HangSanhSu(String maHang, String tenhang, double d, double donGia, String nhaSX, LocalDate ngayNhapKho)
			throws Exception {
		super(maHang, tenhang, d, donGia);
		this.nhaSX = nhaSX;
		this.ngayNhapKho = ngayNhapKho;
	}

	public HangSanhSu(String maHang, String tenhang, double d, double donGia) throws Exception {
		super(maHang, tenhang, d, donGia);
		// TODO Auto-generated constructor stub
	}

	public HangSanhSu(String maHang) throws Exception {
		super(maHang);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTienVAT() {
		// TODO Auto-generated method stub
		return donGia * 0.1;
	}

	@Override
	public String danhGia() {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		long ngayLuuKho = Math.abs(ChronoUnit.DAYS.between(ngayNhapKho, now));
		return soLuongTon > 50 && ngayLuuKho > 10 ? "bán chậm" : "";
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		DecimalFormat df = new DecimalFormat("#,##0, #");
		String s2 = "";
		s2+=s2.format("|%10s|%10s|", getTienVAT(), danhGia());
		return super.toString()+s2;
	}
}
