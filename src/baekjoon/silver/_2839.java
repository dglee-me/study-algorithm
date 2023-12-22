package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			int N = Integer.parseInt(reader.readLine());

			int count = 0;
			while (N > 0) {
				if (N % 5 == 0) {
					count += N / 5;
					break;
				}

				// 다 나누고 난 후 N이 3보다 작다면 정확히 kg 을 맞출 수 없으므로 -1을 반환한다.
				if (N < 3) {
					count = -1;
					break;
				}

				N = N - 3;
				count++;
			}

			System.out.println(count);
		}
	}
}
