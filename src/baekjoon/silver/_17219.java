package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _17219 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(reader.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    Map<String, String> map = new HashMap<>();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(reader.readLine());
      map.put(st.nextToken(), st.nextToken());
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < M; i++) {
      sb.append(map.get(reader.readLine()));
      if (i < M -1) sb.append("\n");
    }

    System.out.println(sb);
  }
}
