package chap99.leetCode;

import java.util.*;

public class Solution1748 {
    public int sumOfUnique(int[] nums) {
//      int sum  = 0;
//      Map<Integer, Integer> map = new HashMap<>();
//      for(int num : nums) {
//          if(map.containsKey(num)) {
//              sum -= map.get(num);
//              map.put(num, 0);
//          } else {
//              map.put(num, num);
//              sum += num;
//          }
//      }
     
//      return sum;
     
     Map<Integer, Integer> map = new HashMap<>();
     
     for(int num : nums) {
         map.compute(num, (k, v) -> v == null ? 1 : v + 1);
     }
     
     int result = 0;
     
     for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
         if(entry.getValue() == 1) {
             result += entry.getKey();
         }
     }
     
     return result;
 }
}
