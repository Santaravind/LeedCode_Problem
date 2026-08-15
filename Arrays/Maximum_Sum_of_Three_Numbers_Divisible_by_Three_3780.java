package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Maximum_Sum_of_Three_Numbers_Divisible_by_Three_3780 {
    public static void main(String[] args) {

//        int max=0;
//        int k=3;
//        int sum=0;
//        while (j<nums.length){
//            sum+=nums[j];
//            if ((j-i+1)<k){
//                j++;
//            } else if ((j-i+1)==k) {
//                if (sum%3==0){
//                    max=Math.max(sum,max);
//                }
//                j++;
//            }else if ((j-i+1)>k){
//                while ((j-i+1)>k){
//                    sum-=nums[i];
//                    i++;
//                }
//                j++;
//            }
//        }
//        Arrays.sort(nums);
//         for (int i=0; i<nums.length; i++){
//             int left=i+1;
//             int right=nums.length-1;
//
//             while (left<right){
//               int  sum=nums[i]+nums[left]+nums[right];
//                 if (sum%3==0){
//                     max=Math.max(max,sum);
//                 }
//                 if (nums[i]+nums[left]%3!=0){
//                     right--;
//                 }else {
//                     left++;
//                     right--;
//                 }
//             }
//         }
////        Collections.sort(a,Collections.reverseOrder());
        int nums[]={8,7,4,3};

        int max=0;
        List<Integer> a=new ArrayList<>();
        List<Integer>b=new ArrayList<>();
        List<Integer>c=new ArrayList<>();
        // for (int i=0; i<nums.length; i++){
        //      int left=i+1;
        //      int right=nums.length-1;

        //      while (left<right){
        //        int  sum=nums[i]+nums[left]+nums[right];
        //          if (sum%3==0){
        //              max=Math.max(max,sum);
        //          }
        //          if (nums[i]+nums[left]%3!=0){
        //              right--;
        //          }else {
        //              left++;
        //          }
        //      }
        //  }
        for(int v:nums){
            if(v%3==0){
                a.add(v);
            }
            if(v%3==1){
                b.add(v);
            }
            if(v%3==2){
                c.add(v);
            }
        }

        Collections.sort(a, Collections.reverseOrder());
        Collections.sort(b, Collections.reverseOrder());
        Collections.sort(c, Collections.reverseOrder());

        if(a.size()>=3){
            max=Math.max(max, a.get(0)+a.get(1)+a.get(2));
        }
        if(b.size()>=3){
            max=Math.max(max, b.get(0)+b.get(1)+b.get(2));
        }
        if(c.size()>=3){
            max=Math.max(max, c.get(0)+c.get(1)+c.get(2));
        }

        if(a.size()>=1&&c.size()>=1&&b.size()>=1){
            max=Math.max(max,a.get(0)+b.get(0)+c.get(0));
        }


        System.out.println(max);
    }
}
