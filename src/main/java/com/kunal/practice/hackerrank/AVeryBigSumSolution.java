/**
 * 
 */
package com.kunal.practice.hackerrank;

/**
 * @author kunal
 *
 */
public class AVeryBigSumSolution {

	public Long aVeryBigSum(long[] arrNum) {

		long arraySum = 0;

		for (long number : arrNum) {
			arraySum = arraySum + number;
		}
		return arraySum;
	}

}
