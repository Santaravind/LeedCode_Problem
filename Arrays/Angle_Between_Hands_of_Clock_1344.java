package DSA.Arrays;
// Angle=|(30*hours)-(5.5*minutes)|;
public class Angle_Between_Hands_of_Clock_1344 {
    public static void main(String[] args) {
        int hour=3, minuts=15;

        double angle=0;

         angle=Math.abs((30*hour)-(5.5*minuts));
        System.out.println(angle);

        double smallest=Math.min(angle ,360-angle);
        System.out.println(smallest);
    }
}
