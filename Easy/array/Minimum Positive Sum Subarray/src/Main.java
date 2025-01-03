import java.util.ArrayList;
import java.util.List;

public class Main{
    //Sum >= 0
    public static int minimumSumSubArray(List<Integer> nums, int l, int r){
        if(nums.size() <= 0 || l > r || l <= 0 || r <= 0) return -1;

        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++) { //l=1, r=1, size = 1 <= r= 1 condition true iterate one time
            windowSum = 0;


            for (int start = 0; start < size ; start++) { //start 1 iteration
                windowSum += nums.get(start); // 1st = -12

            }
            if(windowSum > 0 && minSum > windowSum){
                minSum = windowSum;
            }

            for (int end = size; end < nums.size() ; end++) {  //end = 1 end//1<nums.size()//2

                windowSum += nums.get(end);
                windowSum -= nums.get(end-size);
                if(windowSum < minSum && windowSum > 0){
                    minSum = windowSum;
                }
            }

        }

        return minSum != Integer.MAX_VALUE ? minSum : -1;
    }
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
//        nums.add();
        nums.add(-12);
        nums.add(8);

    Main mainIntance = new Main();
        int result = minimumSumSubArray(nums, 1, 1);

        System.out.println("Minimum Positive Sum Subarray: " + result);
    }
}