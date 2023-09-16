package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최대공약수와 최소공배수
 *
 * 첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.
 * 첫째 줄에는 입력으로 주어진 두 수의 최대공약수를, 둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다.
 *
 * https://www.acmicpc.net/problem/2609
 *
 */
public class _2609 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int a = Integer.parseInt(tokenizer.nextToken());
		int b = Integer.parseInt(tokenizer.nextToken());

		reader.close();

		// 값은 10000 이하의 값만 허용된다.
		if (a > 10000 || b > 10000) return;

		int gcd = gcd(a, b);
		int lcm = (a * b) / gcd;

		System.out.println(gcd);
		System.out.println(lcm);
	}

	private static int gcd(int a, int b) {
		if (a % b == 0) return b;
		return gcd(b, a % b);
	}
}
