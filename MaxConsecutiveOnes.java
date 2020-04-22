class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int finalCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>finalCount) finalCount=count;
            }
            else{
                count=0;
            }
        }
    return finalCount;
    }
}
//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
