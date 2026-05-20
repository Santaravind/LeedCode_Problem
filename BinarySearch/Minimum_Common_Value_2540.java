package DSA.BinarySearch;

public class Minimum_Common_Value_2540 {
    public static void main(String args[]){
        int n[]={2,4};
        int m[]={1,2};
        int result=0;
        int Min;

        for (int  i=n.length-1; i>=0; i--){
            Min=n[i];
            for (int j=0; j<m.length; j++){
                if (Min==m[j]){
                    result=Min;
                }

            }

        }
        System.out.println("Miniman : "+ result);
    }
}
