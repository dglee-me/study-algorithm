package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2753 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int year = Integer.parseInt(reader.readLine());
			System.out.print((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)) ? 1 : 0);
		}
	}
}
