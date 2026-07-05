package DSA.recursion;

public class Print_one_to_N {
    public static  void printNTo1(int n){
        if (n==1){
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printNTo1(n-1);
    }
    public static  void print(int n){
        if (n==1){
            System.out.print(n+" ");
        }else {
             print(n - 1);
            System.out.print(n+" ");
        }

    }
    public static void main(String args[]){
        int n=10;
         print(n);
        System.out.println(" ");
         printNTo1(n);
    }
}
