class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length-1;
        int duplicates = 0;
        for(int i=0;i<=length-duplicates;i++){

            if(arr[i]==0){
                if(i==length-duplicates){
                    arr[length]=0;
                    length--;
                }
                else{
                    duplicates++;
                }

            }



        }
        for(int i=length-duplicates;i>=0;i--){
            if(arr[i]==0){
                arr[i+duplicates]=arr[i];
                duplicates--;
                arr[i+duplicates]=0;
            }
            else{
                arr[i+duplicates]=arr[i];
            }

        }




    }
}

//https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
//Solution explained by the authour
