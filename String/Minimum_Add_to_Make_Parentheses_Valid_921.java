package DSA.String;

import java.util.Stack;

public class Minimum_Add_to_Make_Parentheses_Valid_921 {
    public static int minAddToMakeValid(String s) {

        int count=0 , close=0;
//        for (int i=0; i<s.length(); i++){
//            if (s.charAt(i)=='('){
//                count++;
//            }else
//            { if (s.charAt(i)==')'&&count>0&&i>0&&s.charAt(i-1)!='('){
//                count--;
//            }else {
//                close++;
//            }
//        }
//        }

        Stack<Character>stack=new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if (s.charAt(i)==')'&& !stack.empty()){
                stack.pop();
            }else if (s.charAt(i)==')'){
                count++;
            }
        }


        return Math.abs(count)+stack.size();
    }
    public static void main(String args[]){
//        String s="()))((";
        String s="())";
        System.out.println(minAddToMakeValid(s));
    }
}
