package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Top_K_Frequent_Elements_347 {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,1,3};
int k=2;
////        if (arr.length==1)return arr;
//        int count[]=new int[arr.length];
//        for (int i=0; i<arr.length; i++){
//            count[arr[i]]+=1;
//        }
//        Arrays.sort(arr);

        HashMap<Integer,Integer>map=new HashMap<>();
          List<Integer>[]buked=new List[arr.length+1];
        for (int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int key: map.keySet()){
            int fre=map.get(key);
            if (buked[fre]==null){
                buked[fre]=new ArrayList<>();
            }
            buked[fre].add(key);
        }

        int []res=new int[k];
          int count=0;
          for (int pos= buked.length-1; pos>=0&&count<k; pos--){
              if (buked[pos]!=null){
                  for (Integer integer: buked[pos]){
                      res[count++]=integer;
                  }
              }
          }

        System.out.println(res[0]+" "+res[1]);


    }
}
