/*JC Mendoza
 * 3rd period
 * Prints out square of a number.
 * September 3 2019
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(2));
		System.out.println(Calculate.average(4.5,5.5));
		System.out.println(Calculate.average(2.5, 5.5, 4.5));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.toRadians(274));
		System.out.println(Calculate.toImproperFrac(1, 5, 3));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(2,71));
		System.out.println(Calculate.absValue(-5.123));
		System.out.println(Calculate.max(5.123, -2.55555555));
		System.out.println(Calculate.max(3, 5, 100));
		System.out.println(Calculate.min(46, 7));
		System.out.println(Calculate.round2(3.321));
		System.out.println(Calculate.exponent(2,0));
		System.out.println(Calculate.factorial(3));
		System.out.println(Calculate.isPrime(7));
		System.out.println(Calculate.gcf(9, 27));
		System.out.println(Calculate.sqrt(9));
	}

}
