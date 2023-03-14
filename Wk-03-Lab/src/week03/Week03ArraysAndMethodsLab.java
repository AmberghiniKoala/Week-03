//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
int[] numbers = new int[6];
numbers[0] = 1;
numbers[1] = 5;
numbers[2] = 2;
numbers[3] = 8;
numbers[4] = 13;
numbers[5] = 6;
		// 2. Print out the first element in the array
System.out.println(numbers[0]);	
System.out.println("_____________");		
		// 3. Print out the last element in the array without using the number 5
System.out.println(numbers[numbers.length-1]);		
System.out.println("_____________");		
		// 4. Print out the element in the array at position 6, what happens?
//System.out.println(numbers[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
//System.out.println(numbers[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
for (int i=0; i < numbers.length; i++) {
	System.out.println(numbers[i]);
}
System.out.println("_____________");			
		// 7. Write an enhanced for loop that prints out each element in the array
for (int number : numbers) {
	System.out.println(number);
}
System.out.println("_____________");		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
int sum = 0;
for (int number : numbers) {
	sum += number;
}
			
		// 9. Create a new variable called average and assign the average value of the array to it
double averageSum = sum;
double average = averageSum / numbers.length;
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
for (int number : numbers) {
	if (number % 2 != 0)
		System.out.println(number);
}
System.out.println("_____________");		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
String[] firstName = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
int sumLetters = 0;
for (String letters : firstName) {
	sumLetters += letters.length();
}

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
System.out.print("13. ");
greeting("David Bowie");
System.out.println("_____________");				
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
System.out.println("14. " + greet("Major Tom"));
System.out.println("_____________");		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? **13 visually prints the greeting, 14 just stores the information for use**
		//		c. How are they different? **13 executes the greeting w/no stored data, 14 stores the greeting for further manipulation**
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
System.out.println("15. " + moreLetters("Ground Control to Major Tom", 20));		
System.out.println("15. " + moreLetters("Ground Control to Major Tom", 27));
System.out.println("15. " + moreLetters("Ground Control to Major Tom", 28));
System.out.println("_____________");
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
System.out.println("16. " + match(firstName, "Tom"));
System.out.println("16. " + match(firstName, "Thomas"));
System.out.println("_____________");		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
System.out.println("17. " + smallestNumber(numbers));	
System.out.println("_____________");		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
double[] averageTestArray = {13, 10.5};
System.out.println("18. " + findAverage(averageTestArray));
System.out.println("_____________");
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
int[] letterCount = countLetters(firstName);
for (int letters : letterCount) {
	System.out.println(letters);
}
System.out.println("_____________");				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
System.out.println("20. " + evenGreaterThanOdd(firstName));
System.out.println("_____________");	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
System.out.println("21. " + palindrome("racecar"));
System.out.println("21. " + palindrome("race"));
		
	}
	

	
	// Method 13:
public static void greeting(String name) {
	System.out.println("Hello, " + name + ".");
}

	// Method 14:
public static String greet(String name) {
	return "Hello, " + name + ".";
}
	
	// Method 15:
public static boolean moreLetters(String letters, int number) {
	if (letters.length() > number) {
		return true;
	} else {
		return false;
	}
}
	
	// Method 16:
public static boolean match(String[] list, String word) {
	for (String words : list) {
		if (words.equals(word)) {
			return true;
		}
	} return false;
}

	// Method 17:
public static int smallestNumber(int[] numbers) {
	int smallestNumber = numbers[0];
	for (int number : numbers) {
		if (number < smallestNumber) {
			smallestNumber = number;
		}
	} return smallestNumber;
}
	
	// Method 18:
public static double findAverage(double[] prices) {
	double sum = 0;
	for (double price : prices) {
		sum += price;
	}
	 return sum / prices.length;
}
	
	// Method 19:
public static int[] countLetters(String[] words) {
	int[] count = new int[words.length];
	for (int i = 0; i < words.length; i++) {
		count[i] = words[i].length();
	} return count;
}
	
	// Method 20:
public static boolean evenGreaterThanOdd(String[] words) {
	int sumEven = 0;
	int sumOdd = 0;
	for(String word : words) {
		if (word.length() % 2 == 0) {
			sumEven += word.length();
		} else {
			sumOdd += word.length();
		}
	} if (sumEven > sumOdd) {
		return true;
	} else {
		return false;
	}
}
	
	// Method 21:
public static boolean palindrome(String word) {
	int endOfWord = word.length()-1;
	for (int i = 0; i < word.length() / 2; i++) {
		if (word.charAt(i) == (word.charAt(endOfWord))) {
			endOfWord--;
		} else {
			return false;
		}
	} return true;
}

}