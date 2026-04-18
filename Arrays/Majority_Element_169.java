package DSA.Arrays;

import java.util.Arrays;

public class Majority_Element_169 {
    public static void main(String args[]){
        int nums[]={3,2,3};
//        int nums[]={2,2,1,1,1,2,2};

        Arrays.sort(nums);


        int fre[]=new int[11];

        for(int i=0; i<nums.length; i++){
            fre[nums[i]]++;
        }
        int maxFreq = 0;
        int result = 0;
        for (int i = 0; i < fre.length; i++) {
            System.out.print(fre[i] + " ");
            if (fre[i] > maxFreq) {
                maxFreq = fre[i];
                result = i;
            }
        }

//        int count = 0;
//        int candidate = 0;
//
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;   // Pick new candidate
//            }
//            count += (num == candidate) ? 1 : -1;  // Vote
//        }
//
//        return candidate;

        System.out.println(result);
    }
}
