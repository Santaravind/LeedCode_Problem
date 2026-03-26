package DSA;
//Polindormic Means same as forword and backword read the same
//example:-  sas saas Racecar;
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//        Example 2:
//
//Input: s = "cbbd"
//Output: "bb"
public class LargestPolindromincSubString5 {
    public static  void main(String args[]){
        String st="babac";
//        String st="bb";
        if(st.length()<=1) System.out.println(st);

        String lps="";
        for(int i=1; i<st.length(); i++){
            int low=i;
            int high=i;
            while(low>=0 && high<st.length() && st.charAt(low)==st.charAt(high)){
                low--;
                high++;

            }
            String pol=st.substring(low+1,high);
            if(pol.length()>lps.length()){
                lps=pol;
            }

            low=i-1;
            high=i;
            while(low>=0 && high<st.length() &&st.charAt(low)==st.charAt(high)){
                low--;
                high++;

            }
            String poli=st.substring(low+1,high);
            if(poli.length()>lps.length()){
                lps=poli;
            }


        }

        System.out.println(lps);


    }
}
