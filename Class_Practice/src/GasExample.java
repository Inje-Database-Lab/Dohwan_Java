
public class GasExample {
	public static void main(String[] args) {
		Gas myCar = new Gas();

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("����մϴ�.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("������ ������ �ʿ䰡 �����ϴ�.");

		} else {
			System.out.println("������ �����ϼ���.");
		}

	}
}
