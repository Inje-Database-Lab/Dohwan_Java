
public class Main {
	public static void main(String[] args) {
		Title title1 = new Title(3, 5);
		System.out.println("按眉1");
		title1.show();
		title1.setTitle(6, 10);
		System.out.println("荐沥等 按眉1");
		title1.show();

		Title title2 = new Title(1, -5);
		System.out.println("按眉2");
		title2.show();
		title2.setTitle(2, -10);
		System.out.println("荐沥等 按眉2");
		title2.show();
	}
}
