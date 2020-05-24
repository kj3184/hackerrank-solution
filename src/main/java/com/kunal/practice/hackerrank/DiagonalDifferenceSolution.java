/**
 * 
 */
package com.kunal.practice.hackerrank;

import java.util.List;

/**
 * @author kunal
 *
 */
public class DiagonalDifferenceSolution {

	public int diagonalDifference(List<List<Integer>> arr) {

		int output_difference = 0;
		int primary_diagonal_sum = 0;
		int secondary_diagonal_sum = 0;
		int listSize=arr.size();

		for (int iterator = 0; iterator < listSize; iterator++) {
			primary_diagonal_sum += arr.get(iterator).get(iterator);

		}

		for (int reverseiterator = 0; reverseiterator < listSize; reverseiterator++) {
			secondary_diagonal_sum += arr.get(reverseiterator).get(listSize - 1 - reverseiterator);

		}

		output_difference = primary_diagonal_sum - secondary_diagonal_sum;

		return java.lang.Math.abs(output_difference);
	}

}
