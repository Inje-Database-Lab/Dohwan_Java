
public class Method_overloading {

	void plus(int x, int y) {
		int result = x + y;
		System.out.println("실행결과 : "+result);
	}

	void plus(double x, double y) {
		double result = x + y;
		System.out.println("실행결과 : "+result);
	}

}
