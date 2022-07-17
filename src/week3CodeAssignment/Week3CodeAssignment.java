package week3CodeAssignment;



public class Week3CodeAssignment {

	public static void main(String[] args) {
		
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 45};
	
	int firstNumber = 0;
	int lastNumber = 0;
	
	//subtracting the first number of the array from the last number
	
	for(int i = 0; i < ages.length; i++) {
		if(i < 1) {
			firstNumber = ages[i];
		}
	}
	
	
	for(int i1 = 0; i1 < ages.length; i1++) {
		if(i1 > -1) {
			lastNumber = ages[i1];
			}
		}
	
	System.out.println("The difference of the last number and the first number is:" + " " + (lastNumber - firstNumber));
	
	//calculating the average age in the array
	
	int sum = 0;
	
	for(int i = 0; i < ages.length; i++) {
		 sum = ages[i] +	sum;
	}
	
	int average = sum / ages.length;
	System.out.println("The average of my array is:" + " " + average);
	
	//finding the average length of name in this array
	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	int sumOfLetters = 0;
	
	for(int i = 0; i < names.length; i++) {

		String allNames = names[i];
		sumOfLetters += allNames.length();		
	}
	
	System.out.println("The average length of these names is:" + " " + sumOfLetters / names.length); 
	 
	//Concatenating all the names together with another loop
	
	String namesTogether = "";
	
	for(int i = 0; i < names.length; i++) {
		namesTogether = names[i] + " " + namesTogether;
	}
		System.out.println("All of the names together are:" + " " + namesTogether);

	//To access the last number of an array you would call the array and choose the first number which is always zero
	// example : System.out.println(testArray[0]);
		
	//To access the last number of an array you would call the length of the array -1
	//example :  System.out.println(testArray[testArray.length - 1]); 

	//add the number of letters in each name to a new string called NamesLengths
		
	int[] namesLengths = new int[6];
	
	for(int i = 0; i < namesLengths.length; i++) {
		 namesLengths[i] += names[i].length();	
	
	}
		
	//calculate the sum of all the values in the namesLengths array
	int sumOfLengths = 0;
	
	for(int i = 0; i < namesLengths.length; i++) {
		 sumOfLengths = namesLengths[i]	+ sumOfLengths;
	}
	System.out.println("The sum of letters in all these names is: " + sumOfLengths);
	
	//using a method to repeat a string a number of times depending on an int value
	
	String repeat = duplicate("Hello", 4);
	System.out.println(repeat);
	
	//demo of first + last name method
	String fullName = fullName("Jon", "Vinson");
	System.out.println("My full name is: " + fullName);
	
	//demo of array greater than 100 method
	int[] randomNumbers = {1, 90, 14, 5, 7, 9};
	boolean greaterThan100 = greaterThan100(randomNumbers);
	System.out.println("The sum of this array greater than 100: " + greaterThan100);
	
	//demo taking average of doubles
	double[] randomDoublesTwo = {12.5, 14.7, 33.2, 9.22, 11.41};
	double[] randomDoubles = {1.3, 2.3, 5.5, 77.5};
	double averageDoubles = averageOfDouble(randomDoubles);
	System.out.println("The average of this array is:" + averageDoubles);
	
	//demo is double array 1 average greater than double array 2 average
	
	boolean doublesGreaterThan = averageGreaterThan(randomDoubles, randomDoublesTwo);
	System.out.println("array 1 average is greater than array 2 average: " + doublesGreaterThan);
	
	//demo can I buy a drink method
	
	boolean isHotOutside = true;
	double moneyInPocket = 10.50;
	boolean canIbuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
	System.out.println("Can I buy a drink? " + canIbuyDrink);
	
	//demo stock counter method
	
	int amountOfShirts = 50;
	int amountOfPants = 50;
		boolean stockCheck = stockAmount(amountOfShirts, amountOfPants);
			System.out.println("Is there enough stock in the store? " + stockCheck);
	
	
	}
	
	//Method to print input word a number of times
	
	public static String duplicate(String word, int n) {
		String x = "";
		for(int i = 0; i < n; i++) {
			x += word;	
		}
		return x;	
	}
	
	//method that takes firstName and LastName and returns a full name
	
	public static String fullName(String firstName, String lastName) {
		String n = "";
		n = firstName + " " + lastName;
		return n;
	}
	
	//Takes array of int and returns true if sum is greater than 100
	
	public static boolean greaterThan100(int[] array) {
		boolean x = false;
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
		if(sum > 100) {
			x = true;
		}
		else {
			x = false;
		}
		return x;
	}
	
	//take a string of double and return an average
	
	public static double averageOfDouble(double[] array) {
		double x = 0;
		double sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
				x = sum / array.length;
		
		return x;

	
	}
	
	//is double 1 array average greater than double 2 array average
	
	public static boolean averageGreaterThan(double[] array, double[] arrayTwo) {
		boolean x = true;
		double sum = 0;
		double sum2 = 0;
		double averageOne = 0;
		double averageTwo = 0;
		
		for(int i = 0; i < array.length; i++) {
			sum = array[i] + sum;
		}
				averageOne = sum / array.length;
		
		for(int i = 0; i < arrayTwo.length; i++) {
					sum2 = arrayTwo[i] + sum2;
		}
				averageTwo = sum2 / arrayTwo.length;
	
		x = averageOne > averageTwo;
		return x;
	
}
	
	
	//willBuyDrink method
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean x = true;
		double enoughMoney = 10.50;
		 x = isHotOutside && (moneyInPocket > enoughMoney);
			
		return x;
	}
	
	//stock counting method for store
	
	public static boolean stockAmount(int x, int y) {
		boolean enoughStock = true;
		enoughStock = (x >= 45) && (y >= 25);
		return enoughStock;
		
		
	}
}
	
	

