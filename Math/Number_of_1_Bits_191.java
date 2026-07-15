package DSA.Math;

public class Number_of_1_Bits_191 {
    public static void main(String[] args) {
        int n=2147483645;
        int count =0;
        while(n!=1){

            if(n%2==1){
                count++;
            }
            n/=2;
        }

        System.out.println(count+1);
    }
}
