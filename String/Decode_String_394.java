package DSA.String;

import java.util.ArrayDeque;
import java.util.Deque;

public class Decode_String_394 {
    public static String decodeString(String s) {
        Deque<Integer> countStack = new ArrayDeque<>();
        Deque<StringBuilder> stringStack = new ArrayDeque<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Form multi-digit numbers properly (e.g. "12")
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Save current state on stacks and reset
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                // Pop saved state and multiply current repeated segment
                StringBuilder decodedString = stringStack.pop();
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // Append normal letters
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
    public static void main(String[] args) {
        String st="3[a]2[cd]";
//        String st="3[a2[c]]";

        System.out.println(decodeString(st));
        Deque<String>stack=new ArrayDeque<>();
        Deque<Integer>number=new ArrayDeque<>();

        int n=st.length()-1;
//        StringBuilder sb=new StringBuilder();
//        while(n>=0){
//          if (st.charAt(n)>='a'&&st.charAt(n)<='z'){
//              sb.append(st.charAt(n));
//
//          }else  if (st.charAt(n)=='['){
//              sb=sb.reverse();
//              stack.push(sb.toString());
//              sb.delete(0,sb.length());
//
//          }else    if (st.charAt(n)>='1'&&st.charAt(n)<='9'){
////              stack.push(String.valueOf(st.charAt(n)));
//                  int p=st.charAt(n)-'0';
//                  String s=stack.pop();
//                  while (p>0){
//                      ans.append(s);
//                      p--;
//                  }
//          }
//          n--;
//        }

//        int i=0;
//        for (char ch : st.toCharArray()){
//            if (Character.isDigit(ch)){
//                number.push(ch-'0');
//            }else if (ch==']'){
//                StringBuilder sb=new StringBuilder();
//                while (!stack.isEmpty()){
//                    String s=stack.pop();
//                    if (s.equals('[')){
//                        break;
//                    }
//                    sb.insert(0,s);
//                }
//                int x=number.pop();
//                StringBuilder ans= new StringBuilder();
//                while (x>0){
//                    ans.append(sb);
//                    x--;
//                }
//                stack.push(ans.toString());
//
//            }else if (ch!=']'){
//                stack.push(String.valueOf(ch));
//            }
//
//        }
        for (char ch : st.toCharArray()) {

            if (Character.isDigit(ch)) {
                number.push(ch - '0');
            }
            else if (ch == ']') {

                StringBuilder sb = new StringBuilder();

                while (!stack.isEmpty()) {
                    String s = stack.pop();

                    if (s.equals("[")) {
                        break;
                    }

                    sb.insert(0, s);
                }

                int x = number.pop();

                StringBuilder ans = new StringBuilder();

                while (x-- > 0) {
                    ans.append(sb);
                }

                stack.push(ans.toString());
            }
            else {
                stack.push(String.valueOf(ch));
            }
        }

        System.out.println(String.valueOf(stack));
        System.out.println(stack);
    }
}
