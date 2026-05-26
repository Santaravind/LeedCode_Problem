package DSA.BinarySearch;

public class Find_Peek_Element {
    //peek element means , element is greater than its left and right
    //1,3,4,6,5
    // hear is 6 is peek element


    public static void main(String args[]){
        int arr[]={55,30,28,25,27};

        int start=0;
        int end=arr.length-1;
          while(start<=end){
              int mid=start+(end-start)/2;
              if(mid>0&&mid<arr.length-1){
                  if (arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                      System.out.println(mid);
                      break;
                  }
                  if(arr[mid]<arr[mid+1]){
                      start=mid+1;
                  }else end=mid-1;
              }else if (mid==0){
                  if (arr[0]>arr[1]){
                      System.out.println(arr[mid]);
                      break;
//                      return 0;
                  }else {
                      System.out.println(arr[mid+1]);
                      break;
//                      return 1;
                  }
              }else if(mid==arr.length-1){
                  if (arr[mid]>arr[mid-1]){
                      System.out.println(arr[mid]);
                      break;
//                      return arr.length-1;
                  }else {
                      System.out.println(arr[mid-1]);
                      break;
//                      return arr.length-2;
                  }
              }
          }
    }



}
