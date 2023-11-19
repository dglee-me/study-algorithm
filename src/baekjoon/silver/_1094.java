package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 막대기
 *
 * https://www.acmicpc.net/problem/1094
 */
public class _1094 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;

		int bar = 64;
		int X = Integer.parseInt(reader.readLine());

		while (X > 0) {
			// 막대기가 X보다 크면 절반으로 자른다.
			if (bar > X) {
				bar /= 2;
			} else {
				// 막대기가 X보다 작거나 같으면 X에서 막대기를 뺀다.
				X -= bar;
				count++;
			}
		}

		System.out.println(count);
	}
}
