package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 더하기 사이클
 *
 * https://www.acmicpc.net/problem/1110
 */
public class _1110 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int cycle = 0;

		int N = Integer.parseInt(reader.readLine());
		int temp = N;

		do {
			int left = temp / 10;						// 만약 26이라면, 2를 반환한다.
			int right = temp % 10;						// 만약 26이라면, 6을 반환한다.

			temp = right * 10 + (left + right) % 10;    // right를 10의 자리로, left + right를 1의 자리로 만든다.
			cycle++;
		} while (temp != N);

		System.out.println(cycle);
	}
}
