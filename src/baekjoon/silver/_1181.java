package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1181 {
	public static void main(String[] args) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			String[] array = new String[N];
			for (int i = 0; i < N; i++) {
				array[i] = reader.readLine();
			}

			// 길이가 같다면 사전 순으로 정렬하고, 아니라면 길이순으로 정렬한다.
			Arrays.sort(array, (o1, o2) -> {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			});

			// 중복되는 단어일 경우 한번만 출력한다.
			StringBuilder builder = new StringBuilder();
			builder.append(array[0]).append("\n");
			for (int i = 1; i < N; i++) {
				if (!array[i].equals(array[i - 1])) {
					builder.append(array[i]).append("\n");
				}
			}
			System.out.println(builder);
		}
	}
}
