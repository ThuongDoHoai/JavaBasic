package day3;

public class ArrayEx3 {

	public static String arrayToString(int[] array) {
		String[] convertString = new String[array.length];
		String result = null;

		if (array.length > 0) {
			for (int i = 0; i < array.length; i++) {
				convertString[i] = String.valueOf(array[i]);
			}
			result = String.join(", ", convertString);
			return ("{" + result + "}");
		} else
			return "Blank";
	}

	public static void main(String[] args) {
		/*---------------------Mang rong------------------------*/
		int[] array0 = new int[0];
		System.out.println("Chuoi ket qua: " + arrayToString(array0));

		/*-----------------------Mang 1 phan tu------------------------*/
		int[] array1 = new int[2];
		array1[0] = 3;
		array1[1] = 5;
		System.out.println("Chuoi ket qua: " + arrayToString(array1));

		/*-----------------------Mang n phan tu------------------------*/
		int[] array2 = new int[5];
		array2[0] = 10;
		array2[1] = 12;
		array2[2] = 14;
		array2[3] = 16;
		array2[4] = 18;
		System.out.println("Chuoi ket qua: " + arrayToString(array2));
	}

}
