package automation.testsuite.NganNguyen;

import java.util.Scanner;

public class JavaPraticeGit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi ban nhap so phan tu mang: ");
		n = sc.nextInt();

		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + arr[i] + " :");
			arr[i] = sc.nextInt();
		}

		System.out.println("Mang ban vua nhap la:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		/*
		 * //cach khac in mang for (int i : arr) { System.out.print(i + " "); }
		 */
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\r\nTong cac phan tu trong mang la: " + sum);

	}
}
