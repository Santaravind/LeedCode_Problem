package DSA;

public class Marge_Intervals_56 {
    public static void main(String args[]){
        int nums[][]={{1,3},
                     {2,6},
                     {8,10},
                    {15,18}};
                int row=nums.length;
                int cols=nums[0].length;
                int marge[][]=new int[row][cols];
                int pre=nums[0][0];
              for (int i=0; i<row; i++){
                  for (int j=0; j<cols-1; j++){
                      if (pre<=nums[i][j]) {
                          pre=nums[i][j];
                          marge[i][j] = nums[i][j];
                      }

                  }
              }
//
//        if(intervals.length<=1){
//            return intervals;
//        }
//
//        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
//
//        List <int []>result=new ArrayList<>();
//        int [] newInterval=intervals[0];
//        result.add(newInterval);
//
//        for(int[] interval:intervals){
//            if(interval[0]<=newInterval[1]){
//                newInterval[1]=Math.max(newInterval[1],interval[1]);
//            }else{
//                newInterval=interval;
//                result.add(newInterval);
//            }
//        }
//
//        return result.toArray(new int [result.size()][]);



    }
}
