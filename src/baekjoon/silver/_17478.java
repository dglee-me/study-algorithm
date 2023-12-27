package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17478 {

	private static final String UNDERLINE = "____";

	private static final String INTRO = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";

	private static final String QUESTION = "\"재귀함수가 뭔가요?\"\n";
	private static final String ANSWER = "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n";
	private static final String ANSWER_1 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n";
	private static final String ANSWER_2 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n";
	private static final String ANSWER_3 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n";

	private static final String ANSWER_END = "라고 답변하였지.";

	static int N;

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			N = Integer.parseInt(reader.readLine());

			System.out.println(INTRO);
			chatBot(0, "");
		}
	}

	private static void chatBot(final int depth, final String underline) {

		StringBuilder builder = new StringBuilder().append(underline + QUESTION);

		if (N == depth) {
			builder.append(underline + ANSWER)
				   .append(underline + ANSWER_END);

			System.out.println(builder);
			return;
		}

		builder.append(underline + ANSWER_1)
			   .append(underline + ANSWER_2)
			   .append(underline + ANSWER_3);

		System.out.print(builder);
		chatBot(depth + 1, underline + UNDERLINE);
		System.out.println(underline + ANSWER_END);
	}
}
