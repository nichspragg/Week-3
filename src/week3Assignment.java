import java.util.Arrays;
import java.util.Scanner;

public class week3Assignment {

	public static void main(String[] args) {
		
		//an array of int called ages
		int[] ages = {14, 3, 9, 23, 64, 2, 8, 28, 93};
		//last element - first element
		ages[ages.length-1] = ages[ages.length-1]-ages[0];
		System.out.print("The ages of the group are: ");
		for(int age:ages) { System.out.print(age + " "); }
		
		//calculate average age
		int avAge = 0; // People say average age as a whole number. Could use double if intended for more scientific research.
		for(int age:ages) {	avAge += age; }
		avAge = avAge/ages.length;
		System.out.println("\nThe averag age of the group is: " + avAge);
		
		//an array of String called names
		String names[] = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		//average number of letters per name
		double avLetters = 0; // int or double would probably work depending on intended use
		for(String name:names) { avLetters += name.length(); } avLetters = avLetters/names.length;
		System.out.println("The average letters of the name for the group is: " + avLetters);
		//concatenate all the names together, separated by spaces, and print
		StringBuffer temp = new StringBuffer();
		for(String name:names) { temp.append(name+" "); }
		String allNames = temp.toString(); System.out.println(allNames);
		
		//How do you access the last element of any array?
		System.out.println("\nTo access the last element of an array, use the array name then a . then length to get the length of the array.");
		System.out.println("Since the last element is 1 less (because it starts at 0), you will then subtract 1");
		System.out.println("The result would look like 'arrayName[arrayName.length-1]'");
		//How do you access the first element of any array?
		System.out.println("\nThe first element of any array would be 0. ex: arrayName[0]\n");
		
		//array of int called nameLengths with the length of each name from names array
		int[] nameLengths = new int [names.length];
		for(int i=0;i<names.length;i++) { nameLengths[i] = names[i].length(); }
		//calculate the sum of all elements & Print
		int sumLetters =0;
		for(int num:nameLengths) { sumLetters += num; } System.out.println(sumLetters);
		
		//method that returns the word concatenated n number of times
		System.out.println(repeatW("Math",4)); 
		
		//method that takes two Strings, firstName and lastName, and returns a full name
		System.out.println(fullName("Nich","Spragg")); 
		
		int[] testArray1 = {24,12,33,44};
		int[] testArray2 = {2,4,6,8};
		//method that returns true if the sum of the array is greater than 100.
		System.out.println("Test 1: " + greater100(testArray1));
		System.out.println("Test 2: " + greater100(testArray2));
		
		double[] doubleTest = {23.432,35.664,76.234,25.885};
		double[] doubleTest2 = {35.764,24.763,23.467,32.245};
		//method that returns the double average of all the elements
		System.out.println("The average is: " + doubAvg(doubleTest));
		System.out.println("The average of the second array is: " + doubAvg(doubleTest2));
		//returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		System.out.println("Is the first array greater: " + greaterArray(doubleTest, doubleTest2)); 
		
		//method returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		boolean isHotOutside = true; double moneyInPockets = 4.24;
		System.out.println("Will I buy a drink in summer before payday: " + willBuyDrink(isHotOutside,moneyInPockets));
		isHotOutside = true; moneyInPockets = 12.24;
		System.out.println("Will I buy a drink in summer after payday: " + willBuyDrink(isHotOutside,moneyInPockets));
		isHotOutside = false; moneyInPockets = 14.24;
		System.out.println("Will I buy a drink in winter after payday: " + willBuyDrink(isHotOutside,moneyInPockets));
		
		//method of your own that solves a problem
		//This method prompts the user to enter a username and password. It searches the list of usernames for a match.
		//If there is a match, it stores the index number and looks for a match at the same index on the list of passwords
		String[] usernameBank = {"nspragg","jbro","Java9"};
		String[] passwordBank = {"oreo138","jocker","heart"};
		System.out.println("Password test 1 is: " + passwordChecker(usernameBank,passwordBank));
		System.out.println("Password test 2 is: " + passwordChecker(usernameBank,passwordBank));
		
	}
		
	public static String repeatW(String word, int n) {
		return word.repeat(n);
		}
		
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		}
		
	public static boolean greater100(int[] arr) {
		int sumArray =0;
		for(int num:arr) { sumArray += num;	}
		if(sumArray>100) { return true; } else { return false; }
		}
		
	public static double doubAvg(double[] arr) {
		double avg =0;
		for(double num:arr) { avg += num; } 
		return avg/arr.length;
		}
		
	public static boolean greaterArray(double[] boo1, double[] boo2) {
		double avg1 =0; double avg2 =0;
		for(double num:boo1) { avg1 += num; } avg1 = avg1/boo1.length;
		for(double num:boo2) { avg2 += num; } avg2 = avg2/boo2.length;
		if(avg1>avg2) {	return true; } else { return false; }
		}
		
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPockets) {
		if(isHotOutside && moneyInPockets>10.50) { return true; } else { return false; }
		}
		
	public static boolean passwordChecker(String[] userBank,String[] passBank) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nPlease enter username: ");
		String checkUser = sc.next();
		int pos = Arrays.asList(userBank).indexOf(checkUser);
		System.out.print("Please enter password: ");
		String checkPass = sc.next();
		if(passBank[pos].equals(checkPass)) { return true; } else { return false; }
		}

}
