class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int length=1;
        int index=1;
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                nums[index++]=nums[i];
                length++;
            }

        }
        return length;

    }
}
//we can use this solution because the array is already sorted 
//https://leetcode.com/submissions/detail/329157110/?from=/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
