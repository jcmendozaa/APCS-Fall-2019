import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a value for \"a\"");
		int a = scnr.nextInt();
		System.out.println("Enter a value for \"b\"");
		int b = scnr.nextInt();
		System.out.println("Enter a value for \"c\"");
		int c = scnr.nextInt();
		System.out.print(Quadratic.quadDescriber(a, b, c));
	}

}
