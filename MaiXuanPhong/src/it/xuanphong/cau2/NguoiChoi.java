package it.xuanphong.cau2;

public class NguoiChoi {
	private String hoTen;
	private String diaChi;
	private String soDienThoai;
	private int soLuongVeDaMua;
	private int soDuocChon1;
	private int soDuocChon2;
	private int soDuocChon3;
	private int soDuocChon4;
	private int soDuocChon5;
	private int soDuocChon6;
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public int getSoLuongVeDaMua() {
		return soLuongVeDaMua;
	}
	public void setSoLuongVeDaMua(int soLuongVeDaMua) {
		this.soLuongVeDaMua = soLuongVeDaMua;
	}
	public int getSoDuocChon1() {
		return soDuocChon1;
	}
	public void setSoDuocChon1(int soDuocChon1) {
		this.soDuocChon1 = soDuocChon1;
	}
	public int getSoDuocChon2() {
		return soDuocChon2;
	}
	public void setSoDuocChon2(int soDuocChon2) {
		this.soDuocChon2 = soDuocChon2;
	}
	public int getSoDuocChon3() {
		return soDuocChon3;
	}
	public void setSoDuocChon3(int soDuocChon3) {
		this.soDuocChon3 = soDuocChon3;
	}
	public int getSoDuocChon4() {
		return soDuocChon4;
	}
	public void setSoDuocChon4(int soDuocChon4) {
		this.soDuocChon4 = soDuocChon4;
	}
	public int getSoDuocChon5() {
		return soDuocChon5;
	}
	public void setSoDuocChon5(int soDuocChon5) {
		this.soDuocChon5 = soDuocChon5;
	}
	public int getSoDuocChon6() {
		return soDuocChon6;
	}
	public void setSoDuocChon6(int soDuocChon6) {
		this.soDuocChon6 = soDuocChon6;
	}
	public NguoiChoi(String hoTen, String diaChi, String soDienThoai, int soLuongVeDaMua, int soDuocChon1,
			int soDuocChon2, int soDuocChon3, int soDuocChon4, int soDuocChon5, int soDuocChon6) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.soLuongVeDaMua = soLuongVeDaMua;
		this.soDuocChon1 = soDuocChon1;
		this.soDuocChon2 = soDuocChon2;
		this.soDuocChon3 = soDuocChon3;
		this.soDuocChon4 = soDuocChon4;
		this.soDuocChon5 = soDuocChon5;
		this.soDuocChon6 = soDuocChon6;
	}
	public NguoiChoi() {
		super();
	}
	@Override
	public String toString() {
		return "NguoiChoi [hoTen=" + hoTen + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", soLuongVeDaMua="
				+ soLuongVeDaMua + ", soDuocChon1=" + soDuocChon1 + ", soDuocChon2=" + soDuocChon2 + ", soDuocChon3="
				+ soDuocChon3 + ", soDuocChon4=" + soDuocChon4 + ", soDuocChon5=" + soDuocChon5 + ", soDuocChon6="
				+ soDuocChon6 + "]";
	}
	
	
}
