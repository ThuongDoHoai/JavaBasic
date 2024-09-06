package day2;
import java.time.temporal.ValueRange;
import java.util.Scanner;
public class DecisionMaking {
    //Ex1
    public void doEx1(int n){
        if (n%2 == 0)
            System.out.println(n + " la so chan");
        else
            System.out.println(n + " la so le");
    }
    //Ex2
    public void doEx2 (int n){
        ValueRange range1 = ValueRange.of(2,5);
        ValueRange range2 = ValueRange.of(6,20);
        if(n%2!=0)
            System.out.println("Weird");
        if(n%2==0 && range1.isValidIntValue(n))
            System.out.println("Not Weird");
        if(n%2==0 && range2.isValidIntValue(n))
            System.out.println("Weird");
        if(n%2==0 && n>20)
            System.out.println("Not Weird");
    }
    //Ex3
    public void doEx3(int n){
        int sum=0;
        int tam;
        String inputAsString = String.valueOf(n);
        for (int i = 0 ; i< inputAsString.length(); i++)
        {
            tam = Character.getNumericValue(inputAsString.charAt(i));
            sum = sum + tam;
        }
        System.out.println("The sum of all digits in " + n + " is " + sum);
    }
    //Ex4
    public void doEx4(long n){
        long convertHour;
        long convertDay;
        long convertYear;
        convertHour = n / 60;
        convertDay = convertHour/24;
        convertYear = convertDay /365;
        System.out.println(n +" minutes is approximately " + convertYear + " years and " + convertDay + " days");
    }

    public static void main(String[] args) {
        DecisionMaking decisionMaking = new DecisionMaking();
        Scanner sc = new Scanner(System.in);
		
        //Ex1 
	    System.out.println("EX1: ");
	    System.out.println("Nhap so ban muon check: "); 
		decisionMaking.doEx1(sc.nextInt());
		 
	 	//Ex2
		System.out.println("\nEX2: "); 
        System.out.println("Nhap so ban muon check: ");
        decisionMaking.doEx2(sc.nextInt());
        
        //Ex3
        System.out.println("\nEX3: ");
        boolean check = false;
        int inputEx3;
        while (check == false){
            System.out.println("Input an integer between 0 and 1000: ");
            inputEx3 = sc.nextInt();
            if (0<=inputEx3 && inputEx3<=1000)
            {
                decisionMaking.doEx3(inputEx3);
                break;
            }
        }
        
        System.out.println("\nEX4: ");
        //Ex4
        System.out.println("Input the number of minutes: ");
        decisionMaking.doEx4(sc.nextLong());
    }
}
 
 