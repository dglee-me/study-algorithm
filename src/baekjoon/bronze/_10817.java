package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _10817 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

			int[] array = new int[3];
			for (int i = 0; i < 3; i++) {
				array[i] = Integer.parseInt(tokenizer.nextToken());
			}

			Arrays.sort(array);
			System.out.println(array[1]);
		}
	}
}
