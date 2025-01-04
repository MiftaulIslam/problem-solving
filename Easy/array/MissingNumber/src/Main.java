import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 0) return 1;
        int n = nums.length;
        int missingNum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(nums[i] != i){
                missingNum = i;
                return missingNum = i;
            }else if(nums[n - 1] != i){
                missingNum = n;
            }
        }
        return missingNum;
    }
}