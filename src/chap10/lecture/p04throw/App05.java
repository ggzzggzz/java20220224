package chap10.lecture.p04throw;

public class App05 {
	public static void main(String[] args) throws Exception {
		method1();
		System.out.println("프로그램 계속...");
	}

	private static void method1() throws Exception {
		method2();
		System.out.println("메소드1 계속...");
	}

	private static void method2() throws Exception {
		method3();
		System.out.println("메소드2 계속...");
	}

	private static void method3() throws Exception {
		throw new Exception();
	}
}
