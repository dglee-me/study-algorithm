package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1427 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			char[] array = reader.readLine().toCharArray();

			// Bubble Sort
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - 1 - i; j++) {
					if (array[j] < array[j + 1]) {
						char temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
					}
				}
			}

			System.out.println(String.valueOf(array));
		}
	}
}
