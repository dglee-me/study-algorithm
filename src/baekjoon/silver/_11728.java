package baekjoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _11728 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int A = Integer.parseInt(tokenizer.nextToken());
			int B = Integer.parseInt(tokenizer.nextToken());

			List<Integer> list = new ArrayList<>();

			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < A; i++) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
			}

			tokenizer = new StringTokenizer(reader.readLine());
			for (int i = 0; i < B; i++) {
				list.add(Integer.parseInt(tokenizer.nextToken()));
			}

			Collections.sort(list);

			for (int l : list) {
				writer.write(l + " ");
			}
			writer.flush();
		}
	}

}
