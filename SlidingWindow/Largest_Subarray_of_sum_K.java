package DSA.SlidingWindow;

public class Largest_Subarray_of_sum_K {
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,2};
        int k=5;
        int sum=0;
        int j=0;
        int i=0;
        int max=Integer.MIN_VALUE;
        while (j<arr.length){
            sum+=arr[j];
            if (sum<k){
                j++;
            }
            if (sum==k){
                max=Math.max(max,(j-i+1));
                j++;
            }
            if (sum>k){
                while (sum>k) {
                    sum -= arr[i];

                    i++;
                    if (sum==k){
                        max=Math.max(max,(j-i+1));
                    }
                }
                j++;
            }
        }
        System.out.println(max);
    }
}
