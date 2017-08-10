package it.xuanphong.cau2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DocDuLieuDauVao2VaKiemTra {
	/**
	 * Nhập thông tin ngừoi chơi vào mảng Arraylist
	 * @param dsNguoiChoi
	 * @param path
	 */
	public void nhapDuLieuVao(ArrayList<NguoiChoi> dsNguoiChoi,String path){
		try {
			FileInputStream fIS=new FileInputStream(path);
			InputStreamReader iSR=new InputStreamReader(fIS);
			BufferedReader bR=new BufferedReader(iSR);
			int countLine=1;
			while (true) {
				String readLine=bR.readLine();
				if(readLine==null||readLine==""){
					break;
				}
				String[] info=readLine.split("[,]");
				int so1=Integer.parseInt(info[3]),so2=Integer.parseInt(info[4]),so3=Integer.parseInt(info[5]),so4=Integer.parseInt(info[6]),so5=Integer.parseInt(info[7]),so6=Integer.parseInt(info[8]);
				boolean kTra=kiemTraDuLieu(so1,so2,so3,so4,so5,so6);
				
				if(info.length==9&&kTra==true){
					NguoiChoi n=new NguoiChoi();
					n.setHoTen(info[0]);
					n.setDiaChi(info[1]);
					n.setSoDienThoai(info[2]);
					n.setSoLuongVeDaMua(1);
					n.setSoDuocChon1(Integer.parseInt(info[3]));
					n.setSoDuocChon2(Integer.parseInt(info[4]));
					n.setSoDuocChon3(Integer.parseInt(info[5]));
					n.setSoDuocChon4(Integer.parseInt(info[6]));
					n.setSoDuocChon5(Integer.parseInt(info[7]));
					n.setSoDuocChon6(Integer.parseInt(info[8]));
					
					dsNguoiChoi.add(n);
				}
				else {
					System.out.println("Ve du thuong o dong so "+countLine+" khong hop le");
				}
				countLine++;
			}
		} catch (Exception e) {
			System.out.println("Loi ham doc file 2");
			e.printStackTrace();
		}
	}

	private boolean kiemTraDuLieu(Integer so1,Integer so2,Integer so3,Integer so4,Integer so5,Integer so6) {
		int[] so=new int[]{so1,so2,so3,so4,so5,so6};
		boolean khongTrung=true,namTrongKhoangHopLe=true,sapXepTangDan=true;
		
		for (int i : so) {
			if(i<1||i>45)
				namTrongKhoangHopLe=false;	
		}
		
		for (int i = 0; i < so.length; i++) {
			for (int j = 0; j < so.length; j++) {
				if(so[i]==so[j]&&j!=i)
					khongTrung=false;
				
			}
		}
		
		for (int i = 0; i < so.length-1; i++) {
			if(so[i]>so[i+1])
				sapXepTangDan=false;
		}
		if(khongTrung==true&& namTrongKhoangHopLe==true&& sapXepTangDan==true)
			return true;
		return false;
	}
}
