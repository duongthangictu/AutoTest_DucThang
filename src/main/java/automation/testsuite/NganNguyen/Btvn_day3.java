package automation.testsuite.NganNguyen;

import java.util.Scanner;

public class Btvn_day3 {
	public static void sapXepGiam(int a[]) {
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					tmp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = tmp;

				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap do dai cho mang: ");
		n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + i + ": ");
			a[i] = sc.nextInt();
		}

		System.out.println("Mang truoc khi sap xep:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		sapXepGiam(a);

		System.out.println();
		System.out.println("Mang sau khi sap xep:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
