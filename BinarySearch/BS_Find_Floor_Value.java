package DSA.BinarySearch;

public class BS_Find_Floor_Value {

    public static void  main(String args[]){
        int arr[]={1,3,4,6,7,8,9,20,30};
        int element=5;
              int start=0;
              int end=arr.length-1;
              int ans = 0;
          while(start<=end){
               int mid=start+(end-start)/2;
               if (arr[mid]==element){
                   System.out.println(arr[mid]);
                   return;
               }
               if(arr[mid]<element){
                   ans=arr[mid];
                   start=mid+1;

               }else if(arr[mid]>element){
                   end=mid-1;
               }
          }

        System.out.println("The floor value"+ans);

    }
}
