package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012 {

	private static final String YES = "YES";

	private static final String NO = "NO";

	private static final char START_CHAR = '(';

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int T = Integer.parseInt(reader.readLine());
			Stack<Character> stack = new Stack<>();

			for (int i = 0; i < T; i++) {
				String str = reader.readLine();
				for (int j = 0; j < str.length(); j++) {
					char ch = str.charAt(j);
					if (ch == START_CHAR) {
						stack.push(ch);
						continue;
					}

					if (stack.isEmpty()) {
						stack.push(ch);
						break;
					} else {
						stack.pop();
					}
				}

				System.out.println(stack.isEmpty() ? YES : NO);
				stack.clear();
			}
		}
	}

}
