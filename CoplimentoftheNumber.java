package DSA;

import java.util.Scanner;

public class CoplimentoftheNumber {
    public static void main(String args[]){
        int x;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value that you want to comliment");
        x=sc.nextInt();

        String s="";
//         String s1=Integer.toBinaryString(x);
//        System.out.println(s1);
//        int j=0;
//        int sum=0;
//         char c1[]=s1.toCharArray();
//        for (int i=c1.length-1;i>=0;i--){
//            sum +=(c1[i]-'0')*Math.pow(2,j);
//            j++;
//        }


        while (x!=0){
            int remi=x%2;
            if (remi==0){
                remi=1;
            }else {
                remi=0;
            }
            s=remi+s;

               x=x/2;
        }
        char c[]=s.toCharArray();
        System.out.println(s);
          int sum=0;
         int j=0;
//        for (int i=c.length-1;i>=0;i--){
//            if(c[i]=='0'){
//                c[i]='1';
//            }else {
//                c[i]='0';
//            }
//              }

        for (int i=c.length-1;i>=0;i--){
            sum +=(c[i]-'0')*Math.pow(2,j);
            j++;
        }
       System.out.println(sum);
    }
}
