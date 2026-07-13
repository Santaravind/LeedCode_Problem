package DSA.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock_121 {
    public static void main(String args[]){
//        int price[]={7,1,5,3,6,4};
        int price[]={7,6,4,3,1};
//        int price[]={1,2};
        int result=maxProfit(price);

        System.out.println("Profit "+result);
    }
    public  static int maxProfit(int price[]){
//first try pass 201/212
//        int ans=0;
//        int x=0;
//        while (x<price.length-1){
//            for (int i=x+1; i<price.length; i++){
//                if (price[i]>price[x]){
//
//                    ans=Math.max(ans,(price[i]-price[x]));
//                }
//            }
//            x++;
//        }
//
//        return  ans;
//        sencond try
//        int ans=0;
//        int start=0;
//        int end=price.length-1;
//        while (start<end){
//            for (int i=end; i>start; i--) {
//                if (price[i] > price[start]) {
//                    ans = Math.max(ans, (price[i] - price[start]));
//
//                }
//            }
//            start++;
//
//        }
//        return ans;

//        thirt chance

     int ans=0;
     int min=price[0];
     for (int i=1; i<price.length; i++){
         if (price[i]<min){
             min=price[i];
         }else {
             ans=Math.max(ans,(price[i]-min));
         }
     }

     return ans;
    }
}
