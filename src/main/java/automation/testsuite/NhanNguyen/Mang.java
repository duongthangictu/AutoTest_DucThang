package automation.testsuite.NhanNguyen;

import java.util.Scanner;
public class Mang {

	public static void main(String[] args) {
     int n;
     int sum =0;
     Scanner scanner = new Scanner(System.in);
    do{
    	 System.out.println("Nhập vào số phần tử của mảng: ");
         n = scanner.nextInt();
     }
     while (n<0);
     int arr[] = new int[n];
     System.out.println("Nhập cac phần tử của mảng: ");
     for (int i = 0; i < n; i++) {
         System.out.print("Nhập phần tử thứ " + i + ": ");
         arr[i] = scanner.nextInt();
     }
     for (int i = 0; i < n; i++)
     {
    	 sum +=arr[i];
     }
     System.out.println("\nTổng các phần tử có trong mảng = " + sum);
	}

}
