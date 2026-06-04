package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Total_Waviness_of_Numbers_in_Range_I_3751 {
    public static void  main(String a[]){

        int num1= 120;
        int num2=130;
        int count=0;
        Stack<Integer>st=new Stack<>();
        List<Integer> ls=new ArrayList<>();
        for (int i=4848; i<=4848; i++){
            int n=i;

            while(n>0){
                int rem=n%10;
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

        System.out.println(count);
    }
}
