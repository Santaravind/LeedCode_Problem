package DSA.String;

public class Detect_Capital_530 {
    public static String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder();
        String word[]=title.split(" ");
        for(String str: word){
            str=str.toLowerCase();
            if(str.length()>2){
                char ch[]=str.toCharArray();
              ch[0]= Character.toUpperCase(ch[0]);
                str=String.valueOf(ch);

            }
            sb.append(str);
            sb.append(" ");
        }
        return String.valueOf(sb).trim();
    }
    public static boolean detectCapitalUse(String word) {
        boolean isFirst=false;
        int n=0,m=0;
        isFirst=word.charAt(0)>='A'&&word.charAt(0)<='Z'?true:false;
        for(char ch:word.toCharArray()){
            Character.toUpperCase(ch);
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
//        System.out.println(detectCapitalUse(str));
        String title = "capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));

    }
}
