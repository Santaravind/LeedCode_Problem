package DSA.recursion;

public class Factorial {
    public static long factor(int n){
        if (n==0||n==1){
            return 1;
        }
        return n*factor(n-1);
    }
    public static void main(String[] args) {
        int n=15;
        System.out.println(factor(n));
    }
}
