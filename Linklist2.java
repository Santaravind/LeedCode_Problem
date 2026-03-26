package DSA;
import java.util.*;
public class Linklist2 {
    public static void main(String arg[]){
        LinkedList<String>list=new LinkedList<>();

        list.addFirst("sant");
        list.add("singh");

        System.out.println(list);
       list.addFirst("aravind");
        System.out.println(list);
        list.addLast("software");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.reversed();
        System.out.println( list.reversed());
    }
}
