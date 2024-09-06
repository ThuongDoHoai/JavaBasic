package day3;

public class ArrayEx2 {

	public static void printArray(int[] array) {
		if(array.length > 0 ){
			System.out.print("{");
			
			for(int i=0; i < array.length; i++){
				if (i < array.length-1)
					System.out.print(array[i]+ ",");
				if (i == array.length - 1)
					System.out.print(array[i]);
			}			
			System.out.println("}");			
		}
		else			
			System.out.println("Mang chua co phan tu nao");
	}
	
	public static void printArray(float[] array) {
		if(array.length > 0 ){
			System.out.print("{");
			
			for(int i=0; i < array.length; i++){
				if (i < array.length-1)
					System.out.print(array[i]+ ",");
				if (i == array.length - 1)
					System.out.print(array[i]);
			}			
			System.out.println("}");			
		}
		else			
			System.out.println("Mang chua co phan tu nao");
	}
	
	public static void printArray(double[] array) {
		if(array.length > 0 ){
			System.out.print("{");
			
			for(int i=0; i < array.length; i++){
				if (i < array.length - 1)
					System.out.print(array[i]+ ",");
				if (i == array.length - 1)
					System.out.print(array[i]);
			}			
			System.out.println("}");			
		}
		else			
			System.out.println("Mang chua co phan tu nao");
	}

	public static void main(String[] args) {
		
		/*------------------INT---------------------*/
		System.out.println("Int inputting");
		// mang int rong
		int[] array = {};
		printArray(array);
		
		//mang int co 1 phan tu
		int[] array1 = new int[1];
		array1[0] = 2;
		printArray(array1);
		
		//mang int co 3 phan tu
		int[] array2 = new int[3];
		array2[0] = 5;
		array2[1] = 6;
		array2[2] = 7;
		printArray(array2);
		
		
		/*------------------FLOAT---------------------*/
		System.out.println("\rFloat inputting");
		// mang int rong
		float[] array3 = {};
		printArray(array3);
		
		//mang int co 1 phan tu
		float[] array4 = new float[1];
		array4[0] = (float) 2.5;
		printArray(array4);
		
		//mang int co 3 phan tu
		float[] array5 = new float[3];
		array5[0] = (float) 5.1;
		array5[1] = (float) 6.2;
		array5[2] = (float) 7.3;
		printArray(array5);
		
		/*------------------DOUBLE---------------------*/
		System.out.println("\rDouble inputting");
		// mang int rong
		double[] array6 = {};
		printArray(array6);
		
		//mang int co 1 phan tu
		double[] array7 = new double[1];
		array7[0] = 2.5;
		printArray(array7);
		
		//mang int co 3 phan tu
		double[] array8 = new double[3];
		array8[0] = 5.5;
		array8[1] = 6.6;
		array8[2] = 7.7;
		printArray(array8);
	}
}
