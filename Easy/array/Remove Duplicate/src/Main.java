import java.util.Arrays;

public class Main{
    public int removeDuplicates (int[] nums){
        int n = nums.length; //10
        int k = 1;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[i - 1]){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Main maininstance = new Main();
        System.out.println(maininstance.removeDuplicates(nums));
    }
}