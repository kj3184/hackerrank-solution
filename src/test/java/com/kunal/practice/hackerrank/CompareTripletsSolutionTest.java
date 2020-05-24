/**
 * 
 */
package com.kunal.practice.hackerrank;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * @author kunal
 *
 */
class CompareTripletsSolutionTest {
	
	CompareTripletsSolution solution=new CompareTripletsSolution();

	@Test
	void testCompareTriplets() {

		List<Integer> a=new ArrayList<Integer>();
		a.add(17);
		a.add(28);
		a.add(30);
		
		List<Integer> b=new ArrayList<Integer>();
		b.add(99);
		b.add(16);
		b.add(8);
		
		assertEquals(2, solution.compareTriplets(a,b).get(0));
		assertEquals(1, solution.compareTriplets(a,b).get(1));
		
	}

}
