package automation.testsuite.NganNguyen;

import java.util.Scanner;

public class BTVN_QLDS_nhanVien_Appli {

	public static void main(String[] args) {
		BTVN_QLDS_nhanVien qlNhanVien = new BTVN_QLDS_nhanVien();
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien can them: ");
		n = sc.nextInt();

		String emp[][] = new String[n][2];
		qlNhanVien.nhapThongTinNhanVien(emp, n);
		qlNhanVien.inDanhSachNhanVien(emp, n);
	}

}
