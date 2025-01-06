import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public List<List<Integer>> threeSum(int[] nums){
        int n = nums.length;
    //Make sure the array is sorted
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // first pointer remain fixed
            //Check duplicate for the first pointer
            if(  i>0 && nums[i] == nums[ i - 1]) continue;
            int j = i+1;
            int z = n-1;
            // Iterate the remaining two pointer
            while(j < z){
                int sum = nums[i] + nums[j] + nums [z];
                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[z]));
                    //while iterating check for duplicate, if exist move the pointer to the second duplicate value.
                    while(j<z && nums[j] == nums[j+1]) j++;
                    while(j<z && nums[z] == nums[z-1]) z--;
                    j++;
                    z--;
                } else if (sum < 0) {
                    j++;
                }else{
                    z--;
                }
            }


        }

return triplets;


    }

    public static void main(String[]  args){
     int[] nums = {-1,0,1,2,-1,-4};
     Main mainInstance = new Main();
        System.out.println(mainInstance.threeSum(nums));
//     mainInstance.threeSum(nums);
    }
}