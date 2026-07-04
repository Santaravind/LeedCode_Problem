package DSA.SlidingWindow;

public class Maximum_Average_Subarray_I_643 {
    public static double findMaxAverage(int[] nums, int k) {

        int j = 0, i = 0;
        double avg = Integer.MIN_VALUE;
        double sum = 0;

        while (j < nums.length) {
            sum += nums[j];
            if ((j - i + 1) < k) {
                j++;
            } else if ((j - i + 1) == k) {
                // avg=sum/k;
                avg = Math.max(avg, (sum / k));
                j++;
            } else if ((j - i + 1) > k) {
                sum -= nums[i];
                i++;
              if((j-i+1)==k) {
                  avg=Math.max(avg,(sum/k));
               }
                j++;
            }
        }
        return avg;
    }

    public static void main(String[] args) {
        int [] nums={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(nums,k));
    }
}
