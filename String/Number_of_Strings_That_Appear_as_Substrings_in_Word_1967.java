package DSA.String;

public class Number_of_Strings_That_Appear_as_Substrings_in_Word_1967 {
    public static int numOfStrings(String[] patterns, String word) {

        String w=word;
 
        int count=0;
        for (String v :patterns){
            if (word.contains(v)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       String patterns[] = {"a","abc","bc","d"};
           String word = "abc";

        System.out.println(numOfStrings(patterns,word));
    }
}
