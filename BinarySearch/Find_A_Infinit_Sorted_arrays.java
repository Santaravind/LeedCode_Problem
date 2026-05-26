package DSA.BinarySearch;

public class Find_A_Infinit_Sorted_arrays {
    public static boolean BS(int arr[],int start, int end,int find){
        while(start<=end){
            int mid=start+(end-start)/2;
             if (arr[mid]==find){
                 return  true;
             }
             if (arr[mid]<find){
                 start=mid+1;
             }else end=mid-1;
        }
        return false;
    }
    public static void main(String arg[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
         int find=7;
         int start=0;
         int end=start+1;

         while(true){
             if (arr[end]>find){
                 break;
             }else {
                 start=end;
                 end=end*2;
             }

         }

        System.out.println( BS(arr ,start,end,find));
//        System.out.println(start+" "+end);

    }
}
