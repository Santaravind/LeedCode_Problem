package DSA;

import java.util.Arrays;

public class Missing_Number268 {
    public static  void main(String srg[]){
//        int nums[]={0,1};
        int nums[]={0,3,1};
        int n=nums.length;


        int sum=0;
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            sum+=nums[i];
        }
        System.out.println(sum);
        int total=(n*(n+1))/2;
        System.out.println(total);

        System.out.println("Missing value :"+ (total-sum));
    }
}
