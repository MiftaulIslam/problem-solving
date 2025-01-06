import java.util.Arrays;

public class Main{

    public double medianOfTwoArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int p1 = 0;
        int p2 = 0;
        int k = 0;
        int totalLength = m + n;
        int mid = totalLength/2;

        int[] newarr = new int[m+n];
        while(p1 < m && p2<n){
            if(nums1[p1] < nums2[p2]){
                newarr[k++] = nums1[p1++];
            }else{
                newarr[k++] = nums2[p2++];
            }
        }
        while(p1<m) newarr[k++] = nums1[p1++];
        while(p2<n) newarr[k++] = nums2[p2++];
        if(newarr.length % 2 == 0){
            return (newarr[mid] + newarr[mid - 1]) / 2.0;

        }else{
            return newarr[mid];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        Main mainInstance = new Main();
        mainInstance.medianOfTwoArray(nums1, nums2);

    }


}