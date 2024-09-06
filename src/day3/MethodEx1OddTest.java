package day3;

import java.util.Scanner;

public class MethodEx1OddTest {

	public static boolean isOdd(int number) {
		if (number % 2 == 0)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.print("Nhap so ma ban muon check: ");
		number = sc.nextInt();

		if (isOdd(number) == true)
			System.out.println("So le");
		else
			System.out.println("So chan");
	}

}
