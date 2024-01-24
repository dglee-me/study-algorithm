package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _1920WithHashSet {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());
			HashSet<String> set = new HashSet<>();

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < N; i++) {
				set.add(tokenizer.nextToken());
			}

			int M = Integer.parseInt(reader.readLine());
			tokenizer = new StringTokenizer(reader.readLine());

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < M; i++) {
				if (set.contains(tokenizer.nextToken())) {
					builder.append("1" + "\n");
				} else {
					builder.append("0" + "\n");
				}
			}
			System.out.println(builder);
		}
	}
}
