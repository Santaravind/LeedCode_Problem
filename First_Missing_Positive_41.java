package DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class First_Missing_Positive_41 {
    public static void main(String args[]){
//        int nums[]={2,0,1};
        int nums[]={3,4,-1,1};

        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums);
//        for (int i=0; i<n; i++){
//            if()
//        }
        for (int m:nums){
            if (m>0){
                set.add(m);
            }
        }
        for (int i=1; i<=n; i++){
            if(!set.contains(i)){
                System.out.println("Missing value"+i);
//                return i;
            }
        }
        System.out.println("Missing value "+(n+1));
//         return (n+1)
    }
}
