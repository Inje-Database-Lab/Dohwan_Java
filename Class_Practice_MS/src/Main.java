
public class Main {
	public static void main(String[] args) {
		Title title1 = new Title(3, 5);
		System.out.println("��ü1");
		title1.show();
		title1.setTitle(6, 10);
		System.out.println("������ ��ü1");
		title1.show();

		Title title2 = new Title(1, -5);
		System.out.println("��ü2");
		title2.show();
		title2.setTitle(2, -10);
		System.out.println("������ ��ü2");
		title2.show();
	}
}
