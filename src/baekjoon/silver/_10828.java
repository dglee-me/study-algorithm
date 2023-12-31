package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10828 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			int[] stack = new int[N];
			int stackSize = 0;

			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < N; i++) {
				StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

				switch (tokenizer.nextToken()) {
					case "push":
						stack[stackSize] = Integer.parseInt(tokenizer.nextToken());
						stackSize++;
						break;
					case "top":
						if (stackSize == 0) {
							builder.append(-1).append("\n");
							break;
						}
						builder.append(stack[stackSize - 1]).append("\n");
						break;
					case "size":
						builder.append(stackSize).append("\n");
						break;
					case "empty":
						builder.append(stackSize == 0 ? 1 : 0).append("\n");
						break;
					case "pop":
						if (stackSize == 0) {
							builder.append(-1).append("\n");
							break;
						}

						builder.append(stack[stackSize - 1]).append("\n");

						stack[stackSize - 1] = 0;
						stackSize--;
						break;
				}
			}

			System.out.println(builder);
		}
	}
}
