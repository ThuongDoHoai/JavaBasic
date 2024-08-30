package day3;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
	// Ex1
	private void doEx1() {
		byte[] a = { 1, 3, 5, 8, 9 };
		for (byte i : a)
			System.out.print(" " + i + " ");
	}

	// Ex2
	private void doEx2() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is " + sum);

		// Tinh tong
		double average = (double) (sum) / (double) (100);
		System.out.println("The average is " + average);
	}

	// Ex3
	private void doEx3() {
		int start = 0;
		int end = 0;
		long sum = 0;
		int count = 0;
		double average = 0;
		Scanner sc = new Scanner(System.in);

		// Nhap lieu
		System.out.println("Nhap so hang dau tien trong day so: ");
		start = sc.nextInt();
		System.out.println("Nhap so hang cuoi cung trong day so: ");
		end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			sum = sum + i;
			count++;
		}

		average = (double) (sum) / (double) (count);

		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
	}

	// Ex4
	private void doEx4() {
		int start = 0;
		int end = 0;
		long sum = 0;
		int count = 0;
		double average = 0;
		Scanner sc = new Scanner(System.in);

		// Nhap lieu
		System.out.println("Nhap so hang dau tien trong day so: ");
		start = sc.nextInt();
		System.out.println("Nhap so hang cuoi cung trong day so: ");
		end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
				count++;
			}
		}

		average = (double) (sum) / (double) (count);

		System.out.println("The sum of odd numbers is " + sum);
		System.out.println("The average is " + average);
	}

	// Ex5
	private void doEx5() {
		int start = 0;
		int end = 0;
		long sum = 0;
		int count = 0;
		double average = 0;
		Scanner sc = new Scanner(System.in);

		// Nhap lieu
		System.out.println("Nhap so hang dau tien trong day so: ");
		start = sc.nextInt();
		System.out.println("Nhap so hang cuoi cung trong day so: ");
		end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 7 == 0) {
				sum = sum + i;
				count++;
			}
		}
		average = (double) (sum) / (double) (count);

		System.out.println("Tong cac so chia het cho 7 la: " + sum);
		System.out.println("Gia tri trung binh la:  " + average);
	}

	// Ex6
	private void doEx6() {
		long sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		System.out.println("The sum is " + sum);
	}

	// Ex7
	private void doEx7() {
		int n = 50000;
		double sum1 = 0;
		double sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sum1 = sum1 + (double) (1) / (double) (i);
		}
		System.out.println("The sum1 from left to right " + sum1);

		for (int x = n; x >= 1; x--) {
			sum2 = sum2 + (double) (1) / (double) (x);
		}
		System.out.println("The sum1 from right to left " + sum2);
	}

	// Ex8
	private void doEx8() {
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= 5; y++) {
				System.out.print(" # ");
			}
			System.out.println("");
		}
	}

	// Ex9
	private void doEx9() {
		for (int x = 1; x <= 8; x++) {
			if (x % 2 != 0) {
				for (int y = 1; y <= 8; y++) {
					System.out.print(" # ");
				}
			} else {
				System.out.print(" ");
				for (int y = 1; y <= 8; y++) {
					System.out.print(" # ");
				}
			}
			System.out.println("");
		}
	}
	
	//Ex10
	private void doEx10() {
		String s = "Hello World";		
		for (int i = 0; i<s.length();i++) {
			if (s.charAt(i) == 'r') {
				System.out.println("Vi tri tim thay la: " + (i+1));
				return;
			}
		}
		System.out.println("Khong tim thay");		
	}

	public static void main(String[] args) {

		 Loops loops = new Loops();

		 System.out.println("\rEx1"); 
		 loops.doEx1(); 
		 
		 System.out.println("\rEx2"); 
		 loops.doEx2();
		 
		 System.out.println("\rEx3"); 
		 loops.doEx3(); 
		 
		 System.out.println("\rEx4");
		 loops.doEx4(); 
		 
		 System.out.println("\rEx5"); 
		 loops.doEx5();
		 
		 System.out.println("\rEx6"); 
		 loops.doEx6();
		 
		 System.out.println("\rEx7");
		 loops.doEx7(); 
		 
		 System.out.println("\rEx8"); 
		 loops.doEx8();
		 
		 System.out.println("\rEx9"); 
		 loops.doEx9();
		 
		 System.out.println("\rEx10"); 
		 loops.doEx10();
	}
}
