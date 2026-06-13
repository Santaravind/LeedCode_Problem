package DSA.Arrays;

public class Weighted_Word_Mapping_3838 {
    public static String mapWordWeights(String[] words, int[] weights) {

        StringBuilder sb=new StringBuilder();
        for (String s:words){
            String st=s;
            int i=0;
            int c=0;
            while(i<st.length()){
                int m=st.charAt(i)-'a';
                 c = c+weights[m];
                 i++;
            }
            int rem=c%26;
           char ch= (char) (122-rem);
           sb.append(String.valueOf(ch));

        }

        return sb.toString();
//        return  " ";
    }
    public static void main(String[] args) {
//        Input: words = ["abcd","def","xyz"],
//        weights = [5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2]
//
//        Output: "rij"
//         ["a","b","c"], weights = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]

//        String words[] = {"abcd","def","xyz"};
        String words[] = {"a","b","c"};
        int  weights[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        System.out.println(mapWordWeights(words,weights));
//         int rem=9;
//         char ch= (char) (122-rem);
//        System.out.println(ch);

    }
}
