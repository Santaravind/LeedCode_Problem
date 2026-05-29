package DSA.Arrays;

public class Minimum_Element_After_Replecement_With_Digit_Sum_3300 {
    public static void main(String args[]){
//        int arr[]={10,12,13,4};
        int arr[]={199,19,199};
        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            int n=arr[i];
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n=n/10;
            }
            min=Math.min(sum,min);
        }

        System.out.println(min);
    }
}
