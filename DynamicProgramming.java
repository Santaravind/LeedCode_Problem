package DSA;

public class DynamicProgramming {
    public static int fib(int n){
        int fibonaci[] =new int[n+1];
        fibonaci[1]=0;
        fibonaci[1]=1;
        for (int i=2; i<=n; i++){
            fibonaci[i]=fibonaci[i-1]+fibonaci[i-2];
        }

        return fibonaci[n];
    }
    public static void main(String args[]){
//        int n=1000;
        int n=5;
      int result=  fib(n);
        System.out.println(result);
    }
}
