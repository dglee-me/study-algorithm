package algorithm.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 5, 7, 2, 10, 8, 9, 100, 87, 82, 74, 12, 41, 98, 99 };

		// ex) array가 3개일때 0/1, 1/2 이렇게 비교하기 때문에 length-1 번 돌아야한다.
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}
}
