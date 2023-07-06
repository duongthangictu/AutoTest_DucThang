package automation.testsuite.ThoaLe;

import java.util.Scanner;

public class JavaPracticeGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của dãy: ");		
		int n = scanner.nextInt();
		System.out.println("Nhập vào các phần tử của dãy: ");
		int arr[] = new int[n];
		for (int i=0; i<n; i++) {
			System.out.println("Nhập vào phần tử thứ: " +i);
			arr[i]=scanner.nextInt();
		}
		int sum=0;
		for (int i=0; i<n; i++) {
			sum= sum+arr[i];
		}
		System.out.println( "Tổng của dãy vừa nhập là: " +sum);
	}

	

}
