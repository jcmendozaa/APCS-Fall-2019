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
		
	}
}
