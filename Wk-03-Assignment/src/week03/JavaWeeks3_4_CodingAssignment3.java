package week03;
import java.util.*;
public class JavaWeeks3_4_CodingAssignment3 {

	public static void main(String[] args) {
	//1
		System.out.println("1...");
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 13};
	//a-b
		System.out.println(ages[ages.length - 1] - ages[0]);
	//c
		int sumOfAges = 0;
		for (int age : ages)
			sumOfAges += age;
		System.out.println(sumOfAges / ages.length);
	//2	
		System.out.println();
		System.out.println("2...");
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//a
		int sumOfLetters = 0;
		for (String name : names)
			sumOfLetters += name.length();
		int averageLettersInNames = sumOfLetters / names.length;
		System.out.println(averageLettersInNames);
	//b
		for (String name : names)
			System.out.print(name + " ");
	//3	
		System.out.println();
		System.out.println();
		System.out.println("3...");
		
		System.out.println("You access the last element of an array by calling for the length of the array and then subtracting one (1) to return the last number (element) in the array.");
	//4	
		System.out.println();
		System.out.println("4...");
		
		System.out.println("You access the first element in an array by calling element zero (0). The first element is always assigned to 0.");
	//5	
		System.out.println();
		System.out.println("5...");
		
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++)
			nameLengths[i] = names[i].length();
		//testing the array (not part of the assignment)
		for (int element : nameLengths)
			System.out.print(element + " ");
	//6
		System.out.println();
		System.out.println();
		System.out.println("6...");
		
		int sumOfElements = 0;
		for (int element : nameLengths)
			sumOfElements += element;
		System.out.println(sumOfElements);
	//7
		System.out.println();
		System.out.println("7...");
		
		System.out.println(isConcatenated("Hello",3));
	//8
		System.out.println();
		System.out.println("8...");
		
		System.out.println(returnFullName("The","Beatles"));
	//9
		System.out.println();
		System.out.println("9...");
		
		int[] numbersToSum1 = {50, 40, 0};
		int[] numbersToSum2 = {50, 40, 10};
		int[] numbersToSum3 = {50, 40, 20};
		System.out.println(sumGreaterThan(numbersToSum1));
		System.out.println(sumGreaterThan(numbersToSum2));
		System.out.println(sumGreaterThan(numbersToSum3));
	//10
		System.out.println();
		System.out.println("10...");
		
		double[] numsToAve1 = {1.1, 2.2, 3.3, 4.4, 5.5};
		double[] numsToAve2 = {1.1, 2.2, 3.3, 4.4, 6.5};
		System.out.println(returnAverage(numsToAve1));
		System.out.println(returnAverage(numsToAve2));
	//11
		System.out.println();
		System.out.println("11...");
		
		System.out.println(is1stAveGreater(numsToAve1,numsToAve2));
		System.out.println(is1stAveGreater(numsToAve2,numsToAve1));
	//12
		System.out.println();
		System.out.println("12...");
		
		System.out.println(willBuyDrink(true,10.75));
		System.out.println(willBuyDrink(false,10.75));
		System.out.println(willBuyDrink(true,10.25));
		System.out.println(willBuyDrink(false,10.25));
	//13
		System.out.println();
		System.out.println("13...");
		
//This is a simple (too simple) plant guide. It asks the person if their soil is dry. If they say "No" it tells them the plant does not need attention and ends the method. If the person answers "Yes" it further inquires as to when the plant was last fertilized. If the person answers less than 14 days the method tells them the plant just needs to be watered. If the person answers 14 or more days, the method prints that the plant needs to be watered AND fed.
		
		System.out.println("Plant water & fertilizer guide:");
		waterPlant();
		
	}
//7
	public static String isConcatenated(String word, int n) {
		String concatenatedWord = "";
		for (int i=0; i < n; i++)
			concatenatedWord += word;
		return concatenatedWord;
	}
//8
	public static String returnFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
//9
	public static boolean sumGreaterThan(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		if (sum > 100)
			return true;
		} return false;
	}
//10
	public static double returnAverage(double[] array) {
		double sum = 0;
		for (double num : array)
			sum += num;
		return sum / array.length;
	}
//11
	public static boolean is1stAveGreater(double[] array1, double[] array2) {
		double sumArray1 = 0;
		double sumArray2 = 0;
		for (double num : array1)
			sumArray1 += num;
		for (double num : array2)
			sumArray2 += num;
		if (sumArray1/array1.length > sumArray2/array2.length)
			return true;
		return false;
	}
//12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50)
			return true;
		return false;
	}
//13
	public static void waterPlant() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Is the soil dry?");
		String water = sc.nextLine();
		
		if (water.equalsIgnoreCase("No"))
			System.out.print("Your plant does not need attention today.");
		else if (water.equalsIgnoreCase("Yes")) {
			System.out.println("How many days since plant was last fertilized?");
			int fert = sc.nextInt();
		
			if (water.equalsIgnoreCase("Yes") && fert >= 14)
				System.out.print("Your plant needs to be watered AND fertilized today.");
			else 
				System.out.print("Your plant needs to be watered today.");
		}
	}
}
