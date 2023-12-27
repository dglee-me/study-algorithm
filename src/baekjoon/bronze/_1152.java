package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1152 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(new StringTokenizer(reader.readLine()).countTokens());
		}
	}
}
