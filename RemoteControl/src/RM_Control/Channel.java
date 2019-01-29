package RM_Control;

import java.util.Scanner;

public class Channel {
	private int channel;
	Scanner scan;

	public Channel() {
		channel = 1;
		scan = new Scanner(System.in);
	}

	void ChannelStatus() {
		System.out.println("�������� : " + channel);
	}

	void ChannelControl() {
		System.out.println("+ : ä�� +1      - : ä�� -1       �����Է� : �ش�ä�η� �̵�(ch 1 ~ ch 999)");
		System.out.println("����ä�� : " + channel);
		System.out.print("�Է� : ");
		String ch = scan.next();
		int cnt = 0;
		if (ch.equals("+")) {
			if (channel == 999) {
				channel = 1;
			} else {
				cnt++;
				channel = +cnt;
			}
		} else if (ch.equals("-")) {
			if (channel == 1) {
				channel = 999;
			} else {
				cnt--;
				channel = -cnt;
			}
		} else {
			int change = Integer.parseInt(ch);
			channel = change;
		}
		System.out.println("ä�� : " + channel + "�� ����");
	}
}
