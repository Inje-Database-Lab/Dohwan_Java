
public class Title {
	private int a;
	private int b;

	public Title(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public void setTitle(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int sum() {
		return a + b;
	}

	public int sub() {
		return a - b;
	}

	public void show() {
		System.out.println("a�� ���� : " + this.a);
		System.out.println("b�� ���� : " + this.b);
		System.out.println("sum�� ���� : " + this.sum());
		System.out.println("sub�� ���� : " + this.sub());
		System.out.println();
	}
}
