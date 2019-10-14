import java.util.Scanner;

public class processingNumber {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers are you entering?");
		int numberOfInputs = userInput.nextInt();
		System.out.println("Enter first input: ");
		int firstInput = userInput.nextInt();
		int max = firstInput;
		int min = firstInput;
		int evenSum = 0;
		int maxEven;
		if(firstInput % 2== 0) {
			evenSum = firstInput;
			maxEven = firstInput;
		} else {
			evenSum = 0;
			maxEven = -1;
		}
		
		for(int i = 1; i <= numberOfInputs - 1; i++) {
			System.out.println("Enter next number");
			int input = userInput.nextInt();
			if(input % 2 == 0) {
				evenSum += input;
				if(input > maxEven) {
					maxEven = input;
				}
			}
			if(input < min) {
				min = input;
			}
			else {
				max = input;
			}
			if(maxEven == -1) {
				maxEven = input;
			}

			}
		System.out.println("The smallest number: " + min);
		System.out.println("The biggest number: " + max);
		System.out.println("The sum of the even numbers: " + evenSum);
		System.out.println("The largest Even number: " + maxEven);
	}

}
