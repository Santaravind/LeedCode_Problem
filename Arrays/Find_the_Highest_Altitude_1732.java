package DSA.Arrays;

public class Find_the_Highest_Altitude_1732 {
    public static void main(String[] args) {
//        int gain[]={-5,1,5,0,-7};
        int gain[]={-4,-3,-2,-1,4,3,2};
//[0,-5,-4,1,1,-6]
//        int arr[]=new int[gain.length+1];
     int arr=0;

    int count=0;
        for (int i=0; i<gain.length; i++){
        arr=arr+gain[i];
        count=Math.max(count,arr);
        }

//        for (int v: arr){
//            System.out.print(v+" ");
//        }
        System.out.println(" ");
        System.out.println(count);
    }
}
