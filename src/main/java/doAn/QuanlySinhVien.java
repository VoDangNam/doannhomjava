
package doAn;

import doAn.sinhVien;
import java.io.*;
import java.util.*;

public class QuanlySinhVien {
	sinhVien sv = new sinhVien();
	ArrayList<sinhVien> dssv = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void nhapdanhsachsv() {
		int slsv;
		System.out.println("Enter number of student : ");
		slsv = sv.ktsn();
		for (int i = 0; i < slsv; i++) {
			System.out.println("===>Enter student " + (i + 1));
			sinhVien sv = new sinhVien();
			sv.nhapmotsvv();

			dssv.add(sv);
		}
	}

	public void xuatdanhsachsv(ArrayList<sinhVien> dssv) {
		System.out.println(">>>>>=============================Students list=============================<<<<<");
		for (int i = 0; i < dssv.size(); i++) {
			dssv.get(i).xuatmotsv();
		}
	}

	public void addStudent() {
		sinhVien sva = new sinhVien();
		sva.nhapmotsvv();
		dssv.add(sva);
	}

	public void editstudentbyId(String idtk) {
		int d = -1;
		for (int i = 0; i < dssv.size(); i++) {
			if (dssv.get(i).getId().equals(idtk)) {
				d = i;
				break;
			}
		}
		if (d != -1) {
			dssv.get(d).xuatmotsv();
			dssv.remove(d);

			System.out.println("Edit seclected student infomation:");
			sinhVien svnew = new sinhVien();
			svnew.nhapmotsvv();

			dssv.add(d, svnew);
		} else {
			System.out.println("Student ID:" + idtk + "not found! ");
		}
	}
    //tang dan
	public void sxGpaTang() {
		Collections.sort(dssv, Comparator.comparingDouble(sinhVien::getGpa).thenComparing(sinhVien::getName));
	}

	// Giam dan
	public void sxGpaGiam() {
		Collections.sort(dssv,Comparator.comparingDouble(sinhVien::getGpa).reversed().thenComparing(sinhVien::getName));
	}

	// sap xep theo ten theo chieu abc
	public void sapxeptheotentang() {
		Collections.sort(dssv, Comparator.comparing(sinhVien::getName));
	}

	// sap xep theo ten nguoc chieu abc
	public void sapxeptheotengiam() {

		Collections.sort(dssv, Comparator.comparing(sinhVien::getName,Comparator.reverseOrder()));
		
	}
	// Xoa

	public void xoaSvTheoId() {
		sinhVien sv = new sinhVien();

		System.out.println("Enter id of student : ");
		String svid = sv.ktchu();

		int ds = dssv.size();
		for (int i = 0; i < ds; i++) {
			if (dssv.get(i).getId().equals(svid)) {
				sv = dssv.get(i);
			}
		}
		if (sv != null) {
			dssv.remove(sv);
			System.out.println("Delete Student with id:" + svid + " succeeded!");
			System.out.println("\n===Student List after successful deleted===");
			xuatdanhsachsv(dssv);
		} else {
			System.out.println("Student ID:" + svid + "not found! ");
		}

	}

//Xuat file
	public void xuatFileSinhVien() {
		try {
			FileWriter writer = new FileWriter("src/main/java/doAn/dcPhi.txt", true);
			for (sinhVien sv : dssv) {
				writer.write(sv.toString());
				writer.write(System.lineSeparator());
			}
			writer.close();
			System.out.println("Successfully write student information to file: sinhvien.txt");
		} catch (IOException e) {
			System.out.println("Output information error: " + e.getMessage());
		}
	}

	public void xuatFileSinhVienNew() {
		try {
Scanner sc = new Scanner(System.in);

			System.out.println("Nhap vao dia chi file ban muon luu: ");
			String dc = sc.nextLine();
			FileWriter writer = new FileWriter(dc);
			for (sinhVien sv : dssv) {
				writer.write(sv.toString());
				writer.write(System.lineSeparator());
			}
			writer.close();
			System.out.println("Successfully write student information to file: " + dc);
		} catch (IOException e) {
			System.out.println("Output information error: " + e.getMessage());
		}
	}

	public void Menu() {
		QuanlySinhVien ql = new QuanlySinhVien();
		String idtk;
		int choice;

		do {
			System.out.print("\n\t\t+======                                                           ======+\t\t");
			System.out.print("\n\t\t+========                                                       ========+\t\t");
			System.out.print("\n\t\t+==========                                                   ==========+\t\t");
			System.out.print("\n\t\t+=======================================================================+\t\t");
			System.out.print("\n\t\t       \\                   PLN HIGH SCHOOL                      /    \t\t");
			System.out.print("\n\t\t        \\     First learn ethics, then learn literature        /     \t\t");
			System.out.print("\n\t\t+=======================================================================+\t\t");
			System.out.print("\n\t\t\t\t\t=STUDENTS MANAGEMENT=\t\t\t\n");
			System.out.print("\t\t\t\t||-------------------------------------||\n");
			System.out.print("\t\t\t\t|| 1. Input students list.             ||\n");
			System.out.print("\t\t\t\t|| 2. Add a student                    ||\n");
			System.out.print("\t\t\t\t|| 3. Edit student by ID.              ||\n");
			System.out.print("\t\t\t\t|| 4. Delete a student by id.          ||\n");
			System.out.print("\t\t\t\t|| 5. Sort students gradually by Gpa   ||\n");
			System.out.print("\t\t\t\t|| 6. Sort student by name             ||\n");
			System.out.print("\t\t\t\t|| 7. Show students.                   ||\n");
			System.out.print("\t\t\t\t|| 8. Output File                      ||\n");
			System.out.print("\t\t\t\t|| 0. Exit                             ||\n");
			System.out.print("\t\t\t\t||_____________________________________||\n");
			System.out.println("Please enter your choice: ");
			choice = sv.ktsMn();
			// sc.nextLine(); // Consume the newline character

			switch (choice) {
			case 1:
				System.out.println(">>>=======Input student information=======<<<");
				ql.nhapdanhsachsv();
				System.out.println("               >>>>><<<<<                    ");
				break;
			case 2:
				System.out.println("Add a student  ");
				ql.addStudent();
				break;
			case 3:
				System.out.println("Input student ID for seaching: ");
				idtk = sv.ktchu();
				ql.editstudentbyId(idtk);
				break;
			case 4:
				ql.xoaSvTheoId();
				break;
			case 5:
				int choose4;
				do {

					System.out.println("^^^^^Sort students gradually by Gpa^^^^^");
System.out.println("||1. Ascending sort                   ||");
					System.out.println("||2. Descending sort                  ||");
					System.out.println("||0. Out menu                         ||");
					System.out.println("||--------------***-------------------||");
					System.out.println("===>Enter your choice:");
					choose4 = sv.ktsMnMini();
					if (choose4 == 1) {
						ql.sxGpaTang();
						System.out.println("Sort successfully!");
						break;
					} else if (choose4 == 2) {
						ql.sxGpaGiam();
						System.out.println("Sort successfully!");
						break;
					} else {
						break;
					}
				} while (choose4 != 0);
			case 6:
				int choose5;

				do {
					System.out.println("^^^^^^^^^^^^Sort students by name^^^^^^^^^^^^");
					System.out.println("||1. Sort in alphabetical direction        ||");
					System.out.println("||2. Sort in reverse alphabetical direction||");
					System.out.println("||0. Out menu                              ||");
					System.out.println("||----------------***----------------------||");
					System.out.println("===>Enter your choice:");
					choose5 = sv.ktsMnMini();
					if (choose5 == 1) {
						ql.sapxeptheotentang();
						System.out.println("Sort successfully!");
						break;
					} else if (choose5 == 2) {
						ql.sapxeptheotengiam();
						System.out.println("Sort successfully!");
						break;
					} else {
						break;
					}
				} while (choose5 != 0);

			case 7:
				ql.xuatdanhsachsv(ql.dssv);
				break;

			case 8:
				int choose7;

				do {
					System.out.println("^^^^^^^^^^^^^^Output file^^^^^^^^^^^^^^");
					System.out.println("||1. Input file                      ||");
					System.out.println("||2. Output new file                 ||");
					System.out.println("||0. Out menu                        ||");
					System.out.println("||-------------***-------------------||");
					System.out.println("===>Enter your choice:");
					choose7 = sv.ktsMnMini();
					if (choose7 == 1) {
						ql.xuatFileSinhVien();
						break;
					} else if (choose7 == 2) {
						ql.xuatFileSinhVienNew();
						break;
					} else {
						break;
					}
				} while (choose7 != 0);
				break;

			case 0:
				System.out.println(
						" #############    #############    #############       ###        ###    ################    ####        ####");
				System.out.println(
						" #############    #############    #############        ###      ###     ################    ####        ####");
				System.out.println(
						" ####             ####             ####                  ###    ###      ####        ####    ####        ####");
				System.out.println(
						" ####             ####             ####                   ###  ###       ####        ####    ####        ####");
				System.out.println(
						" #############    #############    #############           ######        ####        ####    ####        ####");
				System.out.println(
" #############    #############    #############            ####         ####        ####    ####        ####");
				System.out.println(
						"          ####    ####             ####                     ####         ####        ####    ####        ####");
				System.out.println(
						"          ####    ####             ####                     ####         ####        ####    ####        ####");
				System.out.println(
						" #############    #############    #############            ####         ################    ################");
				System.out.println(
						" #############    #############    #############            ####         ################    ################");
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
			}
		} while (choice != 0);
	}

}