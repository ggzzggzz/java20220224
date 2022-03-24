package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		int sum = 0;
		for (int e : list) {
			sum += e;
		}
		int average = sum / list.size();
		System.out.println(sum);
		System.out.println(average);
		
	}
}
