public class Main{
    public int RemoveElement(int[] nums, int val){
        int n = nums.length;
        int k = 0;

        if (n == 0) return 0;

        if(n == 1 && val == nums[0]) return 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
    return k;
    }

    public static void main (String[] args){
        int[] nums = {3,2,2,3};
        int val = 3;
        Main maininstance = new Main();
        System.out.print(maininstance.RemoveElement(nums, val));
    }
}