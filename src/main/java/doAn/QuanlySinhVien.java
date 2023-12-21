
package doAn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanlySinhVien {

	ArrayList<sinhVien> dssv = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void nhapdanhsachsv() {
		int slsv;
		System.out.println("Enter number of student : ");
		slsv = sc.nextInt();
		for (int i = 0; i < slsv; i++) {
			sinhVien sv = new sinhVien();
			sv.nhapmotsvv();

			dssv.add(sv);
			sv.ghiFile(sv);
		}
	}

	public void xuatdanhsachsv(ArrayList<sinhVien> dssv) {
		System.out.println("************XUAT SINH VIEN****************");
		for (int i = 0; i < dssv.size(); i++) {
			dssv.get(i).xuatmotsv();
		}
	}
	
//	public void docFile() {
//	    sinhVien sv = new sinhVien();
//	    sv.docFile(dssv);
//	}
	
	
  // tang dan
  public void sxGpaTang() {
	  Collections.sort(dssv, Comparator.comparingDouble(sinhVien::getGpa).thenComparing(sinhVien::getName));
  }

  // Giam dan
  public void sxGpaGiam() {
	  Collections.sort(dssv, Comparator.comparingDouble(sinhVien::getGpa).reversed().thenComparing(sinhVien::getName));
  }
  
  //menu sap xep
  public void menuSX() {
	  String choose = null;
	  boolean exit = false;
	System.out.println("Menu");
	System.out.println("1. Sap xep tang dan");
	System.out.println("2. Sap xep giam dan");
	System.out.println("0. Thoat");
	System.out.println("Nhap lua chon: ");
	while(true) {
		choose = sc.nextLine();
		
		switch(choose) {
		case "1":
			sxGpaTang();
			xuatdanhsachsv(dssv);
			break;
		case "2":
			sxGpaGiam();
			xuatdanhsachsv(dssv);
			break;
		case "0":
			exit = true;
			break;
		}
	}
  }

	// Xoa sinh vien theo Id
	public void xoaSvTheoId() {
		sinhVien sv = null;
		String svid = sc.nextLine();

		System.out.println("Enter id of student : ");
		svid = sc.nextLine();

		int ds = dssv.size();
		for (int i = 0; i < ds; i++) {
			if (dssv.get(i).getId().equals(svid)) {
				sv = dssv.get(i);
			}
		}
		if (sv != null) {
			dssv.remove(sv);
			System.out.println("Thanh cong xoa sinh vien co id la " + svid);
			System.out.println("\n===danh sach sinh vien sau khi xoa===");
			xuatdanhsachsv(dssv);
		} else {
			System.out.println("Khong tim thay sinh vien co " + svid);
		}
	}

	public void sapXepTheoTen() {
		Collections.sort(dssv, Comparator.comparing(sinhVien::getName));
		System.out.println("===Danh sach sau khi sap xep===");
		xuatdanhsachsv(dssv);
	}
}