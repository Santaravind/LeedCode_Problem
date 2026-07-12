package DSA.String;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_2942 {
    public static void main(String[] args) {
        String words[]={"sant","Leedcode"};
        String x="e";
        List<Integer> list=new ArrayList<>();
        int n=0;;
        for(String s: words){
            // int count=0;
            if(s.contains(String.valueOf(x))){
                list.add(n);
            }
            //This is also working
            // for(char ch:s.toCharArray()){
            //    if(ch==x){
            //     count ++;
            //     break;
            //    }
            // }
            // if(count==1) list.add(n);

            n++;
        }
        System.out.println(list);

//        return list;
    }
}
