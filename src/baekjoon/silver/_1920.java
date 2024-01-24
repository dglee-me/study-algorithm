package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());
			int[] array = new int[N];

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(tokenizer.nextToken());
			}

			// 정렬
			Arrays.sort(array);

			int M = Integer.parseInt(reader.readLine());
			tokenizer = new StringTokenizer(reader.readLine());

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < M; i++) {
				if (binarySearch(array, Integer.parseInt(tokenizer.nextToken()))) {
					builder.append("1" + "\n");
				} else {
					builder.append("0" + "\n");
				}
			}

			System.out.println(builder);
		}
	}

	private static boolean binarySearch(int[] array, int target) {

		int low = 0;                  		     // 처음 인덱스
		int high = array.length - 1;    		 // 마지막 인덱스

		while (low <= high) {            		 // 탐색 범위는 low가 high를 초과하기 전까지
			int mid = (low + high) / 2;    		 // 배열의 중간부터 탐색한다.

			if (target < array[mid]) {    		 // 탐색 대상이 중간값보다 작다면 high는 mid보다 작을 수 밖에 없다.
				high = mid - 1;
			} else if (target > array[mid]) {    //	탐색 대상이 중간값보다 크다면 low는 mid보다 클 수 밖에 없다.
				low = mid + 1;
			} else {                             // 탐색 대상이 작거나 크지 않으면 같다는 뜻일테니 true를 반환
				return true;
			}
		}

		// 모든 배열을 탐색해도 발견하지 못했으면 false를 반환
		return false;
	}
}
