package RM_Control;

import java.util.Scanner;

public class Field_Control {
	private String Power;
	private int Volume;
	private int Channel;
	Scanner scan;

	public Field_Control() {
		this.Power = "OFF";
		this.Volume = 0;
		this.Channel = 1;
		this.scan = new Scanner(System.in);
	}

	public String getPower() {
		return this.Power;
	}

	public void setPower(String power) {
		this.Power = power;
	}

	public int getVolume() {
		return Volume;
	}

	public void setVolume(int volume) {
		this.Volume = volume;
	}

	public int getChannel() {
		return Channel;
	}

	public void setChannel(int channel) {
		this.Channel = channel;
	}
}