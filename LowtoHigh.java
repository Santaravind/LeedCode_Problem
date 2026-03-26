package DSA;
//
//import java.util.*;
//
//public class LowtoHigh {
//    public static  void main(String args []){
//        int low ,high ;
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter low value ");
//        low=sc.nextInt();
//        System.out.println("Enter high value");
//        high=sc.nextInt();
//        Vector<Integer>v=new Vector<>();
//        for (int i=low; i<=high;i++){
//            int n=i;
//            if (n<10){
//                System.out.print(i+" ");
//            }else {
//                while (n != 0) {
//                    int rem = n % 10;
//                    v.add(rem);
//                    n /= 10;
//                }
//                Collections.sort(v);
//                int j = 0;
//                int count = 0;
//                for (int k = j+1; k < v.size() ; k++) {
//                    System.out.print(v.get(k)+" ");
//                        if (v.get(k)==v.get(j)) {
//                            v.clear();
//                            break;
//
//                        }
//                        count++;
//                        j++;
//
//                }
//                v.clear();
//                if (count == 2) {
//                    continue;
//                }
//                System.out.print(i + " ");
//
//            }
//        }
//
////        String s="";
////        int low, high;
////        Scanner sc=new Scanner(System.in);
////        System.out.println("Enter low value");
////        low=sc.nextInt();
////        System.out.println("Enter high vlaue");
////        high=sc.nextInt();
////        int sum=0;
////        for (int i=low; i<=high; i++){
////            int n=i;
////            if(n<10){
////                System.out.print(" ");
////            }else {
////                while (n!=0){
////                    int rem=n%10;
////                     s=rem+s;
////                    sum=sum*10+rem;
////                    n=n/10;
////                   }
////
////            }
////
////            if (i==sum){
////                continue;
////            }
////            sum=0;
////            System.out.print(i+" ");
////        }
//
////        for (int i=low; i<=high; i++){
////            int n=i;
////            if (n<10){
////                System.out.print(i+" ");
////            }else{
////                do{
////                 int rem=n%10;
////                   hs.add(rem);
////                   sum=sum*10+rem;
////
////                    n=n/10;
////                } while(n!=0);
////
////                if (i==sum){
////                    hs.clear();
////                    continue;
////                }
////
////                    if (hs.size() == 2) {
////                        hs.clear();
////                    }
////
////
////                sum=0;
////                Iterator<Integer> iterator=hs.iterator();
////                while (iterator.hasNext())
////                    System.out.print(iterator.next() );
//////               System.out.print(hs+" ");
//////                System.out.print(i+" ");
////                hs.clear();
////                System.out.print(" ");
////
////            }
////
////
////        }
//
//
//
//    }
//}
import java.util.*;

public class LowtoHigh {

    public static void main(String args[]) {

        int low, high;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter low value ");
        low = sc.nextInt();

        System.out.println("Enter high value");
        high = sc.nextInt();

        for (int i = low; i <= high; i++) {

            int n = i;
            boolean duplicate = false;

            int digit[] = new int[10];

            while (n != 0) {
                int rem = n % 10;

                if (digit[rem] == 1) {
                    duplicate = true;
                    break;
                }

                digit[rem] = 1;
                n /= 10;
            }

            if (!duplicate) {
                System.out.print(i + " ");
            }
        }
    }
}
