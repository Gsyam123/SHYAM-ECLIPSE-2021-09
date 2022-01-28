package collections1;

import java.util.Arrays;
import java.util.Comparator;

class Emp {
	int id;
	String name;

	Emp(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public String toString() {
		return id + "";

	}

}

class Syam implements Comparator {
	public int compare(Object o1, Object o2) {
		Emp e1 = (Emp) o1;
		Emp e2 = (Emp) o2;
		if (e1.id < e2.id) {
			return -1;

		} else if (e1.id > e2.id) {
			return 1;

		} else
			return 0;

	}
}

public class Test2 {
	public static void main(String[] args) {
		Emp[] arr = new Emp[] { new Emp(102, "xyz"), new Emp(101, "abc"), new Emp(102, "mno") };
		Arrays.sort(arr, new Syam());
		System.out.println(Arrays.toString(arr));

	}
}
