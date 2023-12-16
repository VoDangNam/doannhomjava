/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doAn;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class view {
    public static void main(String[] args) {
        ArrayList <sinhVien> dssv = new ArrayList<>();
        QuanlySinhVien ql = new QuanlySinhVien();
        
        ql.nhapdanhsachsv();
        ql.xuatdanhsachsv(ql.dssv);
        
        ql.menuSX();
        
        ql.xoaSvTheoId();
      
      
    }
}
