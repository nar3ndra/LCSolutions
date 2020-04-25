class Solution {
    public int heightChecker(int[] heights) {
        int sorted[] = heights.clone();
        Arrays.sort(sorted);
        int n = heights.length;
        int result=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=sorted[i]) result++;
        }
        return result;
    }
}
//https://leetcode.com/problems/height-checker/
