/**
 * Solution for HackerRank practice data structure - level medium
 */
package com.kunal.practice.hackerrank;

/**
 * There is a collection of input strings and a collection of query strings. For
 * each query string, determine how many times it occurs in the list of input
 * strings.
 * 
 * @author kunal
 *
 */
public class SparseArraySolution {

	public int[] matchingStrings(String[] strings, String[] queries) {

		int[] output = new int[queries.length];
		int interimVar = 0;

		for (int iterator = 0; iterator < queries.length; iterator++) {

			for (String str : strings) {
				if (queries[iterator].equalsIgnoreCase(str))
					interimVar++;
			}

			output[iterator] = interimVar;
			interimVar = 0;

		}

		return output;

	}

}
