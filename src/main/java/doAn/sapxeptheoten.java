package doAn;
import java.util.Comparator;

public class sapxeptheoten extends sinhVien {
  //kế thừa thuộc tính Name của lớp sinhVien
  supper();
  //hàm so sánh tên sinh viên
  public  int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
  }
}
