package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 소수
 *
 * 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다. M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 *
 * https://www.acmicpc.net/problem/2581
 */
public class _2581 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(reader.readLine());
		int N = Integer.parseInt(reader.readLine());

		if (M > 10000 || N > 10000 || M > N) return;

		List<Integer> list = new ArrayList<>();
		for (int i = M; i <= N; i++) {
			if (isPrime(i)) list.add(i);
		}

		if (list.size() == 0) {
			System.out.print(-1);
			return;
		}

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println(sum);
		System.out.print(list.get(0));
	}

	private static boolean isPrime(int n) {
		if (n < 2) return false;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) return false;
		}

		return true;
	}
}
