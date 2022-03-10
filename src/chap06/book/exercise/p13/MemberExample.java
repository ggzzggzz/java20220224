package chap06.book.exercise.p13;

public class MemberExample {
	public static void main(String[] args) {
		Member member = new Member();
		member.name = "홍길동";
		member.id = "hong";
		member.password = "1234";
		member.age = 25;
		System.out.println("회원의 이름 : " + member.name);
		System.out.println("회원의 아이디 : " + member.id);
		System.out.println("회원의 비밀번호 : " + member.password);
		System.out.println("회원의 나이 : " + member.age);
	}
}
