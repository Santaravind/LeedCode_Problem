package DSA.Graph;

import java.util.*;

public class Find_the_Town_Judge_997 {
    public static int findJudge(int n, int[][] trust) {
        HashMap<Integer, List<Integer>>map=new HashMap<>();
          int arr[]=new int[n+1];
          for (int i=1; i<=n; i++){
                 map.putIfAbsent(i,new ArrayList<>());
          }
          int b=trust[0][1];
          for (int t[]: trust){
             int u=t[0];
             int v=t[1];
             arr[u]--;
             arr[v]++;
              map.get(u).add(v);
          }
          for (int v:map.keySet()){
              if (map.get(v).isEmpty()){
                  map.get(v).add(v);
              }
              System.out.println(v+" ->"+map.get(v));
          }
          for (int i=1; i<=n; i++){
              if (arr[i]==0){
                  arr[i]=i;
              }
          }

           for (int i=1; i<=n; i++){
               if (arr[i]==n-1){
                   return i;
               }
           }

          return -1;
    }
    public static void main(String args[]){
       int n = 4;
//       int trust[][] = {{1,3},{2,3}};
//       int trust[][] = {{1,3},{2,3},{3,1}};
        int trust[][]={{1,3},{1,4},{2,3},{2,4},{4,3}};

        System.out.println(findJudge(n,trust));
    }
}
