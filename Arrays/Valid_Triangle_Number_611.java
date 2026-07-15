package DSA.Arrays;

public class Valid_Triangle_Number_611 {
    public static  void main(String args[]){
        int arr[]={2,3,4,4,5};

        int count=0;
        for (int i=arr.length-1; i>=2; i--){
            int left=0;
            int right=i-1;
            while (left<right){

                if (arr[left]+arr[right]>arr[i]){
                    count+=right-left;
                    right--;
                }else {
                    left++;
                }

            }
        }
        System.out.println(count);

    }
}
