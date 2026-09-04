package DSA.String;

import java.util.ArrayList;
import java.util.List;


//A valid IP address consists of exactly four integers separated by single dots.
//Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.
//For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses,
//but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.

public class Restore_IP_Addresses_93 {
    public static List<String> restoreIpAddresses(String s) {

           if (s.length()<4) return new ArrayList<>();

           List<String>list=new ArrayList<>();
           StringBuilder sb=new StringBuilder();
           for (char c:s.toCharArray()){
              if (c-'0'>=0&&c-'0'<=9){
                  sb.append(c);
              }
              if (sb.length()==3){
                  if (Integer.parseInt(sb.toString())<=255) {
                      list.add(sb.toString());
                      list.add(".");
                      sb.delete(0, 2);
                  }else {
                      return new ArrayList<>();
                  }
              }

           }



        return new ArrayList<>();
    }
    public static void main(String[] args) {
//        String st="25525511135";
        String st="255";

        System.out.println(st.length());
    }
}
