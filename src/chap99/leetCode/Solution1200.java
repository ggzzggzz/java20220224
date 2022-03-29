package chap99.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, arr[i + 1] - arr[i]);
        }
        
        for(int i = 0; i < arr.length - 1; i++) {
            if(min == arr[i+1] - arr[i]) {
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        
        return result;
    }
}
