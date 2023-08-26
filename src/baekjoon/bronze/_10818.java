package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 최소, 최대
 *
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 *
 * https://www.acmicpc.net/problem/10818
 */
public class _10818 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] list = new int[n];

		for (int i = 0; i < n; i++) {
			list[i] = scanner.nextInt();
		}

		scanner.close();
		Arrays.sort(list);

		System.out.print(list[0] + " " + list[n - 1]);
	}
}
