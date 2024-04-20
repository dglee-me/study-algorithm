package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11047 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(reader.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] coin = new int[N];
    for (int i = 0; i < N; i++) {
      coin[i] = Integer.parseInt(reader.readLine());
    }

    int count = 0;
    for (int i = N - 1; i >= 0; i--) {
      if (K / coin[i] > 0) {
        count += K / coin[i];
        K -= (coin[i] * (K / coin[i]));
      }
    }

    System.out.println(count);
  }
}
