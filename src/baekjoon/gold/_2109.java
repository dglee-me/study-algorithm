package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2109 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(reader.readLine());

		int[][] colleges = new int[n][2];
		for (int i = 0; i < n; i++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			colleges[i][0] = Integer.parseInt(tokenizer.nextToken());
			colleges[i][1] = Integer.parseInt(tokenizer.nextToken());
		}

		Arrays.sort(colleges, Comparator.comparingInt(o -> o[1]));

		Queue<Integer> queue = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			int day = colleges[i][1];

			queue.add(colleges[i][0]);
			while (day < queue.size()) {
				queue.remove();
			}
		}

		int sum = 0;
		while (!queue.isEmpty()) {
			sum += queue.poll();
		}

		System.out.println(sum);
	}
}
