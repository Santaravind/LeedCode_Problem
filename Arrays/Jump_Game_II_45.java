package DSA.Arrays;

public class Jump_Game_II_45 {
    public static int JumpGame(int nums[]){
        int n=nums.length-1;
  int count=0;
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

        int totaljump=0;

//        int n=nums.length-1;
        int coverage=0, lastjump=0;

        if(nums.length==1)return 0;

        for(int i=0; i<nums.length; i++){
            coverage=Math.max(coverage, i+nums[i]);

            if(i==lastjump){
                lastjump=coverage;
                totaljump++;

                if(coverage>=n){
                    return totaljump;
                }
            }
        }
        return totaljump;

    }

    public static void main(String agrs[]){
        int nums[]={2,3,1,1,4};
//        int nums[]={2,3,0,1,4};
//        int nums[]={1,2,3};

        System.out.println(JumpGame(nums));

    }
}
