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
		System.out.println("현재채널 : " + volume);
	}

	void ShowControlManual() {
		System.out.println("+ or - 개수만큼 음량을 조절합니다.");
		System.out.println("+ : 음량 +1      - : 음량 -1");
		System.out.println("현재음량 : " + volume);
	}

	void VolumeControl() {
		System.out.print("입력 : ");
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
			System.out.println("음럄이 " + (cnt1 - cnt2) + "만큼 증가했습니다.");
		} else if (cnt2 > cnt1 && volume > 0) {
			System.out.println("음럄이 " + (cnt2 - cnt1) + "만큼 감소했습니다.");
		} else if (volume > 100) {
			volume = 100;
			System.out.println("최대 음럄입니다.");
		}
		if (volume < 0) {
			volume = 0;
			System.out.println("최저 음럄입니다.");
		}
		System.out.println("음량 : " + volume);
	}
}
