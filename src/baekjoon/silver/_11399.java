package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _11399 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int[] array = new int[N];
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(tokenizer.nextToken());
			}

			Arrays.sort(array);

			int sum = 0;
			int min = 0;
			for (int i = 0; i < N; i++) {
				sum += array[i];
				min += sum;
			}

			System.out.println(min);
		}
	}
}
