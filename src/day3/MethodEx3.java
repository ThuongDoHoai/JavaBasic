package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class MethodEx3 {

	public static void MagicSum() {
		Scanner sc = new Scanner(System.in);
		int checkNumber;
		int sum = 0;
		boolean flag = true;
		boolean contains;
		String converString = null;
		ArrayList<Integer> list = new ArrayList<Integer>();

		while (flag == true) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			checkNumber = sc.nextInt();
			if (checkNumber == -1) {
				flag = false;
			} else
				list.add(checkNumber);
		}

		for (int i = 0; i < list.size(); i++) {
			converString = String.valueOf(list.get(i));

			if (converString.contains("8"))
				contains = true;
			else
				contains = false;

			if (contains == true)
				sum = sum + list.get(i);
		}

		System.out.println("The sum is: " + sum);
	}

	public static void main(String[] args) {
		MagicSum();
	}

}
