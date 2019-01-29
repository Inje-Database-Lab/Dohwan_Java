package RM_Control;

public class Power {
	private String power;

	public Power() {
		power = "OFF";
	}

	public void PowerStatus() {
		System.out.println("Àü¿ø : " + power);
	}

	public void PowerControl() {
		if (power.equals("OFF")) {
			power = "ON";
			System.out.println("Power : " + power);
		} else if (power.equals("ON")) {
			power = "OFF";
			System.out.println("Power : " + power);
		}
	}
}
