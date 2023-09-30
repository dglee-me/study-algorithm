package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _1292 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int A = Integer.parseInt(tokenizer.nextToken());
		int B = Integer.parseInt(tokenizer.nextToken());

		if (A < 1 || B > 1000) return;

		// 리스트에 B의 크기만큼 입력한다.
		int number = 1;
		int index = 0;
		List<Integer> list = new ArrayList<>();

		do {
			if (number > index) {
				list.add(number);
				index++;
			} else {
				number++;
				index = 0;
			}
		} while (list.size() <= B);

		// 그 중 A번째 값부터 B 크기까지 합산한다. (배열은 0부터 시작이니 각각 -1)
		int result = 0;
		for (int i = A - 1; i < B; i++) {
			result += list.get(i);
		}

		System.out.println(result);
	}
}
