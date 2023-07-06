package automation.testsuite.NganNguyen;

public class Condition_D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		  boolean isEven; int number; try (Scanner sc = new Scanner(System.in)) {
//		  System.out.println("Nhap vao so: "); number = sc.nextInt(); } if (number % 2
//		  == 0) { isEven = true; } else { isEven = false; }
//		  System.out.println("Cach 1: " + isEven); // cach khac isEven = (number % 2 ==
//		  0) ? true : false; System.out.println("Cach 2: " + isEven);

		/*
		 * System.out.println("Cac so chia het cho 5 tu 1 den 100:"); for (int i = 1; i
		 * <= 100; i++) { if (i % 5 == 0) { System.out.print(i + " "); } }
		 */

		int a[] = { 5, 1, 4, 2, 8, 7, 3, 0, 6 };

		System.out.println("Mang truoc khi sap xep:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;

				}
//				else return;
			}
		}
		System.out.println();
		System.out.println("Mang sau khi sap xep:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
