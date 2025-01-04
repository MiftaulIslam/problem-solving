import java.util.HashSet;

class Solution {
    public int findDuplicate(int[] nums) {
        if(nums.length == 1) return -1;
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(num.contains(nums[i])){
                return nums[i];
            }else{
                num.add(nums[i]);
            }
        }
        return -1;
    }
}