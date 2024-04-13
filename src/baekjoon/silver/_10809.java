package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10809 {

  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] alphabet = new int[26];
    for (int i = 0; i < alphabet.length; i++) {
      alphabet[i] = -1;
    }

    String S = reader.readLine();
    for (int i = 0; i < S.length(); i++) {
      char c = S.charAt(i);
      int index = c - 'a';

      if (alphabet[index] == -1) {
        alphabet[index] = i;
      }
    }

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < alphabet.length; i++) {
      sb.append(alphabet[i]).append(" ");
    }

    System.out.println(sb);
  }
}
