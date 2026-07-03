package DSA.Arrays;

public class Count_Subarrays_With_Majority_Element_I_3737 {
    public static void main(String[] args) {
//        int nums[]={1,2,2,3};
        int nums[]={1,1,1,1};
        int target=1;

        int count=0; int ans=0;
        for (int i=0; i<nums.length; i++){
            count=0;
            for (int j=i; j<nums.length; j++){
                if (nums[j]==target){
                    count++;
                }
                if (count>(j-i+1)/2) ans++;
            }
        }

        System.out.println(ans);
    }
}
