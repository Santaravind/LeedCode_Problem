package DSA;

import java.util.Arrays;
//503 :leadcode
public class FindTheNextGrater {
    public static void main(String args[]){
//        int num[]={1,2,1};
//        int num[]={1,2,3,4,3};
//        int num[]={1,5,9,8,7,2,6};
        int num[]={1,5,3,6,8};
//        int num[]={1,9,10,7,8,1};
          int length = num.length;
        int num2[]=new int[length];

//        Arrays.sort(num);
        int j=0;
        while(j<num.length){
            int n=num[j];

                for (int i=j%length; i<num.length*2; i++){
                    num2[j]=-1;

                    if ((num[i%length]>n)){
                        num2[j]=num[i%length];
                        break;
                    }
                }


            j++;
        }
        for (int x:num2){
            System.out.print(x+" ");
        }
//        int n=nums.length;
//        int num[]=new int[n];
//        Arrays.fill(num,-1);
//        Stack<Integer> s=new Stack();
//        for(int i=0; i<n*2; i++){
//            while(!s.isEmpty()&&nums[s.peek()]<nums[i%n]){
//                num[s.pop()]=nums[i%n];
//            }
//            if(i<n)s.push(i);
//        }
//        return num;
    }
}
