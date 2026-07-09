package DSA.Stack;

import java.util.ArrayList;
import java.util.List;

public class Stack_Span_Problem {
    public static void main(String[] args) {
//        int arr[]={100,80,60,70,60,75,85};
        int arr[]={29,91,62,76,51};
//        [null,1,2,1,2,1]
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if (list2.isEmpty()){
                list.add(1);
            } else {
                int count=0;
                int j=list2.size()-1;
                  while (j>=0){
                      if (list2.get(j)<arr[i]){
                          count++;
                      }
                      j--;
                  }
                  list.add(count+1);
            }
            list2.add(arr[i]);
        }
        System.out.println(list);
    }
}
