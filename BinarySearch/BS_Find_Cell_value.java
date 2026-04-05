package DSA.BinarySearch;

public class BS_Find_Cell_value {
    public static void main(String mar[]){

        int arr[]={2,3,5,6,7,8,9,11,12};
          int element=13;
          int start =0;
          int end=arr.length-1;
          int ans=0;
          while(start<=end){
              int mid=start+(end-start)/2;

              if (arr[mid]==element){
                  System.out.println("Cell value "+arr[mid]);
                  return;
              }

              if (arr[mid]>element){
                  ans=arr[mid];
                  end=mid-1;
              }else if (arr[mid]<element){
                  start=mid+1;
              }


          }
        System.out.println("Ceil value "+ans);
    }
}
