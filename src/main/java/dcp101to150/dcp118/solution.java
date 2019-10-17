package dcp101to150.dcp118;

import java.util.Collections;
import java.util.List;

public class solution {
    public static List<Integer> sqrtAndSort(List<Integer> nums){
        for(int i= 0 ; i < nums.size() ; i++)
            nums.set(i,nums.get(i) * nums.get(i));
        Collections.sort(nums);
        return nums ;
    }
}
