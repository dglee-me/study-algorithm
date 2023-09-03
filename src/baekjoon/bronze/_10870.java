package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 피보나치 수 5
 *
 * 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0이다.
 * 첫째 줄에 n번째 피보나치 수를 출력한다.
 *
 * https://www.acmicpc.net/problem/10870
 */
public class _10870 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(tokenizer.nextToken());
		if (n < 0 || n > 20) return;

		System.out.println(fivonacci(n));
	}

	static int fivonacci(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;
		return fivonacci(n - 1) + fivonacci(n - 2);
	}
}
