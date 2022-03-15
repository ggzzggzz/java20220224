package chap07.lecture.p02override;

public class QuantumComputer extends Computer {
	
	public void execute() {
		System.out.println("더 빠른 연산을 합니다.");
	}
	
	public void otherExecute() {
		System.out.println("다른 연산을 합니다.");
	}
}
