package chap99.leetCode;

import java.util.*;

public class Solution2206 {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num : nums) {
            map.compute(num, (k, v) -> v == null ? 1 : v + 1);
        }
        
        Collection<Integer> values = map.values();
        for(Integer value : values) {
            if(value % 2 == 1) {
                return false;
            }
        }
        
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if(entry.getValue() % 2 != 0) {
//                return false;
//            }
//        }
        return true;
    }
}
