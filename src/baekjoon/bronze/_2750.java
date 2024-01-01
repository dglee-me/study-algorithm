package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2750 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			int[] array = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(reader.readLine());
			}

			Arrays.sort(array);

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < array.length; i++) {
				builder.append(array[i]).append("\n");
			}

			System.out.println(builder);
		}
	}
}
