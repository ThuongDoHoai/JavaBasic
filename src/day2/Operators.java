package day2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operators {

	//Ex2
	private static void doEx2() {
		int meters;
		int hours;
		int minutes;
		int seconds;
		double outputMeterSecond;
		double outputKmHour;
		double outputMileHour;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Input distance in meters: ");
		meters = sc.nextInt();
		
		System.out.println("Input hour: ");
		hours = sc.nextInt();
		
		
		System.out.println("Input minutes: ");
		minutes = sc.nextInt();
		
		System.out.println("Input seconds: ");
		seconds = sc.nextInt();
		
		int timeInSecond = hours*3600 + minutes*60 + seconds;
		
		//---------------------- Meters/ Second ---------------------------------
		
		outputMeterSecond = (double)(meters)/(double)(timeInSecond); 
		
		//C1
		System.out.println("Your speed in meters/second is: " + String.format("%.8f", outputMeterSecond));
		
		//C2
		DecimalFormat df = new DecimalFormat("#.########");
		String ex1 = df.format(outputMeterSecond);
		System.out.println("Your speed in meters/second is: " + ex1);
		
		double revertDouble = Double.valueOf(outputMeterSecond);
		
		//-----------------------------------------------------------------------
		
	}
	
	
	
	public static void main(String[] args) {
		//Ex2
		doEx2();

	}

}
