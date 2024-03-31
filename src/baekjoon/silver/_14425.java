package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _14425 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(reader.readLine(), 0);
		}

		int count = 0;
		for (int i = 0; i < M; i++) {
			if (map.containsKey(reader.readLine())) count++;
		}

		System.out.println(count);
	}
}
