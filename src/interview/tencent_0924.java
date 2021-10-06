package interview;


import java.sql.Time;
import java.util.Timer;

public class tencent_0924 {
    private static int getRandom(int[] nums){
        int res = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            count += 1;
            res = Math.random() > 1.0/count ? res : nums[i];
        }
        return res;
    }


//    public static void main(String[] args){
//        Timer timer = new Timer();
//        timer.schedule();
//    }
}

