package DSA.Stack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Nearest_Greater_To_Left {
    public static void main(String arg[]){
        int arr[]={3,2,4,2,5,1};
        Deque<Integer>stack=new ArrayDeque<>();
        List<Integer>list=new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if (stack.isEmpty()){
                list.add(-1);
            }else if (stack.size()>0&&stack.peek()>arr[i]) {
                list.add(stack.peek());

            }else if (stack.size()>0&&stack.peek()<=arr[i]){
                while (stack.size()>0&&stack.peek()<=arr[i]){
                    stack.pop();
                }
                if (stack.size()==0){
                    list.add(-1);
                }else {
                    list.add(stack.peek());
                }
            }

            stack.push(arr[i]);
        }

        System.out.println(list);
    }
}
