package chap15.book.exercise.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		// 작성 위치
		
		// 1. entrySet
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		// 2. keySet
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			if(maxScore < map.get(key)) {
				name = key;
				maxScore = map.get(key);
			}
			totalScore += map.get(key);
		}
		
		// 3. forEach
		map.forEach((k ,v) -> System.out.println(k + "=" + v));
		
		System.out.println("평균점수: " + (totalScore / map.size()));
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}





