package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 달팽이는 올라가고 싶다
 *
 * 하루에 A미터 올라가고, B미터를 미끄러진다. 즉, 하루동안 (A-B) 만큼을 올라간다.
 * 즉, N일 동안 (A-B)만큼을 올라가고, 마지막날 A미터를 올라갈 경우(정상에 도착할 땐 미끄러지지 않는다.)이므로
 *
 * V = N(A-B) + A 이다.
 * 즉,
 * V-A = N(A-B)
 * N(A-B) = V-A
 * N = (V-A) / (A-B)
 *
 * https://www.acmicpc.net/problem/2869
 */
public class _2869 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int A = Integer.parseInt(tokenizer.nextToken());    // 낮에 올라가는 미터
		int B = Integer.parseInt(tokenizer.nextToken());    // 밤에 미끄러지는 미터
		int V = Integer.parseInt(tokenizer.nextToken());    // 나무 막대 높이

		int day = (int) Math.ceil((double) (V - A) / (double) (A - B));
		System.out.println(day + 1);
	}
}
