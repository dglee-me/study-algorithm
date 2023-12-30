package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class _2884 {

	public static void main(String[] args) throws IOException {

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			LocalTime time = LocalTime.of(Integer.parseInt(tokenizer.nextToken()), Integer.parseInt(tokenizer.nextToken()))
									  .minusMinutes(45);

			System.out.println(time.getHour() + " " + time.getMinute());
		}
	}
}
