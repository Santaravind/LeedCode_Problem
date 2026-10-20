package DSA.String;

public class Detect_Capital_530 {
    public static boolean detectCapitalUse(String word) {
        boolean isFirst=false;
        int n=0,m=0;
        isFirst=word.charAt(0)>='A'&&word.charAt(0)<='Z'?true:false;
        for(char ch:word.toCharArray()){
            if(ch>='A'&&ch<='Z'){
                n++;
            }
            if (ch>='a'&&ch<='z'){
                m++;
            }
        }
        if (isFirst==true&&n==1||n==word.length()){
            return true;
        } else if (m==word.length()) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
//        String str="USA";
        String str="Leedcode";
//        String str="LeeDCode";
        System.out.println(detectCapitalUse(str));

    }
}
