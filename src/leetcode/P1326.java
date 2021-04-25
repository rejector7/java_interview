package leetcode;

public class P1326 {
    class Solution {
        public int minTaps(int n, int[] ranges) {
            int min = 0;
            int max = 0;
            int open = 0;
            int index = 0;
            while(index < n){
                for(int i=index; i<=n; i++){
                    if(i-ranges[i] <= min&&i+ranges[i]>=max){
                        max = i + ranges[i];
                        index = i;
                    }
                }
                if(max >= n){
                    return open + 1;
                }
                if(min==max){
                    return -1;
                }
                open++;
                min = max;
            }
            return open;
        }
//        public int minTaps(int n, int[] ranges) {
//            int min = 0;
//            int max = 0;
//            int open = 0;
//            int index = 0;
//            while(max < n){
//                for(int i=index; i<=n; i++){
//                    if(i-ranges[i] <= min&&i+ranges[i]>=max){
//                        max = i + ranges[i];
//                        index = i;
//                    }
//                }
//                if(min==max){
//                    return -1;
//                }
//                open++;
//                min = max;
//            }
//            return open;
//        }
    }
}
