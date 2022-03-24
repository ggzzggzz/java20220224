package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;

public class App02 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(8);
		list.add(2);

		// 최대값, 최소값
//		int max = Collections.max(list);
//		int min = Collections.min(list);
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i = 0; i < list.size(); i++) {
//			max = Math.max(list.get(i), max);
//			min = Math.min(list.get(i), min);
			max = list.get(i) > max ? list.get(i) : max;
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		// 향상된 for
		for(Integer e : list) {
			max = Math.max(e, max);
			min = Math.min(e, min);
		}
		
		System.out.println(min);
		System.out.println(max);
	}
}
