package chap08.book.s080302;

import chap08.book.s080205.RemoteControl;

public class RemoteControlExmaple {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOn() { /*실행문*/ }
			public void turnOff() { /*실행문*/ }
			public void setVolume(int volume) { /*실행문*/ }
		};
	}
}
