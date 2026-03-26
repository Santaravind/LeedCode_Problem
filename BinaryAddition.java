package DSA;

import java.util.Arrays;
import java.util.LinkedList;

public class BinaryAddition {
    public static void main(String args[]){
        String a="11";
        String b="1";
        var sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        for (int carry = 0; i >= 0 || j >= 0 || carry > 0; --i, --j) {
            carry += (i >= 0 ? a.charAt(i) - '0' : 0) + (j >= 0 ? b.charAt(j) - '0' : 0);
            sb.append(carry % 2);
            carry /= 2;
        }
        String abs=sb.reverse().toString();
        System.out.println(abs);

    }
}
