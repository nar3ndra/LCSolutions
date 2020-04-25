class Solution {
    public boolean isMonotonic(int[] A) {
        int length=0;
        int n=A.length;
        for(int i=0;i<n-1;i++){
            if(A[i]<A[i+1] || A[i]==A[i+1]){
                length++;
            }
            else{
                break;
            }
        }

        if(length==n-1) return true;

        else{
            length=0;
            for(int i=0;i<n-1;i++){
            if(A[i]>A[i+1] || A[i]==A[i+1]){
                length++;
            }
            else{
                break;
            }
        }}
                if(length==n-1) return true;
else{
    return false;
}
    }
}
/*
class Solution {
    public boolean isMonotonic(int[] A) {
        if (A.length == 0) return true;

        boolean inc = true;
        boolean dec = true;

        for (int i = 0; i < A.length - 1; i++) {

            if (A[i] > A[i + 1]) {
                dec = false;
            } else if (A[i] < A[i + 1]) {
                inc = false;
            }
        }

        return inc || dec;
    }
}
*/


//https://leetcode.com/problems/monotonic-array/
