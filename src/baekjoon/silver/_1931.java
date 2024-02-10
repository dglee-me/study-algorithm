package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1931 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			int[][] array = new int[N][2];
			for (int i = 0; i < N; i++) {
				StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
				array[i][0] = Integer.parseInt(tokenizer.nextToken());
				array[i][1] = Integer.parseInt(tokenizer.nextToken());
			}

			Arrays.sort(array, (o1, o2) -> {
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				} else {
					return o1[1] - o2[1];
				}
			});

			int count = 0;
			int prev = 0;

			for (int i = 0; i < N; i++) {
				if (prev <= array[i][0]) {    	// 시작 시간이 기존 종료 시간보다 클 경우
					prev = array[i][1];    		// 종료 시간을 갱신
					count++;
				}
			}

			System.out.println(count);
		}
	}

}
