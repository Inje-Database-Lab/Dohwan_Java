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
		System.out.println("+ or - ������ŭ ������ �����մϴ�.");
		System.out.println("+ : ���� +1      - : ���� -1");
		System.out.println("�������� : " + remote1.getVolume());
		System.out.print("�Է� : ");
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
			System.out.println("���c�� " + (cnt1 - cnt2) + "��ŭ �����߽��ϴ�.");
		} else if (cnt2 > cnt1 && remote1.getVolume() > 0) {
			System.out.println("���c�� " + (cnt2 - cnt1) + "��ŭ �����߽��ϴ�.");
		} else if (remote1.getVolume() > 100) {
			remote1.setVolume(100);
			System.out.println("�ִ� ���c�Դϴ�.");
		}
		if (remote1.getVolume() < 0) {
			remote1.setVolume(0);
			System.out.println("���� ���c�Դϴ�.");
		}
		System.out.println("���� : " + remote1.getVolume());
	}

	void Channel() {
		System.out.println("+ : ä�� +1      - : ä�� -1       �����Է� : �ش�ä�η� �̵�(ch 1 ~ ch 999)");
		System.out.println("����ä�� : " + remote1.getChannel());
		System.out.print("�Է� : ");
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
		System.out.println("ä�� : " + remote1.getChannel() + "�� ����");
	}

	void Status() {
		System.out.println("���� : " + remote1.getPower());
		System.out.println("����ä�� : " + remote1.getChannel());
		System.out.println("�������� : " + remote1.getVolume());
	}

	public void RCrun() {

		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println();
			System.out.println("1.������ư     2.������ư     3.ä�ι�ư     4.����������     5.����");
			System.out.println();
			System.out.print("�Է� : ");
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
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			}
		}
	}
}
