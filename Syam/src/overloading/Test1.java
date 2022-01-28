package overloading;

class Calculator {
	int add(int i, int j) {
		return i + j;

	}

	/*
	  int add(int i,int j) { return i+j;
	 
	  }
	 */
int add(int i,int j,int k) {
	return i+j+k;
}
	float add(int i, float f) {
		return i + f;

	}

	float add(float f, int i) {
		return f + i;
	}

	float add(float f1, float f2) {
		return f1 + f2;

	}

}

public class Test1 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(20, 30));
		System.out.println(c.add(20,30,40));
		System.out.println(c.add(20,30.5f));
		System.out.println(c.add(20.9f, 50));
		System.out.println(c.add(10f, 60f));
		
	}
}
