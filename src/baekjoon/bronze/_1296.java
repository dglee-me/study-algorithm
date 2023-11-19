package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 팀 이름 정하기
 *
 * https://www.acmicpc.net/problem/1296
 */
public class _1296 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String yeonduName = reader.readLine();
		int N = Integer.parseInt(reader.readLine());

		double count = -1;
		String higherCountTeamName = yeonduName;

		int yeonduL = calculateLOVE(yeonduName, 'L');
		int yeonduO = calculateLOVE(yeonduName, 'O');
		int yeonduV = calculateLOVE(yeonduName, 'V');
		int yeonduE = calculateLOVE(yeonduName, 'E');

		for (int i = 0; i < N; i++) {
			String teamName = reader.readLine();

			int L = yeonduL + calculateLOVE(teamName, 'L');
			int O = yeonduO + calculateLOVE(teamName, 'O');
			int V = yeonduV + calculateLOVE(teamName, 'V');
			int E = yeonduE + calculateLOVE(teamName, 'E');

			double countLOVE = ((L + O) * (L + V) * (L + E) * (O + V) * (O + E) * (V + E)) % 100;

			if (count < countLOVE) {
				count = countLOVE;
				higherCountTeamName = teamName;
			} else if (count == countLOVE) {
				if (higherCountTeamName.compareTo(teamName) > 0) higherCountTeamName = teamName;    // 사전순으로 더 앞서는 팀 이름으로 갱신
			}
		}

		System.out.println(higherCountTeamName);
	}

	private static int calculateLOVE(String name, char targetCharacter) {

		return (int) name.chars().filter(c -> c == targetCharacter).count();
	}
}
