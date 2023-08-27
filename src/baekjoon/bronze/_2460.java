package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 지능형 기차 2
 *
 * 각 역에서 내린 사람 수와 탄 사람 수가 빈칸을 사이에 두고 첫째 줄부터 열 번째 줄까지 역 순서대로 한 줄에 하나씩 주어진다.
 * 첫째 줄에 최대 사람 수를 출력한다.
 *
 * https://www.acmicpc.net/problem/2460
 */
public class _2460 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int max = 0, human = 0;

		for (int i = 0; i < 10; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int out = Integer.parseInt(tokenizer.nextToken());
			int in = Integer.parseInt(tokenizer.nextToken());

			human = human - out + in;

			if (human > max) max = human;
		}

		System.out.print(max);
	}
}
