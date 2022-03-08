package chap05.lecture;

public class C02EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {-1, 2, 10, 13};
		
		// 향상된for 사용해서  arr의 모든 값을 더해서 출력
		
		int sum = 0;
		for (int item : arr) {
			sum += item;
		}
		/*
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		*/
		
		System.out.println(sum);
	}
}
