package DSA.String;

public class Maximum_Length_Substring_With_Two_Occurrences_3090 {
    public static void main(String arg[]){
//        String st="bcbbbcba";
        String st="aaaa";
        int fre[]=new int[26];
        int count=0;
        int max=0;
        int i=0,j=0;
        while (j<st.length()){
               char c=st.charAt(j);
               if(fre[c-'a']>=2){
                   char ch=st.charAt(i);
                   if(fre[ch-'a']>0)fre[ch-'a']--;
                   i++;
                   count--;
                   continue;
               }
               fre[c-'a']++;
               j++;
               count++;
//            System.out.println(count);
               max=Math.max(max,count);

        }
        System.out.println(max);
    }
}
