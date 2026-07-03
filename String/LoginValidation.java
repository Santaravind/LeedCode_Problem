package DSA.String;

public class LoginValidation {
    public static void main(String[] args) {
        String userName="Arvind_?saint ";

        if (userName.length()<8||userName.length()>30) System.out.println("Invalid");

//        if (userName.charAt(0)>='0'&&userName.charAt(0)<='9') System.out.println("Invalid");
        if (userName.charAt(0)>='0'&&userName.charAt(0)<='9'){
            System.out.println("Invalid");
            return;
        }
        int j=0;
        for (int i=0; i<userName.length(); i++){
            if ((userName.charAt(i)>='a'||userName.charAt(i)<='z')||(userName.charAt(i)>='A'||userName.charAt(i)<='Z')||(userName.charAt(i)>='0'||userName.charAt(i)<='9')||userName.charAt(i)=='_'){
                j++;

            }
        }
        if (j==userName.length()-1) System.out.println("Valid");
        else System.out.println("Invalid");
        //System.out.println("Valid");
    }
}
