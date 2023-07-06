package automation.testsuite.DucTran;

//Lớp Xe
class Xe {
 private String TenXe;
 private String LoaiXe;
 private int VanTocMax;

 // Getter và Setter cho TenXe
 public String getTenXe() {
     return TenXe;
 }

 public void setTenXe(String TenXe) {
     this.TenXe = TenXe;
 }

 // Getter và Setter cho LoaiXe
 public String getLoaiXe() {
     return LoaiXe;
 }

 public void setLoaiXe(String LoaiXe) {
     this.LoaiXe = LoaiXe;
 }

 // Getter và Setter cho VanTocMax
 public int getVanTocMax() {
     return VanTocMax;
 }

 public void setVanTocMax(int VanTocMax) {
     this.VanTocMax = VanTocMax;
 }
}

//Lớp XeMay kế thừa từ lớp Xe
class XeMay extends Xe {
 // Không cần thêm thuộc tính hay phương thức mới
 // Đã kế thừa từ lớp Xe
}

//Lớp XeTaxi kế thừa từ lớp Xe
class XeTaxi extends Xe {
 // Không cần thêm thuộc tính hay phương thức mới
 // Đã kế thừa từ lớp Xe
}

//Lớp chứa hàm main BTVN3 để chạy chương trình
public class BTVN3 {
 public static void main(String[] args) {
     // Tạo một đối tượng XeMay
     XeMay xeMay = new XeMay();
     xeMay.setTenXe("Wave tàu");
     xeMay.setLoaiXe("Xe máy");
     xeMay.setVanTocMax(150);

     // In ra thông tin của XeMay
     System.out.println("Tên xe: " + xeMay.getTenXe());
     System.out.println("Loại xe: " + xeMay.getLoaiXe());
     System.out.println("Vận tốc tối đa: " + xeMay.getVanTocMax());

     System.out.println("----------------"); // In một dòng trống

     // Tạo một đối tượng XeTaxi
     XeTaxi xeTaxi = new XeTaxi();
     xeTaxi.setTenXe("Xe lamborghini");
     xeTaxi.setLoaiXe("Xe taxi");
     xeTaxi.setVanTocMax(120);

     // In ra thông tin của XeTaxi
     System.out.println("Tên xe: " + xeTaxi.getTenXe());
     System.out.println("Loại xe: " + xeTaxi.getLoaiXe());
     System.out.println("Vận tốc tối đa: " + xeTaxi.getVanTocMax());
 }
}
