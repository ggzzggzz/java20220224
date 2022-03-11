package chap06.lecture.p04method;

public class Phone {
	// method overloading : method명 같은 메소드를 여러개만듬
	// 같은 메소드명을 가져도
	// 파라미터의 타입, 개수, 순서로 구분됨
	
	// *참고: 7장에서 나오는 용어 method overriding과 용어가 비슷해서
	// 면접에서 자주 물어봄
	
	void call(String name) {
		System.out.println(name + "에게 전화검");
	}
	
	void call(int number) {
		System.out.println(number + "로 전화검");
	}
	
	void call(String name, int number) {
	}
	
	void call(int number, String name) {
	}
	
//	int call(int number) {
//		return 0;
//	}
}
