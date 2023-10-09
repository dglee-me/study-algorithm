package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 평균은 넘겠지
 *
 * 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
 * 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 *
 * 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다. 정답과 출력값의 절대/상대 오차는 10-3이하이면 정답이다.
 *
 * https://www.acmicpc.net/problem/4344
 */
public class _4344 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int C = Integer.parseInt(reader.readLine());

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < C; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int N = Integer.parseInt(tokenizer.nextToken());
			int[] array = new int[N];

			double sum = 0;
			for (int j = 0; j < N; j++) {
				array[j] = Integer.parseInt(tokenizer.nextToken());
				sum += array[j];
			}

			double count = 0;
			double avg = sum / N;

			for (int j = 0; j < N; j++) {
				if (array[j] > avg) count++;
			}

			// 3자리 표시
			builder.append(String.format("%.3f%%", (count / N) * 100) + "\n");
		}
		System.out.print(builder);
	}
}
