package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _1302 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Map<String, Integer> map = new HashMap<>();

    int max = 0;

    int N = Integer.parseInt(reader.readLine());
    for (int i = 0; i < N; i++) {
      String book = reader.readLine();
      int value = map.getOrDefault(book, 0);

      map.put(book, ++value);
      max = Math.max(max, value);
    }

    List<String> list = new ArrayList<>();
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (max == entry.getValue()) {
        list.add(entry.getKey());
      }
    }

    Collections.sort(list);
    System.out.println(list.get(0));
  }
}
