package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2752 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int[] array = new int[3];
			for (int i = 0; i < 3; i++) {
				array[i] = Integer.parseInt(tokenizer.nextToken());
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - i - 1; j++) {
					if (array[j] > array[j + 1]) {
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < array.length; i++) {
				builder.append(array[i]).append(" ");
			}

			System.out.println(builder);
		}
	}
}
