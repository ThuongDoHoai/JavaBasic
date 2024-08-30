package day1;

import java.util.Scanner;

public class DataTypesAndVariables {
	
	
	//Ex1
	private static void doEx1() {
		System.out.println("Hello World");
	}

	//Ex2
	private void doEx2() {
		System.out.println("++++++\r\n"
				+ "@@@@@@\r\n"
				+ "******\r\n"
				+ "######");
	}
	
	//Ex3
	private void doEx3() {
		byte a = 10;
		double b = 20.3;
		double c = 3.14785;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: "+ c);
	}
	
	//Ex4
	private void doEx4() {
		boolean d = true;
		
		d = false; 
		System.out.println(d);		
	}
	
	//Ex6
	private void doEx6(double inputFah) {
		double outputCelsius = (inputFah-32)/1.8 ;	
		System.out.println(inputFah + " degree Fahrenheit is equal to " +outputCelsius + " in Celsius ");
	}
	
	//Ex7
	private void doEx7() {
		
		double inputInches;
		double outputMeter;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input a value for inch: ");
		inputInches = sc.nextDouble();
		
		outputMeter = inputInches*0.0254;
		
		System.out.println(inputInches + " inch is "+ String.format("%.1f", outputMeter) + " meters");
	}
	

	public static void main(String[] args) {
		
		//Ex1
		System.out.println("Ex1:");
		doEx1();
		System.out.println();
		
		//Ex2
		System.out.println("Ex2:");
		DataTypesAndVariables dataTypesAndVariables = new DataTypesAndVariables();
		dataTypesAndVariables.doEx2();
		System.out.println();
		
		//Ex3
		System.out.println("Ex3:");
		dataTypesAndVariables.doEx3();
		System.out.println();
		
		//Ex4
		System.out.println("Ex4:");
		dataTypesAndVariables.doEx4();
		System.out.println();
		
		//Ex6
		System.out.println("Ex6:");
		dataTypesAndVariables.doEx6(212);
		System.out.println();
		
		//Ex7
		System.out.println("Ex7:");
		dataTypesAndVariables.doEx7();
	}	
}
