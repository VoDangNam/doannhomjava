
package doAn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QuanlySinhVien {
  ArrayList<sinhVien> dssv = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  public void nhapdanhsachsv()
  {
      int slsv;
      System.out.println("Enter number of student : ");
      slsv=sc.nextInt();
      for(int i=0;i<slsv;i++)
      {
          sinhVien sv= new sinhVien();
          sv.nhapmotsvv();
          
          dssv.add(sv);
      }
  }
  
  public void xuatdanhsachsv(ArrayList<sinhVien> dssv)
  {
      System.out.println("************XUAT SINH VIEN****************");
      for(int i=0;i<dssv.size();i++)
      {
          dssv.get(i).xuatmotsv();
      }
  }
  
    
}
