package DSA.Stack;

import java.util.*;

public class Nearest_Greater_To_Right {
    public static void main(String args[]){
//        int arr[]={1,3,2,4};
        int arr[]={1,7,5,1,9,2,5,1};

        Deque<Integer>stack= new ArrayDeque<>();
        List<Integer>list=new ArrayList<>();
          int result[]=new int[arr.length];
          int j=0;
        for (int i=arr.length-1; i>=0; i--){
            if (stack.isEmpty()){
                list.add(0);
                result[j]=0;
            }else if (stack.size()>0&&stack.peek()>arr[i]){
                list.add(stack.peek());
                result[j]=stack.peek();
            }
            else if (stack.size()>0 &&stack.peek()<=arr[i]){
                while (stack.size()>0 && stack.peek()<=arr[i]) {
                    {
                        stack.pop();
                    }
                    if (stack.size()==0){
                        list.add(0);
                        result[j]=0;
                    }else {
                        list.add(stack.peek());
                        result[j]=stack.peek();
                    }
                }
            }
            stack.push(arr[i]);
            j++;
        }

        System.out.println(list.reversed());
        for (int v: result){
            System.out.print(v+" ");
        }

    }
}
