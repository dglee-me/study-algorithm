package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 최댓값
 *
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다. 주어지는 수는 100보다 작은 자연수 또는 0이다.
 * 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다. 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
 *
 * https://www.acmicpc.net/problem/2566*
 */
public class _2566 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int max = 0;
		int x = 1, y = 1;	// 0이 아닌 1로 초기화하는 이유는 행렬의 시작은 1행 1열 부터 시작이기 때문이다.

		for (int i = 1; i <= 9; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int j = 1; j <= 9; j++) {
				int n = Integer.parseInt(tokenizer.nextToken());
				if (max < n) {
					max = n;
					x = i;
					y = j;
				}
			}
		}

		reader.close();

		System.out.println(max);
		System.out.println(x + " " + y);
	}
}
