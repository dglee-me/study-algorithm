package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1436 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());    // N번째 영화

		int num = 666;    // 숫자는 666부터 시작한다.
		int count = 0;    // 666을 포함하는 숫자의 개수를 센다.

		while (true) {
			if (String.valueOf(num).contains("666")) {
				count++;
			}
			if (count == N) {
				System.out.print(num);
				break;
			}
			num++;
		}
	}
}
