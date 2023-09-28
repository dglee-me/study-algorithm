package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N번째 큰 수
 *
 * 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 배열 A의 원소 10개가 공백으로 구분되어 주어진다. 이 원소는 1보다 크거나 같고, 1,000보다 작거나 같은 자연수이다.
 * 각 테스트 케이스에 대해 한 줄에 하나씩 배열 A에서 3번째 큰 값을 출력한다.
 *
 * https://www.acmicpc.net/problem/2693
 */
public class _2693 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int T = Integer.parseInt(tokenizer.nextToken());
		if (T < 1 || T > 1000) return;

		int result[] = new int[T];

		for (int i = 0; i < T; i++) {
			StringTokenizer arrTokenizer = new StringTokenizer(reader.readLine());

			int arr[] = new int[10];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(arrTokenizer.nextToken());
			}

			// 정렬 후 배열에서 3번째로 큰 값을 저장한다.
			Arrays.sort(arr);
			result[i] = arr[7];
		}

		// 결과 출력
		for (int value : result) {
			System.out.println(value);
		}
	}
}
