
package doAn;

import java.util.Scanner;

public class sinhVien {
   private String id,name,address;
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
   
    
    //nhap mot sinh vien
    public void nhapmotsvv()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        name=sc.nextLine();
        System.out.println("Enter id student : ");
        id=sc.nextLine();
        System.out.println("Enter age student : ");
        age=sc.nextInt();
        System.out.println("Enter GPA student : ");
        gpa=sc.nextFloat();
    }
    
    //xuat mot sinh vien
    
    public void xuatmotsv()
    {
        System.out.println("Name student : "+name+"\n"+"Id : "+id+"\n"+"Age student : "+age+"\n"+"Gpa : "+gpa);
    }
}
