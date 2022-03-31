package chap99.leetCode;

import java.util.HashSet;
import java.util.Set;

public class Solution287 {
	public int findDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<>();
//         int result = 0;

//         for(int num : nums) {
//             if(!set.contains(num)){
//                 set.add(num);
//             } else {
//                 result = num;
//             }
//         }

//         return result;
		
		for (int num : nums) {
			if (!set.add(num)) {
				return num;
			}
		}

		return 0;
	}
}
