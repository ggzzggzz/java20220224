package chap06.lecture.p04method;

public class Calculator2 {
	
	// varargs (가변길이 매개변수)
	int sum(int... nums) {
		
		System.out.println("nums의 길이: " + nums.length);
		
		int sum = 0;
		
		for(int num : nums) {
			sum += num;
		}
		
		return sum;
	}
	
	// 가변길이 매개변수는 항상 마지막에 작성
	int varSum(String name, int... nums) {
		return 0;
	}
	
	void concat(String... names) {
		String sum = "";
		for (String name : names) {
			sum += name;
		}
		System.out.println(sum);
	}
}
