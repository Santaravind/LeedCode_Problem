package DSA.Stack;

import java.util.*;

public class Nearest_Greater_To_Right {
    public static void main(String args[]){
        int arr[]={1,3,2,4};

        Deque<Integer>stack= new ArrayDeque<>();
        List<Integer>list=new ArrayList<>();

        for (int i=arr.length-1; i>=0; i--){
            if (stack.isEmpty()){
                list.add(-1);
            }else if (stack.size()>0&&stack.peek()>arr[i]){
                list.add(stack.peek());
            }
            else if (stack.size()>0 &&stack.peek()<=arr[i]){
                while (stack.size()>0 && stack.peek()<=arr[i]) {
                    {
                        stack.pop();
                    }
                    if (stack.size()==0){
                        list.add(-1);
                    }else {
                        list.add(stack.peek());
                    }
                }
            }
            stack.push(arr[i]);
        }
        System.out.println(list.reversed());

    }
}
