package algorithm.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 5, 7, 2, 10, 8, 9, 100, 87, 82, 74, 12, 41, 98, 99 };

		System.out.println(Arrays.toString(array));

		quickSort(array);

		System.out.println(Arrays.toString(array));
	}

	public static void quickSort(int[] array) {

		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int[] array, int left, int right) {

		int pivotLeft = left;
		int pivotRight = right;

		int pivot = (left + right) / 2;                            	// pivot은 각 끝의 중간 값으로 선택한다.
		int pivotValue = array[pivot];								// 이 값을 이용해 정렬한다.

		do {														// left와 right가 만나거나 교차할 때까지 수행한다.
			while (array[pivotLeft] < pivotValue) {                	// 좌측부터 비교하여 pivot과 동일하거나 큰 값이 left 값을 증가시킨다.
				pivotLeft++;
			}

			while (array[pivotRight] > pivotValue) {            	// 우측부터 비교하여 pivot과 동일하거나 작은 값이 찾을 때까지 right 값을 감소시킨다.
				pivotRight--;
			}

			if (pivotLeft <= pivotRight) {							// left와 right가 만나거나 교차했다면 현재 가리키는 값을 바꿔준다.
				swap(array, pivotLeft++, pivotRight--);
			}
		} while (pivotLeft <= pivotRight);

		if (left < pivotRight) {									// left가 pivot 수행된 right보다 작으면 좌측 그룹의 수가 1개 이상이기 때문에 left~pivotRight까지 수행한다.
			quickSort(array, left, pivotRight);
		}

		if (pivotLeft < right) {									// pivot 수행된 left가 right보다 작으면 우측 그룹의 수가 1개 이상이기 때문에 pivotLeft~right까지 수행한다.
			quickSort(array, pivotLeft, right);
		}
	}

	private static void swap(int[] array, int left, int right) {

		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
}
