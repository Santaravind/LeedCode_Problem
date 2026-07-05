package DSA.recursion;

public class Trazing_Zero_172 {
//    public static long fact(int n){
////       if(n==0) return 1;
//        if (n==0){
//            return 1;
//        }
//        return n*fact(n-1);
//    }
//    public  static  int trailingZeroes(int n) {
//
//        long digit =fact(n);
//        System.out.println(digit);
//        int count=0;
//        while (digit>0){
//            long rem= digit%10;
//            if (rem==0){
//                count++;
//            } else if (rem!=0) {
//                break;
//
//            }
//
//            digit/=10;
//
//        }
//        return count;
//    }
    public static void main(String[] args) {
        int n=10;
//        System.out.println(" Trailing zero"+trailingZeroes(n));

        int count=0;
        while (n>=5){
            n=n/5;
            count+=n;
        }

        System.out.println("Total number of Trazing  "+count);
    }
}
