package automation.testsuite.LyTran;
import java.util.Scanner;
public class Day7 {
 public static void main(String[] args) {
	 Scanner sC = new Scanner(System.in);
	 System.out.println("Nhap so phan tu: ");
	 
	 int soPhanTu = sC.nextInt();
	 System.out.println("So phan tu la: " +soPhanTu); 
	 
	

		
		int tong = 0;
		for (int i = 0; i < soPhanTu; i++) {
			System.out.println("Nhap gia tri thu " + i);
			int luuTam = sC.nextInt();

			tong = tong + luuTam;
		}

		System.out.println("Tong so phan tu la: " + tong);
}
 }

