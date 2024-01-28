package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _10815 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			int N = Integer.parseInt(reader.readLine());

			HashSet<Integer> cardSet = new HashSet<>(N);

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < N; i++) {
				cardSet.add(Integer.parseInt(tokenizer.nextToken()));
			}

			StringBuilder builder = new StringBuilder();

			int M = Integer.parseInt(reader.readLine());
			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < M; i++) {
				boolean isContained = cardSet.contains(Integer.parseInt(tokenizer.nextToken()));
				builder.append(isContained ? 1 : 0).append(" ");
			}

			System.out.println(builder);
		}
	}

}
