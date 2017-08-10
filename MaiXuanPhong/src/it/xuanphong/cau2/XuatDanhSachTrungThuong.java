package it.xuanphong.cau2;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class XuatDanhSachTrungThuong {
	public void xuatDanhSach(ArrayList<NguoiChoi> dsNguoiChoi,String path,ArrayList<Integer> dsSoTrungThuong){
		try {
			FileOutputStream fOS=new FileOutputStream(path);
			OutputStreamWriter oSW=new OutputStreamWriter(fOS);	
			PrintWriter pW=new PrintWriter(oSW);
			
			int[] daIn=new int[dsNguoiChoi.size()];
			int countLine=0;
			int soGiaiDacBiet=1,soGiaiNhat=0,soGiaiNhi=0,soGiaiBa=0;
			
			String stTienGiaiDacBiet = null;
			for (NguoiChoi n1 : dsNguoiChoi) {
				String giai=Giai(n1.getSoDuocChon1(),
						n1.getSoDuocChon2(),
						n1.getSoDuocChon3(), 
						n1.getSoDuocChon4(), 
						n1.getSoDuocChon5(),
						n1.getSoDuocChon6(),dsSoTrungThuong);
				
				if(giai!=null){
					if(giai.equalsIgnoreCase("Dac Biet"))
						soGiaiDacBiet++;
					if(giai.equalsIgnoreCase("Giai Nhat"))
						soGiaiNhat++;
					if(giai.equalsIgnoreCase("Giai Nhi"))
						soGiaiNhi++;
					if(giai.equalsIgnoreCase("Giai Ba"))
						soGiaiBa++;
				}
				
			}
			
			if(soGiaiDacBiet>1){
				soGiaiDacBiet--;
				long tienGiaiDacBiet=1200000000/(soGiaiDacBiet);
				stTienGiaiDacBiet=String.valueOf(tienGiaiDacBiet);
			}
			else
				stTienGiaiDacBiet="12000000000";
			for (NguoiChoi n1 : dsNguoiChoi) {
				if(Giai(n1.getSoDuocChon1(),
						n1.getSoDuocChon2(),
						n1.getSoDuocChon3(), 
						n1.getSoDuocChon4(), 
						n1.getSoDuocChon5(),
						n1.getSoDuocChon6(), dsSoTrungThuong)!=null){
					String giai=Giai(n1.getSoDuocChon1(),
							n1.getSoDuocChon2(),
							n1.getSoDuocChon3(), 
							n1.getSoDuocChon4(), 
							n1.getSoDuocChon5(),
							n1.getSoDuocChon6(), dsSoTrungThuong);
					pW.print(n1.getHoTen()+","+n1.getDiaChi()+","+n1.getSoDienThoai()+","+n1.getSoLuongVeDaMua()+","+n1.getSoDuocChon1()+","+n1.getSoDuocChon2()+","+n1.getSoDuocChon3()+","+n1.getSoDuocChon4()+","+n1.getSoDuocChon5()+","+n1.getSoDuocChon6()+","+giai);
					if(giai.equalsIgnoreCase("Dac Biet"))
						pW.println(","+stTienGiaiDacBiet);
					if(giai.equalsIgnoreCase("Giai Nhat"))
						pW.println(","+"10000000");
					if(giai.equalsIgnoreCase("Giai Nhi"))
						pW.println(","+"300000");
					if(giai.equalsIgnoreCase("Giai Ba"))
						pW.println(","+"30000");
					daIn[countLine]=1;
					
				}
				
				for (NguoiChoi n2 : dsNguoiChoi) {
					if(soSanhVe(n1, n2)==true&&n1!=n2&&daIn[countLine]!=1){
						String giai=Giai(n1.getSoDuocChon1(),
								n1.getSoDuocChon2(),
								n1.getSoDuocChon3(), 
								n1.getSoDuocChon4(), 
								n1.getSoDuocChon5(),
								n1.getSoDuocChon6(), dsSoTrungThuong);
						pW.print(n2.getSoDuocChon1()+n2.getSoDuocChon2()+n2.getSoDuocChon3()+n2.getSoDuocChon4()+n2.getSoDuocChon5()+n2.getSoDuocChon6()+giai);
						if(giai.equalsIgnoreCase("Dac Biet"))
							pW.print(stTienGiaiDacBiet);
						if(giai.equalsIgnoreCase("Giai Nhat"))
							pW.print("10000000");
						if(giai.equalsIgnoreCase("Giai Nhi"))
							pW.print("300000");
						if(giai.equalsIgnoreCase("Giai Ba"))
							pW.print("30000");
						
					}
				}
				
			}
			System.out.println("---------------------------------------");
			System.out.println("Giai dac biet: co "+soGiaiDacBiet+"ve trung thuong");
			System.out.println("Giai nhat : co "+soGiaiNhat+"ve trung thuong");
			System.out.println("Giai  nhi: co "+soGiaiNhi+"ve trung thuong");
			System.out.println("Giai  ba: co "+soGiaiBa+"ve trung thuong");
			pW.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public String Giai(int so1,int so2,int so3,int so4,int so5,int so6,ArrayList<Integer> dsSoTrungThuong){
		int[] so=new int[]{so1,so2,so3,so4,so5,so6};
		int soGiongKetQua=0;
		for (int i : so) {
			for (int soTrungThuong : dsSoTrungThuong) {
				if(i==soTrungThuong)
					soGiongKetQua++;
			}
		}
		if(soGiongKetQua==6)
			return "Dac Biet";
		if(soGiongKetQua==5)
			return "Giai Nhat";
		if(soGiongKetQua==4)
			return "Giai Nhi";
		if(soGiongKetQua==3)
			return "Giai Ba";
		return null;
		
	}
	public boolean soSanhVe(NguoiChoi n1,NguoiChoi n2){
		if(!n1.getHoTen().equalsIgnoreCase(n2.getHoTen()))
			return false;
		int soTrung=0;
		int[] soVe1=new int[]{n1.getSoDuocChon1(),n1.getSoDuocChon2(),n1.getSoDuocChon3(),n1.getSoDuocChon4(),n1.getSoDuocChon5(),n1.getSoDuocChon6()};
		int[] soVe2=new int[]{n2.getSoDuocChon1(),n2.getSoDuocChon2(),n2.getSoDuocChon3(),n2.getSoDuocChon4(),n2.getSoDuocChon5(),n2.getSoDuocChon6()};
		for (int i : soVe1) {
			for (int j : soVe2) {
				if(i==j)
					soTrung++;
			}
		}
		if(soTrung!=6)
			return false;
		return true;
	}
}
