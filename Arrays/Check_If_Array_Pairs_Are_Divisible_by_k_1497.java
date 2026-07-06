package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Check_If_Array_Pairs_Are_Divisible_by_k_1497 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
//        int arr[]={1,2,3,4,5,6};
        int k=5;
//        int k=5;
//        HashMap<Integer,Integer>map=new HashMap<>();
//        for (int v: arr ){
//            int rem=v%k;
//            if (rem<0){
//                rem=rem+k;
//            }
//            map.put(rem,map.getOrDefault(rem,0)+1);
//        }
//
//        for (Map.Entry<Integer,Integer>e:map.entrySet()){
//
//            if (e.getKey()==0){
//                if (map.get(e.getKey())%2!=0) {
//                    System.out.println(false);
//                    return;
//                }
//            }else {
//                int rem = e.getKey();
//                int complement = k - rem;
//                if (map.get(rem) != map.get(complement)) {
//                    System.out.println(false);
//                    return;
//                }
//        }
//        }
//
//        System.out.println(true);
//        System.out.println(map);

        //decond method
        int rem[]=new int [k];
        for (int v:arr){
            int r=(((v%k)+k)%k);
            rem[r]++;
        }
        for (int i=1; i <k; i++){
            if(rem[i]!=rem[k-i]){
                System.out.println(false);
                return;
            }
        }
          if (rem[0]%2!=0) {
              System.out.println(false);
              return;
          }else {
              System.out.println(true);
          }
    }
}
