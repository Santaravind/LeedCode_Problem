package DSA.Arrays;

import java.util.*;

public class Concatenate_Non_Zero_Digits_and_Multiply_bY_Sum_I_3754 {
    public static void main(String[] args) {
        int digit=10203004;
        List<Integer> list=new ArrayList<>();
        int sum=0;
        int m=0;
        while(digit!=0 ){
            int rem=digit%10;
            if (rem!=0){
                sum+=rem;
//                queue.offer(rem);
                list.add(rem);
            }
            digit=digit/10;
        }

        for (int i=list.size()-1; i>=0; i--){
            m=m*10+list.get(i);
        }
//        System.out.println(sum);

        System.out.println(m*10);

    }
}
