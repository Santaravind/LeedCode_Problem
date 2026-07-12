package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int mult=1;


        //this approach woke but when 0 in arr it can fails
        for (int i=0; i<arr.length; i++){
            mult*=arr[i];
        }
        List<Integer>list=new ArrayList<>();
        for (int i=0; i<arr.length; i++){
            list.add(mult/arr[i]);
        }

        //O(n)
      int result[]=new int[arr.length];
        int prefix=1;
        int sufix=1;
        for (int i=0; i<arr.length; i++){
             result[i]=prefix;
             prefix=prefix*arr[i];
        }

        for (int j=arr.length-1; j>=0; j--){
            result[j]*=sufix;
            sufix=sufix*arr[j];
        }
        System.out.println(list);
        for (int v: result){
            System.out.print(v+" ");
        }

    }

}
