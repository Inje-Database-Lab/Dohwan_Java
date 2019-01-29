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
		System.out.println("현재음량 : " + channel);
	}

	void ChannelControl() {
		System.out.println("+ : 채널 +1      - : 채널 -1       숫자입력 : 해당채널로 이동(ch 1 ~ ch 999)");
		System.out.println("현재채널 : " + channel);
		System.out.print("입력 : ");
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
		System.out.println("채널 : " + channel + "로 변경");
	}
}
