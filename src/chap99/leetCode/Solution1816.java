package chap99.leetCode;

import java.util.Arrays;

class Solution1816 {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        
        String[] res = Arrays.copyOf(arr, k);
        
        String str = String.join(" ", res);
        
        return str;
    }
}
