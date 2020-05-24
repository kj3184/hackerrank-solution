/**
 * 
 */
package com.kunal.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kunal
 *
 */
public class CompareTripletsSolution {

	public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		int alice_rating = 0, bob_rating = 0;

		List<Integer> ratingOutput = new ArrayList<Integer>();

		for (int iterator = 0; iterator < a.size(); iterator++) {
			if (a.get(iterator) > b.get(iterator))
				alice_rating++;
			else if (a.get(iterator) < b.get(iterator))
				bob_rating++;

		}
		ratingOutput.add(alice_rating);
		ratingOutput.add(bob_rating);

		return ratingOutput;

	}

}
