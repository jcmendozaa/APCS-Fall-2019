public class Quadratic {
	public static String quadDescriber(double a, double b, double c) {
		double symmetry = axisOfSymmetry(a, b);
		
		String description = "\nDescription of the graph of:\n";
		description += "y = " + quadForm(a, b, c) + "\n\n";
		description += "Opens: " + concavity(a) + "\n";
		description += "Axis of Symmetry: " + symmetry + "\n";
		description += "Vertex: " + vertex(a, b, c, symmetry) + "\n";
		description += "x-intercept(s): " + roots(a, b, c) + "\n";
		description += "y-intercepts: " + c + "\n";
		
		return description;
	}
	
	public static String concavity(double a) {
		if(a < 0) {
			return "Down";
		}
		return "Up";
	}
	
	public static double axisOfSymmetry(double a, double b) {
		return ((-1 * b)/(2 * a));
	}
	
	public static String vertex(double a, double b, double c, double symmetry) {
		return "(" + symmetry + ", " + round2((a * square(symmetry) + b * symmetry + c)) + ")";
	}
	
	public static double square(double num) {
		return num*num;
	}
	
	public static String roots(double a, double b, double c) {
		double discrim = discriminant(a, b, c);
		if(discrim < 0){
			return "No real roots";
		}
	    discrim = sqrt(discrim);
    	double root1 = (-1*b + discrim)/(2*a);
    	System.out.println(root1);
    	double root2 = (-1*b - discrim)/(2*a);
    	System.out.println(root2);
    	if(root1 == root2){
    		return "" + round2(root1);
    	}
 
    	return round2(root1) + " and " + round2(root2);
	}
	
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
	public static String quadForm(double a, double b, double c) {
		return a + "x^2 + " + b + "x + " + c;
	}
}
	
	
	
	
