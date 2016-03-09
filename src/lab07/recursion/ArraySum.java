package lab07.recursion;

import java.util.Random;

/**
 * Recursive computation of the sum of all of the elements in an array.
 * 
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */
public class ArraySum {

	/**
	 * Compute the total of all of the elements in arr using recursion. You may
	 * assume that the array contains at least 1 element (i.e. arr.length >= 1)
	 * 
	 * @param arr
	 *            the array to sum up.
	 * @return the total of all of the elements in the array.
	 */
	public static int arraySum(int[] arr) {
		return simpler(arr, 0, arr.length - 1);
	}

	private static int simpler(int[] arr, int start, int end) {
		int finalSum = 0;
		if (start > end) {
			return 0;
		} else if (start == end) {
			return arr[start];
		} else {
			finalSum = finalSum + arr[start] + arr[end]
					+ simpler(arr, start + 1, end - 1);
			start++;
			end--;
		}
		return finalSum;

	}

	public static void main(String[] args) {
		int[] arr1 = new int[6];
		arr1[0] = 2;
		arr1[1] = 7;
		arr1[2] = 19;
		arr1[3] = 20;
		arr1[4] = 5;
		arr1[5] = 9;

		System.out.println(arraySum(arr1));
	}

}
