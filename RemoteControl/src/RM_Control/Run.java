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
			System.out.println("1.전원버튼     2.음량버튼     3.채널버튼     4.현재상태출력     5.종료");
			System.out.println();
			System.out.print("입력 : ");
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
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			}
		}
	}
}
