package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1157 {

	public static void main(String[] args) throws IOException {

		String s = new BufferedReader(new InputStreamReader(System.in)).readLine().toUpperCase();

		int[] alphabetList = new int[26];
		for (int i = 0; i < s.length(); i++) {
			alphabetList[s.charAt(i) - 65]++;
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < alphabetList.length; i++) {
			if (max < alphabetList[i]) {
				max = alphabetList[i];
				ch = (char) (i + 65);
			} else if (max == alphabetList[i]) {
				ch = '?';
			}
		}

		System.out.println(ch);
	}
}
