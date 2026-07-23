package DSA.String;

public class Compare_Version_Numbers_165 {
    public static int compareVersion(String version1, String version2) {

        String [] st=version1.split("\\.");
        String [] st2=version2.split("\\.");

        int i=0;
        int j=0;
        int result=0;

        while(i<st.length||j<st2.length){
            int v1=0;
            int v2=0;
            if(i<st.length){
                v1=Integer.parseInt(st[i]);
                i++;
            }
            if(j<st2.length){
                v2=Integer.parseInt(st2[j]);
                j++;
            }
            if(v1<v2){
                result=-1;
                break;
            }else if(v1>v2){
                result=1;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {

         String v="2.5.1";
         String v2="2.5.3";

        System.out.println(compareVersion(v,v2));

    }
}
