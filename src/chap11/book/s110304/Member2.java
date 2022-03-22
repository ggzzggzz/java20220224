package chap11.book.s110304;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member2(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member2 cloned = (Member2) super.clone();
		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member2 객체를 리턴
		return cloned;
	}
	
	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
}
