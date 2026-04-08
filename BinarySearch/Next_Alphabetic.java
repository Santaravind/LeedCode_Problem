package DSA.BinarySearch;

public class Next_Alphabetic {
    public static void main(String args[]){
        char ch[]={'a','b','c','g','h','i'};
        char result ='#';
        char key='g';
        int start=0;
        int end=ch.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (ch[mid]==key){
//                result=ch[mid+1];
//                break;
            start=mid+1;
            }
            if (ch[mid]<key){
                start=mid+1;
            } else if (ch[mid]>key) {
                    result=ch[mid];
                    end=mid-1;

            }
        }
      if (result!='#') System.out.println("result "+result);
      else System.out.println("No next alphabet in your given key"+ key);
    }
}
