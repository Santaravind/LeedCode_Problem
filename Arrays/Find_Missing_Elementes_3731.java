package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Find_Missing_Elementes_3731 {
    public static void main(String ars[]){
        int arr[]={1,4,2,5};
        List<Integer>list=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int v: arr){
            min=Math.min(min,v);
            max=Math.max(max,v);
            list.add(v);
        }
        List<Integer>ans=new ArrayList<>();
        for (int i=min; i<=max; i++){
            if (list.contains(i)){continue;
            }
            ans.add(i);
        }

        System.out.println(ans);
    }
}
