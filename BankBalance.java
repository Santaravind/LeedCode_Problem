package DSA;

public class BankBalance {
    public  static  void main(String args[]){
        int arr[][]={ {2,2,4},
                {4,6,2},
                {4,5,3}};

        int i=arr.length;
        int sum[]=new int[i];
        for (int j=0; j<arr.length; j++){
               for (int k=0; k<arr[0].length; k++){
                   sum[j]+=arr[j][k];
               }
        }
        int u= sum[0];
        int index=0;
        int count=0;
        System.out.println(sum.length);
        for (int k=0; k<sum.length; k++){
                 if (u<sum[k]){
                     u=sum[k];
                     index =k;
                     count=k;
                 }
                 if(u==sum[k]){
                     u=sum[k];
                     index=k;

                 }
        }
        System.out.println(index+" "+count+" "+u);

    }
}
