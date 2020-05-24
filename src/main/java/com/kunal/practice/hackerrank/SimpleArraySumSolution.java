/**
 * 
 */
package com.kunal.practice.hackerrank;

import java.util.Arrays;

/**
 * @author kunal
 *
 */
public class SimpleArraySumSolution {

	public int simpleArraySum(int[] arrNumber) {
		int arraySum = 0;

		for (int number : arrNumber) {
			arraySum = arraySum + number;
		}
		return arraySum;

	}

}
