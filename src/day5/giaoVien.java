package day5;

public abstract class giaoVien {
	protected String maGiaoVien;
	protected String hoTen;
	protected String DOB;
	protected String gioiTinh;
	protected String monDay;
				
	public void inThongTin() {
		System.out.println("Ma giao vien: "+ maGiaoVien);
		System.out.println("Ho Ten: " + hoTen);
		System.out.println("Ngay thang nam sinh" + DOB);
		System.out.println("Gioi tinh: " + gioiTinh);
		System.out.println("Mon day: " + monDay);	
	}
	
	abstract void chuyenMon();
}
