package day3;

import java.util.Scanner;

public class MethodEx2 {
	//Cach 1
	public static boolean hasEight(int number) {
		String numberToString = String.valueOf(number);
		for (int i = 0; i < numberToString.length(); i++) {
			if (numberToString.charAt(i) == '8')
				return true;
		}
		return false;
	}
	
	//Cach 2
	public static boolean hasEightTwo(int number) {
		String numberToString = String.valueOf(number);
		int i = numberToString.indexOf("8");
		if (i ==-1) 
			return false;
		else return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		System.out.print("Nhap so ma ban muon check: ");
		number = sc.nextInt();

		//Cach 1
		if (hasEight(number) == true)
			System.out.println("Co so 8");
		else
			System.out.println("Khong co so 8");
		
		//Cach 2
		if (hasEightTwo(number) == true)
			System.out.println("Co so 8");
		else
			System.out.println("Khong co so 8");		
	}

}
