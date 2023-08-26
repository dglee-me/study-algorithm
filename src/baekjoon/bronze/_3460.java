package baekjoon.bronze;

import java.util.Scanner;

/**
 * 이진수
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)
 * 각 테스트 케이스에 대해서, 1의 위치를 공백으로 구분해서 줄 하나에 출력한다. 위치가 낮은 것부터 출력한다.
 *
 * https://www.acmicpc.net/problem/3460
 */
public class _3460 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int t = scanner.nextInt();
		if (t < 1 || t > 10) return;

		for (int i = 0; i < t; i++) {
			int n = scanner.nextInt();
			if (n < 1 || n > 1000000) return;

			String binary = Integer.toBinaryString(n);
			int index = binary.length() - 1;
			for (int j = index; j >= 0; j--) {
				if (binary.charAt(j) == '1') System.out.print(index - j + " ");
			}
		}
	}
}
