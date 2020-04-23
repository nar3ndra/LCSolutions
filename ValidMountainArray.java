class Solution {
    public boolean validMountainArray(int[] A) {
        int i=0;
        int n=A.length;
        while(i+1<n && A[i]<A[i+1] && A[i]!=A[i+1]){
            i++;
        }

        if(i==0 || i==n-1){
            return false;
        }
        while(i+1<n && A[i]>A[i+1] && A[i]!=A[i+1]){
            i++;
        }
        return i==n-1;



    }
}
//https://leetcode.com/problems/valid-mountain-array/
