package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _10867 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			HashSet<Integer> set = new HashSet<>();

			String[] input = reader.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				set.add(Integer.parseInt(input[i]));
			}

			ArrayList<Integer> list = new ArrayList<>(set);
			Collections.sort(list);

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < list.size(); i++) {
				builder.append(list.get(i) + " ");
			}
			System.out.println(builder);
		}
	}
}
