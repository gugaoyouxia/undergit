package DemoDemo;


import com.sun.source.tree.BreakTree;

import java.util.*;

public class DemoDemo {
    public static void main(String[] args) {
        int[] digits = {1,4,3,6,4,9,1};
        enum Cases {
            CARRY, NOCARRY, NORMAL;
        }
        Cases cases = Cases.NORMAL;
        int pointer = digits.length - 1;
        while(digits[pointer] == 9){
            if(pointer == 0){
                cases = Cases.CARRY;
                digits[pointer] = 0;
            }
            else{
                cases = Cases.NOCARRY;
                digits[pointer] = 0;
                pointer--;
            }
        }
        if(cases == Cases.NOCARRY){
            digits[pointer] ++;
        }
        if(cases == Cases.NORMAL){
            digits[digits.length-1] ++;
        }
        int [] ret;
        if(cases == Cases.CARRY){
            ret = new int[digits.length + 1];
            ret[0] = 1;
            for(int i = 1; i < digits.length + 1; i++){
                ret[i] = 0;
            }
        }
        else{
            ret = new int[digits.length];
            for(int i = 0; i < digits.length; i++) {
                ret[i] = digits[i];
            }
        }
        System.out.println(Arrays.toString(ret));
//code ends here
    }


}
