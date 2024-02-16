package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _11720 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());
			char[] str = reader.readLine().toCharArray();

			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += Character.getNumericValue(str[i]);
			}
			System.out.print(sum);
		}
	}
}
