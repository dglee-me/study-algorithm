package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _1620 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(reader.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, Integer> strPocketMap = new HashMap<>();
		Map<Integer, String> intPocketMap = new HashMap<>();

		for (int i = 1; i <= N; i++) {
			String name = reader.readLine();

			strPocketMap.put(name, i);
			intPocketMap.put(i, name);
		}

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String str = reader.readLine();
			if (Character.isDigit(str.charAt(0))) {
				builder.append(intPocketMap.get(Integer.parseInt(str)));
			} else {
				builder.append(strPocketMap.get(str));
			}
			builder.append("\n");
		}

		System.out.println(builder);
	}
}