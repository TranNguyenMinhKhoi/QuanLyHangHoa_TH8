package QuanLyHangHoa;

import java.util.ArrayList;
import java.util.List;

public class ListHangHoa {
	List<HangHoa> ls;
	public ListHangHoa() {
		ls = new ArrayList<HangHoa>(2);
	}
	
	public boolean themHH(HangHoa h) {
		if (!ls.contains(h)) {
			return false;
		}else {
			return ls.add(h);
		}
	}
	
	//xuat giao dich
	public List<HangHoa> getAll(){
		return ls;
	}
	
	//sap xep
	public HangHoa tim(String ma) {
		for (HangHoa hangHoa : ls) {
			if (hangHoa.getMaHang().equalsIgnoreCase(ma))
				return hangHoa;
		}
		return null;
	}
	
	//xoa giao dich
	public boolean xoaHH (String maHang) {
		if (tim(maHang) != null)
			ls.remove(maHang);
		return false;
	}
}
