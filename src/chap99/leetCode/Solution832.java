package chap99.leetCode;

class Solution832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            
            int left = 0; // 첫 인덱스
            int right = row.length - 1; // 마지막 인덱스
            
            while (left <= right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                row[left] = row[left] == 1 ? 0 : 1;
                row[right] = row[right] == 1 ? 0 : 1;
                
                if (left == right) {
                    row[right] = row[right] == 1 ? 0 : 1;
                }
                
                left++;
                right--;
            }
        }
        
        return image;
    }
}
