package DSA.String;

public class Count_the_Number_of_Special_Characters_II_3121 {
    public static void main(String args[]){
//        this code passonly 428/800 test cases
//        String S="BCaabc";
        String S="AbBCab";
         char ch[]=S.toCharArray();
         int count=0;
         int i=0;
         while(i<ch.length){

             if (i>0&&ch[i]==ch[i-1]){
                 i++;
                 continue;
             }

             if (Character.isLowerCase(ch[i])){
                 char c=Character.toUpperCase(ch[i]);
                 for (int j=i+1; j<ch.length; j++){
                     if (c==ch[j]){
                         count++;
                     }

                 }
             }else if(Character.isUpperCase(ch[0])){
                 break;
             }



             i++;
         }

        System.out.println(count);



    }
}
