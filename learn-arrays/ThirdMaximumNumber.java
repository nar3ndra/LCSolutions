class Solution {
    public int thirdMax(int[] nums) {
        int count=0;
        int index=nums.length-1;
        int n=nums.length-1;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return nums[0]!=nums[1]? Math.max(nums[0],nums[1]):nums[0];
        Arrays.sort(nums);
        while(n>0 && count<2){
            if(nums[n-1]<nums[n]){
                count++;
                index=n-1;
            }
            n--;
        }
        return count==1?nums[nums.length-1]:nums[index];





        }
}
//https://leetcode.com/problems/third-maximum-number/
