package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class _1417 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());        // 후보자 수
		int dasom = Integer.parseInt(reader.readLine());    // 다솜이의 투표 수

		// 다솜이의 투표 수보다 많은 투표 수를 가진 후보들의 투표 수를 저장하는 우선순위 큐
		PriorityQueue<Integer> otherQueue = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < N - 1; i++) {
			otherQueue.add(Integer.parseInt(reader.readLine()));
		}

		reader.close();

		int count = 0;
		if (N != 1) {
			while (dasom <= otherQueue.peek()) {
				dasom++;
				otherQueue.add(otherQueue.poll() - 1);
				count++;
			}
		}

		System.out.println(count);
	}
}
