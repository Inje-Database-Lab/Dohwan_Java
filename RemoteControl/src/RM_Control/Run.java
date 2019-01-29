package RM_Control;
import java.util.Scanner;
public class Run {
	Power power;
	Volume volume;
	Channel channel;
	Scanner scan;

	public Run() {
		this.power = new Power();
		this.volume = new Volume();
		this.channel = new Channel();
		scan = new Scanner(System.in);
	}

	public void RemoteControlRun() {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println();
			System.out.println("1.������ư     2.������ư     3.ä�ι�ư     4.����������     5.����");
			System.out.println();
			System.out.print("�Է� : ");
			int sel =scan.nextInt();
			System.out.println();
			switch (sel) {
			case 1:
				power.PowerControl();
				break;
			case 2:
				volume.VolumeControl();
				break;
			case 3:
				channel.ChannelControl();
				break;
			case 4:
				power.PowerStatus();
				volume.VolumeStatus();
				channel.ChannelStatus();
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				run = false;
				break;
			}
		}
	}
}
