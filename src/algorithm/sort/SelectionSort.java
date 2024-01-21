package algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 5, 7, 2, 10, 8, 9, 100, 87, 82, 74, 12, 41, 99, 98 };

		System.out.println(Arrays.toString(array));

		selectionSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void selectionSort(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}

			swap(array, i, minIndex);
		}
	}

	private static void swap(int[] array, int currentIndex, int minIndex) {

		int temp = array[currentIndex];
		array[currentIndex] = array[minIndex];
		array[minIndex] = temp;
	}
}
