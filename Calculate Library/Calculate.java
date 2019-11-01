/* JC Mendoza
 * August 29 2019
 * Library of math functions.
 */
public class Calculate {
	// method square get the square number of the input
	public static int square(int number) {
		return number*number;
	}
	// method cube gets the cube number of the input
	public static int cube(int integer) {
		int cube = 0;
		cube = integer*integer*integer;
		return cube;
	}
	// method average takes average of two input numbers
	public static double average(double number1, double number2) {
		double average = (number1 + number2) / 2;
		return average;
	}
	// method average takes average of three input numbers
	public static double average(double number1, double number2, double number3) {
		double answer = (number1 + number2 + number3) / 3;
		return answer;
	}
	// method toDegrees converts radian to degree
	public static double toDegrees(double radian) {
		double degree;
		degree = radian * (180 / 3.14159);
		return degree;
	}
	// method toRadians converts degrees to radian
	public static double toRadians(double degree) {
		double radian;
		radian = degree * (3.14159 / 180);
		return radian;
	}
	// method discriminant returns the discriminant of a quadratic equation in standard form.
	public static double discriminant(double input1, double input2, double input3) {
		double discriminant;
		discriminant = (input2 * input2) - (4 * input1 * input3);
		return discriminant;   
	}
	public static String toImproperFrac(int whole, int numerator, int denominator) {
		String answer;
		answer = ((whole*denominator + numerator) + "/" + denominator);
		return answer;
	}
	public static String toMixedNum(int numerator, int denominator) {
		String answer;
		answer = (numerator / denominator + " " + numerator % denominator + "/" + denominator);
		return answer;
	}
	public static String foil(int input1, int input2, int input3, int input4, String letter) {
		String a;
		String b;
		int c;
		String combined;
		a = (input1 * input3) + "n^2 + ";
		b = (input2 * input3) + (input1 * input4) + "n + ";
		c = (input2 * input4);
		combined = a + b + c;
		return combined;
	}
	public static boolean isDivisibleBy(int input1, int input2) {
		if((input1 % input2 == 0) || (input2 % input1 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	public static double absValue(double number) {
		if(number < 0) {
			number *= -1;
		}
		return number;
	}
	public static double max(double input1, double input2) {
		if(input1 > input2) {
			return input1;
		} else {
			return input2;
		}
	}
	public static double max(double number1, double number2, double number3) {
		double greaterNum;
		if ((number1 > number2) && (number1 > number3)) {
			greaterNum = number1;
		} else {
			if ((number2 > number1) && (number2 > number3)) {
				greaterNum = number2;
			} else {
				greaterNum = number3;
			}
		  }
		return greaterNum;
	}
	public static int min(int number1, int number2) {
		int minimum;
		if (number1 >= number2) {
			minimum = number1;
		} else {
			minimum = number2;
		  }
		return minimum;
	}
	public static double round2(double input) {
		double answer;
		double thousandDigit = input % 0.01;
		if(thousandDigit > .005) {
			answer = (input + 0.01) - thousandDigit;
		} else {
			answer = (input - thousandDigit);
		}
		return answer;
	}
	public static double exponent(double integer, int power) {
		double answer = integer;
		int i = 1;
		if (power == 0) {
			answer = 1;
		} else {
		while(i != power) {
			answer *= integer;
			i ++;
		}
		}
		return answer; 
	}
	public static int factorial(int integer) {
		int answer = 1;
		for(int i = 1; i <= integer; i++) {
			answer *= i;
		}
		return answer;
	}
	public static boolean isPrime(int input) {
		boolean answer = true; 
		if ((input % 2 == 0) || (input % 3 == 0)) {
			answer = false;
		}
		return answer;
	}
	public static int gcf(int input1, int input2) {
		int gcomFactor = 1;
		int input1Factor = 1;
		int input2Factor = 1;
		int largerInput = (int) Calculate.max(input1, input2);
		for(int i = 1; i <= largerInput; i++) {
			if(input1 % i == 0) {
				input1Factor = i;
			}
			if(input2 % i == 0) {
				input2Factor = i;
			}
			if(input2Factor == input1Factor) {
				gcomFactor = input1Factor;
			}
		}
		return gcomFactor;
	}
	public static double sqrt(double number) {
		double goodGuess = number / 2;
		if (number < 0) {
			throw new IllegalArgumentException("Number must be greater than 0"); 
		}
		while (((goodGuess * goodGuess) - number) >= .005 || ((goodGuess * goodGuess) - number) <= -.005) {
			goodGuess = 0.5 * (number / goodGuess + goodGuess);
		}
		return round2(goodGuess);
	}
	public static String quadForm(int input1, int input2, int c) {
		double root1=0;
		double root2=0;
		if (discriminant(input1, input2, c) < 0) {
		return "no real roots";
		}
		else if (discriminant(input1, input2, c) > 0) {
			root1=(-input2 + sqrt(discriminant(input1, input2, c)))/(2 * input1);
			root2=(-input2 - sqrt(discriminant(input1, input2, c)))/(2 * input1);
			return round2(root1)+ " and " +round2(root2);
		}
		else {
			root1 = -input2 / (2 * input1);
			return round2(root1)+"";
		}
	}
}
	
	
	
	
