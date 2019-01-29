package RM_Control;

import java.util.Scanner;

public class Volume {
	private int volume;
	Scanner scan;

	public Volume() {
		volume = 0;
		scan = new Scanner(System.in);
	}

	void VolumeStatus() {
		System.out.println("����ä�� : " + volume);
	}

	void ShowControlManual() {
		System.out.println("+ or - ������ŭ ������ �����մϴ�.");
		System.out.println("+ : ���� +1      - : ���� -1");
		System.out.println("�������� : " + volume);
	}

	void VolumeControl() {
		System.out.print("�Է� : ");
		String vol = scan.next();
		String[] volcon = vol.split("");

		int cnt1 = 0, cnt2 = 0;

		for (String num : volcon) {
			if (num.equals("+")) {
				cnt1++;
				volume++;
			} else if (num.equals("-")) {
				cnt2++;
				volume--;
			}
		}
		if (cnt1 > cnt2 && volume < 100) {
			System.out.println("���c�� " + (cnt1 - cnt2) + "��ŭ �����߽��ϴ�.");
		} else if (cnt2 > cnt1 && volume > 0) {
			System.out.println("���c�� " + (cnt2 - cnt1) + "��ŭ �����߽��ϴ�.");
		} else if (volume > 100) {
			volume = 100;
			System.out.println("�ִ� ���c�Դϴ�.");
		}
		if (volume < 0) {
			volume = 0;
			System.out.println("���� ���c�Դϴ�.");
		}
		System.out.println("���� : " + volume);
	}
}
