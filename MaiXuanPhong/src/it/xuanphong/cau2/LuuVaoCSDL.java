package it.xuanphong.cau2;

import java.util.ArrayList;

public class LuuVaoCSDL {
	public void luuVaoCSDL(ArrayList<NguoiChoi>dsNguoiChoi){
		try {
			KetNoiCSDL kn=new KetNoiCSDL();
			kn.KetNoiSQL();
			String sQL="INSERT NguoiChoi VALUES(?,?,?,?,?,?,?,?,?,?,?,?) ";
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
