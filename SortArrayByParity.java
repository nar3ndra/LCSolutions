class Solution {
    public int[] sortArrayByParity(int[] A) {
        int start=0;
        int end=A.length-1;
        int n=A.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            if(A[i]%2==0){
                result[start++]=A[i];
            }
            else{
                result[end--]=A[i];
            }

        }
    return result;
    }
}
//Inplace Array Solution
/*
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int N = A.length;
        int i = 0;
        for (int j = 0; j < N; ++j) {
            if ((A[j] & 1) == 0) {
                int t = A[j];
                A[j] = A[i];
                A[i++] = t;
            }
        }
        return A;
    }
}


*/
