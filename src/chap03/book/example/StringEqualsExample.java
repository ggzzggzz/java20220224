package chap03.book.example;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
		System.out.println(strVar1 == strVar2); // true
		System.out.println(strVar1 == strVar3); // false
		System.out.println(strVar1.equals(strVar2)); // true
		System.out.println(strVar1.equals(strVar3)); // true
	}
}
