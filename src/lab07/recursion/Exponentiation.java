package lab07.recursion;

/**
 * Recursive computation of x^n.
 * 
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */
public class Exponentiation {

	/**
	 * Compute the value of x^n.
	 * 
	 * @param x
	 *            the base (non-negative integer)
	 * @param n
	 *            the exponent (non-negative integer)
	 * @return x^n
	 */
	public static long exp(int x, int n) {
		if (n == 1) {
			return x;
		} else {
			if ((n % 2) == 0) {
				long halfPower = exp(x, n/2);
				return halfPower * halfPower;
			} else {
				return x * exp(x, n-1);
			}
		}
	}
}
