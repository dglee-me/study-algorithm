package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 소수 찾기
 *
 * 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 주어진 수들 중 소수의 개수를 출력한다.
 *
 * https://www.acmicpc.net/problem/1978
 */
public class _1978 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int result = 0;

		int N = Integer.parseInt(tokenizer.nextToken());
		if (N > 100) return;

		StringTokenizer decTokenizer = new StringTokenizer(reader.readLine());
		for (int i = 0; i < N; i++) {
			if (isDemical(Integer.parseInt(decTokenizer.nextToken())))
				result++;
		}

		System.out.print(result);
	}

	static boolean isDemical(int number) {
		// 0과 1은 소수에 포함되지 않으므로, 항상 false를 반환한다.
		if (number < 2) return false;

		// i로 나누어져 0이 남을 경우, 소수가 아니다.
		for (int i = 2; i < number; i++) {
			if (number % i == 0) return false;
		}

		return true;
	}
}
