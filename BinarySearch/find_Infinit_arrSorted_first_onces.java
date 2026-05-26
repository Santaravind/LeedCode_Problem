package DSA.BinarySearch;

public class find_Infinit_arrSorted_first_onces {
    public static int BS(int arr[], int start, int end){
               int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==1){
                result=mid;
                end=mid-1;
            }else start=mid+1;

//            if (arr[mid]!=1){
//                start=mid+1;
//            }else {
//                end=mid-1;
//            }
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={0,0,0,0,0,0,0,0,0,0,0, 0,1,1,1,1,1,1,1,1,1,1,1,1};
         int start=0;
         int end=1;

        while(true){
            if (arr[end]==1){
                break;
            }else {
                start=end;
                end=end*2;
            }
        }
        System.out.println(start+" "+end);
        System.out.println(BS(arr,start,end));
    }
}
