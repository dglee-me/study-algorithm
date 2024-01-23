package algorithm.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 5, 7, 2, 10, 8, 9, 100, 87, 82, 74, 12, 41, 98, 99 };

		System.out.println(Arrays.toString(array));

		insertionSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(int[] array) {

		for (int currentIndex = 1; currentIndex < array.length; currentIndex++) {
			// 정렬 대상
			int currentElement = array[currentIndex];

			// 비교 대상
			int comparisonIndex = currentIndex - 1;

			// 비교 데이터의 index가 0이 될 때까지 확인한다.
			while (comparisonIndex >= 0 && currentElement < array[comparisonIndex]) {
				array[comparisonIndex + 1] = array[comparisonIndex];
				comparisonIndex--;
			}

			array[comparisonIndex + 1] = currentElement;
		}
	}
}
