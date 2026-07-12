package DSA.String;

public class Strong_Password_Checker_II_2299 {
//    A password is said to be strong if it satisfies all the following criteria:
//
//    It has at least 8 characters.
//    It contains at least one lowercase letter.
//    It contains at least one uppercase letter.
//    It contains at least one digit.
//    It contains at least one special character. The special characters
//    are the characters in the following string: "!@#$%^&*()-+".
//    It does not contain 2 of the same character in adjacent positions
//    (i.e., "aab" violates this condition, but "aba" does not).
//    Given a string password, return true if it is a strong password.
//    Otherwise, return false.


    public static void main(String[] args) {
//     String   password = "IloveLe3tcode!";
     String   password = "IMe+You--IsMyDream";
     String specialChars="!@#$%^&*()-+";
     String digit="0123456789";
     if (password.length()<8) System.out.println(false);

     boolean found = false;
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                found = true;
                break;
            }
        }
        boolean isDigit = false;
        for (char c : password.toCharArray()) {
            if (digit.indexOf(c) != -1) {
                isDigit = true;
                break;
            }
        }
        boolean isAdjecent=true;
        for (int i=0;i<password.length()-1; i++){
            if (password.charAt(i)==password.charAt(i+1))
                isAdjecent=false;
        }

        boolean hasUpper = password.chars().anyMatch(Character::isUpperCase);
        boolean hasLower = password.chars().anyMatch(Character::isLowerCase);

        if (found&&isAdjecent&&isDigit&&hasLower&&hasUpper){
            System.out.println(true);
        }else System.out.println(false);
    }
}
