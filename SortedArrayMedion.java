package DSA;

import java.util.Arrays;

public class SortedArrayMedion {
    public static void main(String args[]){
        int nums1[]={1,2};
        int nums2[]={3};
        int n=nums1.length;
        int m=nums2.length;
        int k=m+n;
        int  i=0;
        int na[]=new int[k];
        while(i<n){
            na[i]=nums1[i];
            i++;

        }
        int j=0;
        while(i<(n+m)){
            na[i]=nums2[j];
            i++;
            j++;
        }
        Arrays.sort(na);
        int c=na.length;
        System.out.println(c);
        double medion;
        if(c%2==0){
            medion=(double)(na[(c/2)-1]+na[(c/2)-1+1])/2;
        }else{
            medion=na[((c+1)/2)-1];
        }

        System.out.println(medion);
    }
}
