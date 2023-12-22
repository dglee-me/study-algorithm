package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int N = Integer.parseInt(reader.readLine());

			int[] array = new int[10001];
			for (int i = 0; i < N; i++) {
				array[Integer.parseInt(reader.readLine())]++;
			}

			for (int i = 1; i < 10001; i++) {
				if (array[i] != 0) {
					writer.write((i + "\n").repeat(array[i]));
				}
			}
		}
	}
}
