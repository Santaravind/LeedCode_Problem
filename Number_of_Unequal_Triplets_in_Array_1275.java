package DSA;
//this code work of 53/100 test cases
public class Number_of_Unequal_Triplets_in_Array_1275 {
    public static void main(String args[]){
        int nums[]={1,1,1,1,1};
        int count=0;

         for (int i=0; i<nums.length-1; i++){
             int j=i+1;
             int k=nums.length-1;
             while (j<k){
                 if((nums[i]!=nums[j])&&(nums[j]!=nums[k])){
                     count++;
                 }
                 j++;
                 k--;
             }
         }
        System.out.println(count);
    }
}
