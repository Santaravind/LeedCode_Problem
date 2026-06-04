package DSA.String;

public class Valid_Palindrome_125 {
   public static   boolean polinDrone(String s){
       s=s.toLowerCase();
       char ch[]=new char[s.length()];
       int j=0;
       for (int i=0; i<s.length(); i++){
           if ((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='0'&&s.charAt(i)<='9')){
               ch[j++]=s.charAt(i);
//               System.out.println(s.charAt(i));
           }
       }

       int i=0;
       int k=j-1;
//       System.out.println(j+" "+k+" "+ch.length);
       while(i<k){
           if (ch[i]!=ch[k]){
               return false;
           }
           i++;
           k--;
       }
        return true;
    }
    public static void main(String[] args) {
        String s= "A man, a plan, a canal: Panama";
//        String s= "race a car";
//        String s= "0P";

//        System.out.println(s.hashCode());
//        System.out.println(s.toLowerCase());
//      s= s.toLowerCase();
//        System.out.println(s);
//            char ch[]=s.toCharArray();
//        System.out.println(ch.length);

//         It will take 1ms
         System.out.println(polinDrone(s));




    }
}
