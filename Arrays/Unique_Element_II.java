package DSA.Arrays;


/*this code work only when two number is appear in exactly ones
 and others appear twice in the array
 */
public class Unique_Element_II {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,3};

        long xor_all = 0;
        for (int num : arr) {
            xor_all ^= num;
        }

        long mask = xor_all & -xor_all;

        int first_unique = 0;
        int second_unique = 0;

        for (int num : arr) {
            if ((num & mask) != 0) {
                first_unique ^= num;
            } else {
                second_unique ^= num;
            }
        }

        System.out.println("First Unique: " + first_unique);
        System.out.println("Second Unique: " + second_unique);
    }
}