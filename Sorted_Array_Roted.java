package DSA;

public class Sorted_Array_Roted {
//    public static int BinarySerarch(int num[],int start , int end, int target){
//
//        int mid=start+(end-start)/2;
//        if (start > end) {
//            return -1;
//        }
////        int target1 = target;
//        if(num[mid]== target){
//            return  mid;
//        }else if(num[mid]>=target) {
//                BinarySerarch(num,mid+1,end, target);
//        }else{
//            BinarySerarch(num,start,mid-1, target);
//        }
//       return  -1;
//    }
    public static void main(String args[]){

        int arr[]={12,13,14,15,0,2,3,4,5};

        int start =0;
        int end=arr.length-1;
        int n=arr.length;
        System.out.println(n);
        int x=0,y=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            int pre=(mid+n-1)%n;
            int next=(mid+1)%n;
            if(arr[mid]<arr[pre]&&arr[mid]<arr[next]){
                System.out.println(mid);
                 return;
            }else if(arr[start]<=arr[mid]){
             start=mid+1;

            }else if (arr[mid]<=arr[end]){
                 end=mid-1;
             }

        }




    }
}
