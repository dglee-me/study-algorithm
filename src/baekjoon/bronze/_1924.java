package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1924 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int x = Integer.parseInt(tokenizer.nextToken());
			int y = Integer.parseInt(tokenizer.nextToken());

			int[] month = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			String[] day = new String[] { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

			int result = y;
			for (int i = 0; i < x - 1; i++) {      // 배열이 0부터 시작하기 때문에 -1을 해줘야한다.
				result += month[i];                // 만약 x가 3월이라면 1월+2월+3월에 대한 일수를 추가
			}

			System.out.println(day[result % 7]);
		}
	}
}
