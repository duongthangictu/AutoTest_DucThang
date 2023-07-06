package automation.testsuite.NganNguyen;

import java.util.Scanner;

public class BTVN_QLDS_nhanVien {
//	String tenNV;
//	String maNV;

	public void nhapThongTinNhanVien(String dsNV[][], int soNV) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < soNV; i++) {
			for (int j = 0; j < 2; j++) {
				if (j == 0) {
					System.out.print("Nhap ten nhan vien thu " + (i + 1) + ": ");
					dsNV[i][j] = sc.nextLine();
				} else {
					System.out.print("Nhap ma nhan vien thu " + (i + 1) + ": ");
					dsNV[i][j] = sc.nextLine();
				}
			}
			System.out.println();
		}
	}

	void inDanhSachNhanVien(String dsNV[][], int soNV) {
		System.out.println("Danh sach nhan vien gom ten nhan vien va ma nhan vien hien thi lan luot nhu sau: ");
		for (int i = 0; i < soNV; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(dsNV[i][j] + " ");

			}
			System.out.println();
		}
	}

}
