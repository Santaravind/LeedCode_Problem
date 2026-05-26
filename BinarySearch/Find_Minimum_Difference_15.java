package DSA.BinarySearch;

public class Find_Minimum_Difference_15 {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,12,13,15};
        int keys=14;
         int start=0;
         int end=arr.length-1;
         while(start<=end){
             int mid=start+(end-start)/2;

             if(arr[mid]==keys){
                 System.out.println(arr[mid]);
             }
             if (arr[mid]<keys) {
                 start=mid+1;
             }else {
                 end=mid-1;
             }

         }

         int n=Math.abs(arr[start]-keys);
         int m=Math.abs(arr[end]-keys);

         if(n<m){
             System.out.println(arr[start]);
         }else System.out.println(arr[end]);


//        System.out.println(start+""+ end);

    }
}
