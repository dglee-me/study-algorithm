package baekjoon.silver;

public class _4673 {

	public static void main(String[] args) {

		// 셀프넘버는 1 ~ 10000까지의 데이터 중 찾아야 한다. / 0을 제외
		boolean[] selfNumberList = new boolean[10001];

		for (int i = 1; i < selfNumberList.length; i++) {
			int n = d(i);
			if (n < 10001) selfNumberList[n] = true;
		}

		for (int i = 1; i < selfNumberList.length; i++) {
			if (!selfNumberList[i]) System.out.println(i);
		}
	}

	private static int d(int number) {

		int sum = number;
		while (number != 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
