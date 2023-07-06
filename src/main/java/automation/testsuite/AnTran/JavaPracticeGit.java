package automation.testsuite.AnTran;

import java.util.Scanner;

public class JavaPracticeGit {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap so phan tu cua mang");
		int n = input.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			arr[i] = input.nextInt();
			sum = sum + arr[i];
		}
		System.out.print("Mang: ");
		show(arr);
		System.out.println();
		System.out.println("Tong cac phan tu cua mang " + sum);

	}

	public static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
