package DSA.Math;

public class Count_Integer_With_Even_Digit_Sum_2180 {
//    Given a positive integer num, return the number of positive integers
//   less than or to num whose digit sums are even.
//    The digit sum of a positive integer is the sum of all its digits.
    public static int countEven(int num) {
         int count=0;
//          int sum=0;
//          if (num<10){
//              return 4;
//          }else {
              for (int i = 2; i <= num; i++) {
                  int n = i;
                int  sum=0;
                    while (n>0){
                        int rem=n%10;
                          sum+=rem;
                          n/=10;
                    }
                    if (sum%2==0){
                        count ++;
                    }


          }

        return count;
    }
    public static void main(String args[]){

//           int nums=4;
           int nums=30;
        System.out.println(countEven(nums));

    }
}
