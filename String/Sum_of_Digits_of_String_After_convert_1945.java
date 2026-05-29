package DSA.String;
//Input: s = "iiii", k = 1
//
//Output: 36
//
//Explanation:
//
//The operations are as follows:
//        - Convert: "iiii" ➝ "(9)(9)(9)(9)" ➝ "9999" ➝ 9999
//        - Transform #1: 9999 ➝ 9 + 9 + 9 + 9 ➝ 36
//Thus the resulting integer is 36.
public class Sum_of_Digits_of_String_After_convert_1945 {
    public static int getLucky(String s, int k) {

        int i=0;
        int sum=0;
        while(i!=s.length()){
              int n=s.charAt(i)-'a'+1;
             sum+=n%10;
             sum+=n/10;

/**             this is working
                   But if string in lowercase only then stirng integer convertion it only
                 two digit. in this conclusion we can ilement the while loops*/
//            while(n>0){
//                  int rem=n%10;
//                   sum+=rem;
//                   n/=10;
//              }

              i++;
        }


//        this code also working
        if (k>1){

            while(k>1){
                int n=sum;
                int result=0;
                while(n>0){
                    int rem=n%10;
                    result+=rem;
                    n/=10;
                }
                sum=result;
                k--;
            }
        }



        return  sum;
    }
    public static void main(String args[]){
//        String s="iiii";
//        String s="zbax";
//        String s="leetcode";
        String s="qhquvppzooyt";
        int k=6;

//        System.out.println(s.charAt(0)-'a'+1);

        System.out.println(getLucky(s,k));
    }
}
