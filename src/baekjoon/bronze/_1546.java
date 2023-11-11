package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균
 *
 * https://www.acmicpc.net/problem/1546
 *
 */
public class _1546 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 시험 본 과목의 개수 N을 입력받는다.
		int N = Integer.parseInt(reader.readLine());
		int M = 0;

		// N개의 시험 점수를 입력받는다.
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int[] score = new int[N];
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(tokenizer.nextToken());
			if (M < score[i]) M = score[i];
		}

		reader.close();

		// 점수를 조작한다.
		double avg = 0;
		for (int i = 0; i < N; i++) {
			avg += (double) score[i] / M * 100;
		}
		System.out.print(avg / N);
	}
}
