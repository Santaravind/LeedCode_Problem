package DSA.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class Decode_394_String {
    public static String decodeString(String s){
        Deque<String>stack=new ArrayDeque<>();
        Deque<Integer>num=new ArrayDeque<>();
            int k=0;
        for (char ch:s.toCharArray()){
            if (Character.isDigit(ch)){
                 k=k*10+ch-'0';
            }else if (ch=='['){
                num.push(k);
                k=0;
                stack.push("[");
            }else if (ch==']'){
                int n=num.pop();
                StringBuilder sb=new StringBuilder();
                while (!stack.isEmpty()&&!stack.peek().equals("[")){
                    sb.append(stack.pop());
                }
                stack.pop();

                String rep=sb.toString().repeat(n);
                stack.push(rep);
            }else {
                stack.push(String.valueOf(ch));
            }
        }
        StringBuilder sb=new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        System.out.println(sb.reverse());

        return "";
    }
    public static void main(String[] args) {
//        String st="3[a]2[c]";
        String st="1[a2[cb]]";
        System.out.println(decodeString(st));
    }
}
