package it.xuanphong.cau2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DocFileDuLieuDauVao1VaKiemTra {
	/**
	 * Đọc file input1.txt và lưu vào arraylist
	 * @param dsSoTrungThuong
	 * @param path
	 */
	public void nhapDuLieuVao(ArrayList<Integer> dsSoTrungThuong,String path){
		try {
			FileInputStream fIS=new FileInputStream("input1.txt");
			InputStreamReader iSR=new InputStreamReader(fIS);
			BufferedReader bR=new BufferedReader(iSR);
			
			while (true) {
				String soTrungThuong=bR.readLine();
				if (soTrungThuong==null||soTrungThuong=="") {
					break;
				}
				dsSoTrungThuong.add(new Integer(Integer.parseInt(soTrungThuong)));
			}
			bR.close();
		} catch (Exception e) {
			System.out.println("Loi ham doc thong tin 1");
			e.printStackTrace();
		}
	}
	/**
	 * Kiểm tra tính hợp lệ của file kết quả
	 * @param dsSoTrungThuong
	 */
	public void kiemTraDuLieu(ArrayList<Integer> dsSoTrungThuong){
		Boolean namTrongKhoangHopLe=true,khongTrung=true;
		for (Integer integer : dsSoTrungThuong) {
			if(integer<1||integer>45){
				namTrongKhoangHopLe=false;
			}
		}
		
		int count=dsSoTrungThuong.size();
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				if(dsSoTrungThuong.get(i)==dsSoTrungThuong.get(j)&&i!=j){
					khongTrung=false;
				}
			}
		}
		
		if(namTrongKhoangHopLe==false||khongTrung==false){
			System.out.println("Du lieu dau vao khong hop le");
		}
	}
}
