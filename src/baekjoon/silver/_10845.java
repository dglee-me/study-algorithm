package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10845 {

	private static final String PUSH = "push";

	private static final String POP = "pop";

	private static final String SIZE = "size";

	private static final String EMPTY = "empty";

	private static final String FRONT = "front";

	private static final String BACK = "back";

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			int[] queue = new int[10001];

			int first = 0;
			int last = 0;

			for (int i = 0; i < N; i++) {
				StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
				String command = tokenizer.nextToken();

				switch (command) {
					case PUSH:
						queue[last++] = Integer.parseInt(tokenizer.nextToken());
						break;
					case POP:
						System.out.println(last - first == 0 ? -1 : queue[first++]);
						break;
					case SIZE:
						System.out.println(last - first);
						break;
					case EMPTY:
						System.out.println(last - first == 0 ? 1 : 0);
						break;
					case FRONT:
						System.out.println(last - first == 0 ? -1 : queue[first]);
						break;
					case BACK:
						System.out.println(last - first == 0 ? -1 : queue[last - 1]);
						break;
				}
			}
		}
	}
}
