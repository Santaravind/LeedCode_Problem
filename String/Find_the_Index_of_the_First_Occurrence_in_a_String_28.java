package DSA.String;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {
    public static void main(String args[]){
        String s1="sdsadbutsad";
        String s2="sad";
//        System.out.println(s2.length());
//        int i=0,j=0,count=0,last;


        int n=s1.length();
        int m=s2.length();
        int j=0;
        for (int i=0; i<n-m; i++){
            j=0;
            while(j<m&&s1.charAt(i+j)==s2.charAt(j)){
                j++;
            }
            if(j==m){
                System.out.println(i);
            }
        }


    }
}
