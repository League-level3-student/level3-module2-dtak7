package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD

	@Test
	public void testLinearSearch() {
		String[] words = { "one", "two", "three", "four" };
		// 1. use the assertEquals method to test your linear search method.
		assertEquals(2, _00_LinearSearch.linearSearch(words, "three"));
		assertEquals(3, _00_LinearSearch.linearSearch(words, "four"));
		assertEquals(-1, _00_LinearSearch.linearSearch(words, "tacooo"));
	}

	@Test
	public void testBinarySearch() {
		int[] array = { 0, 1, 2, 3, 4, 5 };
		// 2. use the assertEquals method to test your binary search method.
		// remember that the array must be sorted
		assertEquals(2, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 2));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 6));
	}

	@Test
	public void testInterpolationSearch() {
		int[] array = { 0, 1, 2, 3, 4, 5 };
		// 3. use the assertEquals method to test your interpolation search method.
		// remember that the array must be sorted and evenly distributed
		assertEquals(3, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 3));
		assertEquals(-1, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 6));
	}

	@Test
	public void testExponentialSearch() {
		int[] array = { 0, 1, 2, 3, 4, 5 };
		// 4. use the assertEquals method to test your exponential search method.
		// remember that the array must be sorted
		assertEquals(3, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 3));
		assertEquals(5, _01_BinarySearch.binarySearch(array, 0, array.length - 1, 5));
	}
}
