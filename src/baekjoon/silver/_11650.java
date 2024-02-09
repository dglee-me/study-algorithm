package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11650 {
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
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}
			});

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < N; i++) {
				builder.append(array[i][0])
					   .append(" ")
					   .append(array[i][1])
					   .append("\n");
			}
			System.out.println(builder);
		}
	}
}
