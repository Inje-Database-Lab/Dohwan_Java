package RM_Control;

public class Run {

	Field_Control remote1 = new Field_Control();

	void Power() {
		if (remote1.getPower().equals("OFF")) {
			remote1.setPower("ON");
			System.out.println("Power : " + remote1.getPower());
		} else if (remote1.getPower().equals("ON")) {
			remote1.setPower("OFF");
			System.out.println("Power : " + remote1.getPower());
		}
	}

	void Volume() {
		int cnt1 = 0, cnt2 = 0;
		System.out.println("+ or - 개수만큼 음량을 조절합니다.");
		System.out.println("+ : 음량 +1      - : 음량 -1");
		System.out.println("현재음량 : " + remote1.getVolume());
		System.out.print("입력 : ");
		String vol = remote1.scan.next();
		String[] volcon = vol.split("");

		for (String num : volcon) {
			if (num.equals("+")) {
				cnt1++;
				remote1.setVolume(remote1.getVolume() + 1);
			} else if (num.equals("-")) {
				cnt2++;
				remote1.setVolume(remote1.getVolume() - 1);
			}
		}
		if (cnt1 > cnt2 && remote1.getVolume() < 100) {
			System.out.println("음럄이 " + (cnt1 - cnt2) + "만큼 증가했습니다.");
		} else if (cnt2 > cnt1 && remote1.getVolume() > 0) {
			System.out.println("음럄이 " + (cnt2 - cnt1) + "만큼 감소했습니다.");
		} else if (remote1.getVolume() > 100) {
			remote1.setVolume(100);
			System.out.println("최대 음럄입니다.");
		}
		if (remote1.getVolume() < 0) {
			remote1.setVolume(0);
			System.out.println("최저 음럄입니다.");
		}
		System.out.println("음량 : " + remote1.getVolume());
	}

	void Channel() {
		System.out.println("+ : 채널 +1      - : 채널 -1       숫자입력 : 해당채널로 이동(ch 1 ~ ch 999)");
		System.out.println("현재채널 : " + remote1.getChannel());
		System.out.print("입력 : ");
		String ch = remote1.scan.next();
		int cnt = 0;
		if (ch.equals("+")) {
			if (remote1.getChannel() == 999) {
				remote1.setChannel(1);
			} else {
				cnt++;
				remote1.setChannel(remote1.getChannel() + cnt);
			}
		} else if (ch.equals("-")) {
			if (remote1.getChannel() == 1) {
				remote1.setChannel(999);
			} else {
				cnt--;
				remote1.setChannel(remote1.getChannel() - cnt);
			}
		} else {
			int change = Integer.parseInt(ch);
			remote1.setChannel(change);
		}
		System.out.println("채널 : " + remote1.getChannel() + "로 변경");
	}

	void Status() {
		System.out.println("전원 : " + remote1.getPower());
		System.out.println("현재채널 : " + remote1.getChannel());
		System.out.println("현재음량 : " + remote1.getVolume());
	}

	public void RCrun() {

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println();
			System.out.println("1.전원버튼     2.음량버튼     3.채널버튼     4.현재상태출력     5.종료");
			System.out.println();
			System.out.print("입력 : ");
			int sel = remote1.scan.nextInt();
			System.out.println();
			switch (sel) {
			case 1:
				this.Power();
				break;
			case 2:
				this.Volume();
				break;
			case 3:
				this.Channel();
				break;
			case 4:
				this.Status();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
	}
}
