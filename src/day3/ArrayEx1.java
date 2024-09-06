package day3;

import java.util.Scanner;

public class ArrayEx1 {

	public static void GradesAverage() {
		byte numberStudent;
		int sum = 0;
		double average;
		int grade;
		int i = 1;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of student: ");
		numberStudent = sc.nextByte();

		while (i <= numberStudent) {
			System.out.print("Enter the grade for student " + i + ": ");
			grade = sc.nextInt();
			if (grade >= 0 && grade <= 100) {
				sum = sum + grade;
				i++;
			} else
				System.out.println("Invalid grade, try again...");
		}

		average = (double) (sum / numberStudent);
		System.out.print("The average is: " + average);
	}

	public static void main(String[] args) {
		GradesAverage();
	}

}
