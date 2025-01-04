import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (Integer i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
            Integer a = map.get(i);
        }
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; //6-3 = 3
            if (map.containsKey(difference)){
                int differenceIndex = map.get(difference);
                if (nums[i]+difference==target){
                    if (differenceIndex == i)continue;
                    return new int[] {i, map.get(difference)};
                }
            }
        }
        return new int[]{};
    }
}