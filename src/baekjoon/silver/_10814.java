package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _10814 {

	static class Person {

		private int age;

		private String name;

		Person(int age, String name) {

			this.age = age;
			this.name = name;
		}

		public int getAge() {

			return age;
		}

		public String getName() {

			return name;
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(reader.readLine());
		List<Person> personList = new ArrayList<>(N);

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			personList.add(new Person(Integer.parseInt(st.nextToken()), st.nextToken()));
		}

		Collections.sort(personList, (o1, o2) -> {
			if (o1.age == o2.age) {
				return 0;
			} else if (o1.age > o2.age) {
				return 1;
			} else {
				return -1;
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			Person person = personList.get(i);
			sb.append(person.getAge() + " " + person.getName() + "\n");
		}

		System.out.print(sb);
	}
}
