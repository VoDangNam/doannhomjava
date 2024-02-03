
package doAn;

import java.util.Scanner;

public class sinhVien {
	private String id, name, address;
	private int age;
	private float gpa;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	///// HAM XU LY LOI

	// ktr chu
	public String ktchu() {
		String name;
		Scanner sc = new Scanner(System.in);

		while (true) {
			name = sc.nextLine();
			if (!name.trim().isEmpty())// trim() loai bo het cac dau cach thua (tranh duoc case nhap nhieu dau cach)
			{ // isEmpty check xem cos ki tu rong khong

				break;
			} else {
				System.out.println("Invalid information . Please enter again!");
			}

		}

		return name;

	}

	// ktra so

	public static int ktsn() {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
//	                System.out.println("Nhap vao number ");
				a = Integer.parseInt(sc.nextLine());

				break;

			} catch (Exception e) {
				System.out.println("Invalid information!!");

			}
		}

		return a;
	}

	// ktra tuoi

	public static int ktsTuoi() {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
//	                System.out.println("Nhap vao number ");
				a = Integer.parseInt(sc.nextLine());
				if (a >= 1 && a <= 100) {
					break;
				}

				else {
					System.out.println("Invalid Age!!! Please enter Age again ");
				}

			} catch (Exception e) {
				System.out.println("Invalid Age!! Please enter number !!!");

			}
		}

		return a;
	}

	/// Ktra gpa

	public static float ktsGpa() {
		float a = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
//	                System.out.println("Nhap vao number ");
				a = Float.parseFloat(sc.nextLine());
				if (a >= 0 && a <= 10) {
					break;
				}

				else {
					System.out.println("Invalid Gpa!!! Please enter Gpa again !!!(from 0 to 10)");
				}

			} catch (Exception e) {
				System.out.println("Invalid age!! Please enter number !!!");

			}
		}

		return a;
	}

	// Ktra so menu

	public static int ktsMn() {
		int a = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
//	                System.out.println("Nhap vao number ");
				a = Integer.parseInt(sc.nextLine());
				if (a >= 0 && a <= 8) {
					break;
				}

				else {
					System.out.println("Choice not found. Please enter your choice again !! ");
				}

			} catch (Exception e) {
				System.out.println("Invalid choice form!! Please enter number !!!");
			}
		}

		return a;
	}

	// Ktra so menu nho

	// Ktra so menu

	public static int ktsMnMini() {
		int a = 0;
Scanner sc = new Scanner(System.in);
		while (true) {
			try {
//	                System.out.println("Nhap vao number ");
				a = Integer.parseInt(sc.nextLine());
				if (a >= 0 && a <= 2) {
					break;
				}

				else {
					System.out.println("Choice not found. Please enter your choice again !! ");
				}

			} catch (Exception e) {
				System.out.println("Invalid choice form!! Please enter number !!!");
			}
		}

		return a;
	}

	// QUANLYSINHVIEN
	// nhap mot sinh vien
	public void nhapmotsvv() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		name = ktchu();
		System.out.println("Enter id student : ");
		id = ktchu();
		System.out.println("Enter address student");
		address = ktchu();

		System.out.println("Enter age student : ");

		age = ktsTuoi();
		System.out.println("Enter GPA student : ");
		gpa = ktsGpa();

	}

	// xuat mot sinh vien

	public void xuatmotsv() {
		String format = "| %-15s | %-10s | %-10s | %-10s | %-20s |%n";
		System.out.format("+-----------------+------------+------------+------------+----------------------+%n");
		System.out.format("| Name student    | Id         | Age        | Gpa        | Address              |%n");
		System.out.format("+-----------------+------------+------------+------------+----------------------+%n");
		System.out.format(format, getName(), getId(), getAge(), getGpa(), getAddress());
		System.out.format("+-----------------+------------+------------+------------+----------------------+%n");
	}

	void remove(sinhVien sv) {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from
																		// nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public String toString() {
		return "sinhVien{" + "id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", gpa=" + gpa
				+ '}';
	}
}