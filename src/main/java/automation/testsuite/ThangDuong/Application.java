package automation.testsuite.ThangDuong;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong nhan vien: ");
		int soLuongNhanVien = scanner.nextInt();
//		Employee[] emp = new Employee[soLuongNhanVien];
		Department emp[] = new Department[soLuongNhanVien];

		for (int i = 0; i < soLuongNhanVien; i++) {
			System.out.print("\nNhan vien thu " + (i + 1) + " :\n");
			emp[i] = new Department();
			emp[i].inputData();
		}

		System.out.println("\nThong tin nhan vien:");
		for (int i = 0; i < soLuongNhanVien; i++) {
			System.out.println(emp[i].toString());

		}

	}

}
