package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _5052 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int T = Integer.parseInt(reader.readLine());

			StringBuilder builder = new StringBuilder();
			while (T-- > 0) {
				int N = Integer.parseInt(reader.readLine());
				String[] array = new String[N];
				for (int i = 0; i < N; i++) {
					array[i] = reader.readLine();
				}

				Arrays.sort(array);
				builder.append(isConsistent(array, N) ? "YES\n" : "NO\n");
			}

			System.out.println(builder);
		}
	}

	public static boolean isConsistent(String[] array, int N) {

		for (int i = 0; i < N - 1; i++) {
			if (array[i + 1].startsWith(array[i])) {
				return false;
			}
		}

		return true;
	}
}
