class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num : nums){
            int digits=0;
            while(num!=0){
                num=num/10;
                digits++;
            }
            if(digits%2==0) count++;

        }
        return count++;
    }
}


//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
