package DSA.Arrays;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Total_Waviness_of_Numbers_in_Range_II_3753 {
    public static long totalWaviness(long num1, long num2) {
        long count=0;

//        Time Limit Exceeded
//        972 / 1013 testcases passed
        List<Integer> ls=new ArrayList<>();
        for (long i=num1; i<=num2; i++){
            long n=i;

            while(n>0){
                int rem=(int) n%10;
                ls.add(rem);
                n/=10;
            }
            for(int j=0; j<ls.size()-1; j++){
                if(j>0&& j<ls.size()-1){
                    if ((ls.get(j)>ls.get(j-1)&&ls.get(j)>ls.get(j+1))||(ls.get(j)<ls.get(j-1)&&ls.get(j)<ls.get(j+1))){
                        count++;
                    }
                }
            }
            ls.clear();
        }
        return  count;
    }
    public static void main(String[] args) {
//        long num1=120;
//        long num2=130;
//        long  num1 = 198, num2 = 202;
        long  num1 = 4848, num2 = 4848;

        System.out.println(totalWaviness(num1, num2));



    }
}
