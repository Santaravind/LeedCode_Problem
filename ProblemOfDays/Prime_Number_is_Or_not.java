package DSA.ProblemOfDays;

public class Prime_Number_is_Or_not {
   public static boolean isPrimeNumber(int n){


       for (int i=2; i*i<n; i++){
           if (n%i==0){
               return  false;
           }
       }


       return true;
    }
    public static void main(String[] args) {
        int n=12;

      boolean isPrime=isPrimeNumber(n);
      if (isPrime){
          System.out.println("Prime");
      }else {
          System.out.println("not Prime ");
      }
//      instanceof
        Object obj="Sant";
      if ( obj instanceof String){
          System.out.println(true);
      }
    }
}
