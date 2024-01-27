package algorithm.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 5, 7, 2, 10, 8, 9, 100, 87, 82, 74, 12, 41, 98, 99 };

		System.out.println(Arrays.toString(array));

		mergeSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void mergeSort(int[] array) {

		mergeSort(array, 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int start, int end) {

		if (start < end) {
			final int mid = (start + end) / 2;

			mergeSort(array, start, mid);            // 배열을 반으로 나누었을 때 좌측을 병합 정렬
			mergeSort(array, mid + 1, end);     // 배열을 반으로 나누었을 때 우측을 병합 정렬

			merge(array, start, mid, end);
		}
	}

	private static void merge(int[] array, int start, int mid, int end) {

		int n1 = mid - start + 1;          // 좌측 배열의 크기
		int n2 = end - mid;                // 우측 배열의 크기

		// (임시) 좌측 배열과 우측 배열을 생성
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftArray[i] = array[start + i];
		}
		for (int i = 0; i < n2; i++) {
			rightArray[i] = array[mid + 1 + i];
		}

		int i = 0, j = 0, k = start;

		while (i < n1 && j < n2) {
			if (leftArray[i] <= rightArray[j]) {
				array[k++] = leftArray[i++];
			} else {
				array[k++] = rightArray[j++];
			}
		}

		// 좌측 배열과 우측 배열 중 하나가 먼저 정렬이 끝났을 경우 남은 배열을 병합
		while (i < n1) {
			array[k++] = leftArray[i++];
		}
		while (j < n2) {
			array[k++] = rightArray[j++];
		}
	}

}
