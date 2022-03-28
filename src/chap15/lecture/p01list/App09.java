package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		// 홀수 element 삭제
		list.removeIf(e -> e % 2 != 0);
		
		System.out.println(list); // [0, 2, 4, 6, 8]
	}
}
