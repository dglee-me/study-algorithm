package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _11478 {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Set<String> set = new HashSet<>();

    String S = reader.readLine();
    for (int i = 0; i < S.length(); i++) {
      for (int j = i + 1; j < S.length() + 1; j++) {
        set.add(S.substring(i,j));
      }
    }

    System.out.println(set.size());
  }
}
