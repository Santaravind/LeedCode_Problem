package DSA.Arrays;

public class Jump_Game_55 {
      public static boolean JumpGame(int nums[]){
          int n=nums.length-1;

//          if(nums[0]==1&&nums.length==1){
//              return true;
//          }
//
//          for (int i=0; i<nums.length; i++){
//              if ((nums[i]+i>=n)){
//                  return true;
//
//              }
//          }
//
//          return  false;

          for (int i=nums.length-2; i>=0; i--){
              if(i+nums[i]>=n){
                  n=i;
              }
          }
         return n==0;
      }

    public static void main(String agrs[]){
//        int nums[]={2,3,1,1,4};
//        int nums[]={3,2,1,0,4};
int nums[]={1,2,3};

        System.out.println(JumpGame(nums));

    }
}
