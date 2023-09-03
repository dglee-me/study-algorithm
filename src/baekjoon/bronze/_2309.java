package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2309 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int[] array = new int[9];

		int sum = 0;
		int fake1 = 0, fake2 = 0;

		// 값 입력 및 정렬
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(new StringTokenizer(reader.readLine()).nextToken());
			sum += array[i];
		}

		reader.close();
		Arrays.sort(array);

		// 가짜 난쟁이 구하기
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (sum - array[i] - array[j] == 100) {
					fake1 = i;
					fake2 = j;
					break;
				}
			}
		}

		// 결과 출력
		for (int i = 0; i < array.length; i++) {
			if (i == fake1 || i == fake2) continue;
			System.out.println(array[i]);
		}
	}
}
