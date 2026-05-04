package DSA.String;

public class Length_Of_Last_world_58 {
 public static void main(String args[]){
//     String s="Hello world";
//     String s = "luffy is still joyboy";
     String  s="   fly me   to   the moon  ";

     int i=s.length()-1;
     int count=0;
//     int i=n-1;
     while( i>=0&& s.charAt(i)==' '){
         i--;
     }
     while ( i>=0 && s.charAt(i)!=' '){
         count ++;
         i--;
     }


     System.out.println(s.charAt(s.length()-1)+" "+count);
 }
}
