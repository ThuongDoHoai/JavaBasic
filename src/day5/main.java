package day5;

class giaoVienToan extends giaoVien{	
	@Override
	void chuyenMon() {
		System.out.println("Chuyen Mon Toan");
	}
}

class giaoVienTiengAnh extends giaoVien{	
	@Override
	void chuyenMon() {
		System.out.println("Chuyen Mon Tieng Anh");	
	}
}

public class main {

	public static void main(String[] args) {
		giaoVienToan toan1 = new giaoVienToan();
		giaoVienToan toan2 = new giaoVienToan();
		giaoVienTiengAnh tiengAnh1 = new giaoVienTiengAnh();
		giaoVienTiengAnh tiengAnh2 = new giaoVienTiengAnh();
		
		//Nhap thong tin
		toan1.maGiaoVien = "001";
		toan1.hoTen = "Nguyen Van A";
		toan1.DOB = "15/09/1988";
		toan1.gioiTinh = "Nam";
		toan1.monDay = "Toan";
		
		toan2.maGiaoVien = "002";
		toan2.hoTen = "Nguyen Van B";
		toan2.DOB = "15/09/1988";
		toan2.gioiTinh = "Nan";
		toan2.monDay = "Toan";
		
		tiengAnh1.maGiaoVien = "001";
		tiengAnh1.hoTen = "Nguyen Van C";
		tiengAnh1.DOB = "15/09/1988";
		tiengAnh1.gioiTinh = "Nam";
		tiengAnh1.monDay = "Tieng Anh";
		
		tiengAnh2.maGiaoVien = "004";
		tiengAnh2.hoTen = "Nguyen Van D";
		tiengAnh2.DOB = "15/09/1988";
		tiengAnh2.gioiTinh = "Nam";
		tiengAnh2.monDay = "Tieng Anh";
		
		toan1.inThongTin();
		toan1.chuyenMon();
		System.out.println();
		
		toan2.inThongTin();
		toan2.chuyenMon();
		System.out.println();
				
		tiengAnh1.inThongTin();
		tiengAnh1.chuyenMon();
		System.out.println();
				
		tiengAnh2.inThongTin();
		tiengAnh2.chuyenMon();
	}

}
