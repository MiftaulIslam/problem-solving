import java.util.HashSet;

public class Main{
    public boolean findSubarrays(int[] nums) {
        if(nums.length <= 2) return false;
        HashSet<Integer> sumSet = new HashSet<>();
        int windowSum = 0;
        int k = 2;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        sumSet.add(windowSum);
        for (int end = k; end < nums.length ; end++) {
            windowSum += nums[end];
            windowSum -= nums[end - k];
            if (sumSet.contains(windowSum)){
                return true;
            }else{
                sumSet.add(windowSum);
            }
        }
        return false;
    }

}