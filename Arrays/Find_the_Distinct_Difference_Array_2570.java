package DSA.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Find_the_Distinct_Difference_Array_2570 {
    public static void main(String[] args) {
//        int nums[]={1,2,3,4,5};
        int nums[]={3,2,3,4,2};
        int n=nums.length;
        int result[]=new int [n];

        Set<Integer> st = new HashSet<>();
        for (int i=0; i<n; i++){

            int right=0;
            int left=0;
             int j=i+1;
             int k=i;
            while (j<n) {

                st.add(nums[j]);
                j++;
            }
            right=st.size();
            st.clear();
            while (k>=0){
                st.add(nums[k]);
                k--;
            }
          left=st.size();
            st.clear();
            result[i]=(left-right);

        }

        for(int r:result){
            System.out.print(r+"\t");
        }
    }
}
