package it.xuanphong.cau2;

import java.util.ArrayList;

public class Run {
	public static ArrayList<Integer> dsSoTrungThuong=new ArrayList<>();
	public static ArrayList<NguoiChoi> dsNguoiChoi=new ArrayList<>();
	public static void main(String[] args) {
		KetNoiCSDL kn=new KetNoiCSDL();
		kn.KetNoiSQL();
		DocFileDuLieuDauVao1VaKiemTra read1=new DocFileDuLieuDauVao1VaKiemTra();
		read1.nhapDuLieuVao(dsSoTrungThuong, "input.txt");
		read1.kiemTraDuLieu(dsSoTrungThuong);
		DocDuLieuDauVao2VaKiemTra read2=new DocDuLieuDauVao2VaKiemTra();
		read2.nhapDuLieuVao(dsNguoiChoi, "input2.txt");
		XuatDanhSachTrungThuong x=new XuatDanhSachTrungThuong();
		x.xuatDanhSach(dsNguoiChoi, "output.txt", dsSoTrungThuong);
		
	}

}
