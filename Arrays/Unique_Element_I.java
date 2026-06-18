package DSA.Arrays;

public class Unique_Element_I {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,1,2,3};

        int xor=0;
        for (int num:arr){
            xor^=num;

        }
        System.out.println(xor);



    }
}
