package DSA.Arrays;

public class Distribute_Money_to_Maximum_Children_2591 {
    public static void main(String[] args) {
        int doller = 16;
        int man = 2;
        int result[] = new int[man];
        int i = 0;
        while (doller != 0) {
            int mod = doller / man;
            if (result[i] != 8) {
                result[i] += mod;
                doller -= mod;
            }
                if (doller <= man && result[i] != 8) {
                    result[i]+= doller;
                    doller -= doller;
                }
                i = (i + 1) % man;
            }



        for (int v : result) {
            System.out.println(v);
        }

    }
}
