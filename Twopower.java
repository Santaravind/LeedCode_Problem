package DSA;

import static java.lang.Integer.parseInt;

public class Twopower {
    public static void main(String args[]){

        int num[]={2,4,5,6,7,4,3,8,1024,1632,89,65,80};
          int count=0;

          for (int i=0; i<num.length;i++){

//              int j=0;
//
//               while (j<num.length) {
//                  int n=(int)Math.pow(2,i+1) ;
//                  if (num[j]==n) {
//                      System.out.print(num[j]+" ");
//                  }
//                   j++;
//
//               }

              int n=num[i];
              if ((n&(n-1))==0){
                  System.out.print(n+" ");
                  count ++;

              }

          }
        System.out.println("total number of 2 multipales "+count);

    }
}
