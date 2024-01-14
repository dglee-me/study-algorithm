package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class _1764 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int N = Integer.parseInt(tokenizer.nextToken());
			int M = Integer.parseInt(tokenizer.nextToken());

			HashSet<String> set = new HashSet<>(N);
			for (int i = 0; i < N; i++) {
				set.add(reader.readLine());
			}

			List<String> list = new ArrayList<>();
			for (int i = 0; i < M; i++) {
				final String mStr = reader.readLine();
				if (set.contains(mStr)) {
					list.add(mStr);
				}
			}

			Collections.sort(list);

			StringBuilder builder = new StringBuilder();
			builder.append(list.size() + "\n");

			for (int i = 0; i < list.size(); i++) {
				builder.append(list.get(i) + "\n");
			}

			System.out.println(builder);
		}
	}
}
