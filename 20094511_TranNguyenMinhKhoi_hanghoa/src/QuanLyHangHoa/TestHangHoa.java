package QuanLyHangHoa;

import java.time.LocalDate;

public class TestHangHoa {
	//in tieu de
		public static void inTieuDe() {
			System.out.println("");
			System.out.printf("|%10s|%20s|%10s|%10s|%10s|%10s|", "Ma hang", "Ten hang", "So luong ton", "Don gia",
					"Tien VAT", "Danh Gia");
			System.out.println();
		}
		
		//in khoang cach
				public static void inKhoangCach() {
					for (int i = 0; i < 70; i++) {
						System.out.printf("-");
					}
				}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ListHangHoa ls = new ListHangHoa();
		HangHoa h1 = new HangThucPham("TP1", "Thit heo", 10, 20000, "IUH", LocalDate.of(2024, 01, 01), LocalDate.of(2024, 02, 02));
		ls.themHH(h1);
		
		inTieuDe();
		System.out.println(h1.toString());
		inKhoangCach();
	}
}
