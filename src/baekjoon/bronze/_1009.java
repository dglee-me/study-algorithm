package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 분산처리
 *
 * 입력의 첫 줄에는 테스트 케이스의 개수 T가 주어진다. 그 다음 줄부터 각각의 테스트 케이스에 대해 정수 a와 b가 주어진다. (1 ≤ a < 100, 1 ≤ b < 1,000,000)
 * 각 테스트 케이스에 대해 마지막 데이터가 처리되는 컴퓨터의 번호를 출력한다.
 *
 * https://www.acmicpc.net/problem/1009
 */
public class _1009 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 테스트케이스 갯수
		int T = Integer.parseInt(reader.readLine());

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());

			// 제곱 시 1부터 시작
			int computer = 1;
			for (int j = 0; j < b; j++) {
				// b의 갯수만큼 거듭 제곱을 수행하며 수가 커지지 않게 미리 10으로 나누어 나머지를 구한다.
				computer = (a * computer) % 10;
			}

			// 나머지가 0이라면 10번 컴퓨터
			builder.append((computer == 0 ? 10 : computer) + "\n");
		}

		// 결과 출력
		System.out.print(builder);
	}
}
