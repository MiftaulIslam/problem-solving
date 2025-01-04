import java.util.HashSet;

public class Main{
    public boolean containsDuplicate(int[] nums){
        if(nums.length == 1) return true;
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(num.contains(nums[i])){
                return true;
            }else{
                num.add(nums[i]);
            }
        }
        return false;
    }
    public static void main (String[] args){
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Main mainInstance = new Main();
        System.out.println(mainInstance.containsDuplicate(nums));

    }
}