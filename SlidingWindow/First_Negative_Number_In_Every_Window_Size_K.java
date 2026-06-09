package DSA.SlidingWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class First_Negative_Number_In_Every_Window_Size_K {

    public static void main(String[] args) {
        int arr[]={12,-1,-7, 6,8,-5,8,9,1};
//        int arr[]={12,-1,-7, 8,-15,30,13,20};
        int i=0;
        int j=0;
        int k=3; //window size
        List<Integer> ls=new ArrayList<>();
        Vector<Integer>v=new Vector<>();
        while (j<arr.length){
            if (arr[j]<0) ls.add(arr[j]);

            if(j-i+1<k) j++;
            else if (j-i+1==k){
                if (ls.isEmpty()){
                    v.add(0);
                }else {
                    v.add(ls.getFirst());
                    if (arr[i]== ls.getFirst()){
                        ls.removeFirst();
                    }

                }
                j++;
                i++;
            }
        }

        for (int z:v){
            System.out.print(z+" ");
        }

    }
}
