class Solution {
    public int removeElement(int[] nums, int val) {
       int index=0;
        for(int i : nums){
            if(i!=val){
                nums[index++]=i;

            }
        }
        return index;
    }
}

        //Arrays.sort(nums);
        /*int length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]==val){
                for(int j=i;j<length-1;j++){
                    nums[j]=nums[j+1];
                }
                length--;
                i--;

            }
        }
       return length;*/



//https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3247/
