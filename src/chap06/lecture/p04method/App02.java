package chap06.lecture.p04method;

public class App02 {
	public static void main(String[] args) {
		// Worker 클래스의 인스턴스 2개 만들고
		// work() 메소드를 실행시켜보세요.
		Worker w1 = new Worker("winter");
		Worker w2 = new Worker("spring");
		
		w1.work();
		w2.work();
	}
}
