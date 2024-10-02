package QuanLyHangHoa;

import java.text.DecimalFormat;

public class HangDienMay extends HangHoa{
	
	private int thoiGianBH;
	private double congSuat;
	
	
	//dong goi
	public int getThoiGianBH() {
		return thoiGianBH;
	}

	public void setThoiGianBH(int thoiGianBH) throws Exception {
		if (thoiGianBH >= 0) {
			this.thoiGianBH = thoiGianBH;
		}else {
			throw new Exception("Lỗi! Thời gian bảo hành phải >= 0");
		}
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) throws Exception {
		if (congSuat >= 0) {
			this.congSuat = congSuat;
		}else {
			throw new Exception("Lỗi! Công suất phải >= 0");
		}
	}
	
	
	//phuong thuc
	public HangDienMay(String maHang, String tenhang, double d, double donGia, int thoiGianBH, double congSuat)
			throws Exception {
		super(maHang, tenhang, d, donGia);
		this.thoiGianBH = thoiGianBH;
		this.congSuat = congSuat;
	}
	
	

	public HangDienMay(String maHang, String tenhang, double d, double donGia) throws Exception {
		super(maHang, tenhang, d, donGia);
		// TODO Auto-generated constructor stub
	}

	public HangDienMay(String maHang) throws Exception {
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
		return soLuongTon < 3 ? "bán được" : "";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		DecimalFormat df = new DecimalFormat("#,##0, #");
		String s1 = "";
		s1+=s1.format("|%10s|%10s|", getTienVAT(), danhGia());
		return super.toString()+s1;
	}
}
