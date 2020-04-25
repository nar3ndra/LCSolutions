class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) return res;

        boolean[] arr = new boolean[nums.length+1];
        for (int num : nums) arr[num] = true;
        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == false) res.add(i);
        }
        return res;
    }
}

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
/*
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums){
            set.add(i);
        }
        int n = nums.length;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;

}}
*/
