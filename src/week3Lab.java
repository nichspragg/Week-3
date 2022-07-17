
public class week3Lab {

	public static void main(String[] args) {
		//create an array with the following values 1, 5, 2, 8, 13, 6
		int newArray[] = {1, 5, 2, 8, 13, 6};
		//print out the first element in the array
		System.out.println(newArray[0]);
		//print out the last element in the array without using the number 5
		System.out.println(newArray[newArray.length -1]);
		//write a traditional for loop that prints out each element in the array
		for(int i=0;i<newArray.length;i++) {
			System.out.print(newArray[i]+" "); }
		//write an enhanced for loop that prints out each element in the array
		for(int num : newArray) {
			System.out.println(num+" "); }
		//create a new variable called sum, write a loop that adds each element in the array to the sum
		int sum=0;
		for(int num : newArray) { sum += num; }
		//create a new variable called average and assign the average value of the array to it
		double average = sum/newArray.length;
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for(int num : newArray) { if(num%2==1) {System.out.println(num);} }
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String nameArray[] = {"Sam","Sally","Thomas","Robert"};
		//calculate the sum of all the letters in the new array
		int sumLetters = 0; for(String name:nameArray) { sumLetters+= name.length(); }
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greetPr("Jonah");
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		System.out.println(greetRtn("Clare"));
		//analyze the difference between these two methods - what do you find? How are they different?
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(compareString(5, "bologna"));
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		String[] words = {"pickle", "mustard", "oats", "bologna"};
		System.out.println(stringInArray(words, "oats"));
		//write and test a method that takes an array of int and returns the smallest number in the array
		int[] numbers = {2,7,4,6,9,8,3};
		System.out.println("The smallest number is: " + smallestInt(numbers));
		//write and test a method that takes an array of double and returns the average
		double[] ticketPrices = {15.23,12.35,33.56,24.31};
		System.out.println("The average price for taxi ride is: $" + averagePrice(ticketPrices));
		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the string at that position
		String[] myKids = {"Clare","Jonah","Finn","William"};
		int[] kidLength = stringLength(myKids);
		for(int kid : kidLength) { System.out.println(kid); }
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
		//even amount of letters is greater than the sum of those with an odd amount of letters.
		String[] wordsILike = {"decrease","cheese","treat","globe","result","attachment"};
		System.out.println(evenMoreOdd(wordsILike));
		//write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(palindrome("racecar"));
		
	}
	
	public static boolean palindrome(String string) {
		char[] test = new char [string.length()];
		char[] test2 = new char [string.length()];
		for(int i=0; i<string.length();i++) {
			test[i]=string.charAt(i); test2[string.length()-(i+1)]=string.charAt(i); }
		for(int i=0; i<string.length();i++) {
			if(test.equals(test2)) {
			return true; }}
		return false;
	}
	
	public static boolean evenMoreOdd(String [] tests) {
		int odd=0; int even=0;
		for (String test:tests) {
			if(test.length()%2==0) { even += test.length();
			} else if(test.length()%2==1) { odd += test.length(); } }
			return (even>odd);
	}
	
	public static int[] stringLength(String[] string) {
		int[] newArray = new int [string.length];
		for(int i=0;i<string.length;i++) {
			newArray[i] = string[i].length(); }
		return newArray;
	}
	
	public static double averagePrice(double[] prices) {
		double sum = 0;
		for(double price:prices) { sum += price; }
		return sum/prices.length; }

	public static int smallestInt(int[] numbers) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(smallest>numbers[i]) { smallest = numbers[i]; } }
		return smallest;
	}
	
	public static boolean stringInArray(String[] words, String check) {
		for(String word:words) {
			if(word.equals(check)) { return true; } }
			return false; } 

	public static boolean compareString(int i, String word) {
		if(word.length() == i) {
			return true; } else { return false; } }
		
	public static String greetRtn(String name) {
		String greet = "Hello " + name + "!";
		return greet;
	}

	public static void greetPr(String name) {
		System.out.println("Hello " + name + "!");
		
	}

}
