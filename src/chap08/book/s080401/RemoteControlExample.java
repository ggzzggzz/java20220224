package chap08.book.s080401;

import chap08.book.s080205.RemoteControl;
import chap08.book.s080301.*;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}
}
