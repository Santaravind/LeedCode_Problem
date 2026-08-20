package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Distribute_Elements_Into_Two_Arrays_I_3069 {
    public static void main(String[] args) {
        int nums[] = {2,1,3};
//        int nums[] = {5, 4, 3, 8};
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {

                if (arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                    arr1.add(nums[i]);
                }else {
                    arr2.add(nums[i]);
                }

        }
        result.addAll(arr1);
        result.addAll(arr2);
//        result.stream().mapToInt(Integer::intValue).toArray();
        Integer newArr[]= (Integer[]) result.toArray();

        System.out.println(result);
    }
}
