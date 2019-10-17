package dcp101to150.dcp118;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class solutionTest {

    @Test
    public void testSqrtAndSort() {
        List<Integer> nums = new ArrayList<>() ;
        nums.add(-9) ;
        nums.add(-2) ;
        nums.add(0) ;
        nums.add(2) ;
        nums.add(3) ;
        print(solution.sqrtAndSort(nums));
    }

    private void print(List<Integer> list) {
        for(Integer i : list)
            System.out.print(i + " ") ;
        System.out.println() ;
    }
}