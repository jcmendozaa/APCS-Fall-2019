import java.util.Scanner;
// input example : 
public class FracCalc {
	public static String produceAnswer(String input) {
		String inputString = input;
		String newFrac = "";
		if(inputString == "quit") {
			newFrac = "Bye";
		} else {
			char operator = inputString.charAt(inputString.indexOf(" ") + 1);
			String firstValue = inputString.substring(0, inputString.indexOf(" "));
			String secondValue = inputString.substring(firstValue.length() + 3, inputString.length());
			int wholeNum;
			int firstNumerator;
			int firstDenominator;
			int secondNumerator;
			int secondDenominator;	
		}
		return newFrac;
	}
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the fraction: \nEnter \"quit\" to quit:");
		String frac = scnr.nextLine();
		System.out.println(FracCalc.produceAnswer(frac));
	}

}
