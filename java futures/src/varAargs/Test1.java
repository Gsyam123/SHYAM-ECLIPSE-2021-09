package varAargs;

class Calc {
	int add(int... arr) {
		int r = 0;
		for (int i = 0; i < arr.length; i++) {
			r += arr[i];

		}
		return r;

	}
}

public class Test1 {
	public static void main(String[] args) {
		Calc calc=new Calc();
		
	}

}
