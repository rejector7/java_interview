package interview;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class huawei_0929_ran {

}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        String target = sc.next();
//        HashMap<String, List<String>> outDevices = new HashMap<>();
//        HashMap<String, String> inDevices = new HashMap<>();
//        String tempOut, tempIn, temp;
//        List<String> tempOutList;
//        for(int i = 0; i < N; i++){
//            temp = sc.next();
//            tempIn = sc.next();
//            tempOut = sc.next();
//            inDevices.put(temp, tempIn);
//            tempOutList = outDevices.getOrDefault(temp, new ArrayList<>());
//            tempOutList.add(tempOut);
//            outDevices.put(temp, new ArrayList<>(tempOutList));
//        }
//        int preLength = 0;
//        String cur = target;
//        while(!inDevices.get(cur).equals("null")){
//            preLength += 1;
//            cur = inDevices.get(cur);
//        }
//        int followedLength;
//        cur = target;
//        followedLength = getMaxFollowedLength(cur, outDevices);
//        System.out.println(preLength + followedLength);
//    }
//    private static int getMaxFollowedLength(String cur, HashMap<String, List<String>> outDevices){
//        if(cur.equals("null")) return 0;
//        int maxLength = 1;
//        while(outDevices.get(cur).size() == 1){
//            if(outDevices.get(cur).get(0).equals("null")) return maxLength;
//            else{
//                cur = outDevices.get(cur).get(0);
//                maxLength += 1;
//            }
//        }
//        int branchMax = 0;
//        for(String outDevice: outDevices.get(cur)){
//             branchMax = Math.max(branchMax, getMaxFollowedLength(outDevice, outDevices));
//        }
//        return branchMax + maxLength;
//    }
//
//}
//
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        long CONSTMAX = 1000000007;
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] nums = new int[N];
//        for(int i = 0; i < N; i++){
//            nums[i] = sc.nextInt();
//        }
//        int min, max;
//        long sum = 0;
//        int tempWidth;
//        for(int i = 0; i < N- 1; i++){
//            min = max = nums[i];
//            tempWidth = 2;
//            for(int j = i + 1; j < N; j++){
//                min = Math.min(min, nums[j]);
//                max = Math.max(max, nums[j]);
//                sum += (long) (max - min) * (tempWidth);
//                tempWidth += 1;
//            }
//            if(sum > CONSTMAX) sum -= CONSTMAX;
//        }
//        System.out.println(sum % CONSTMAX);
//    }
//}
//
//import java.util.Scanner
//public class Main{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String rawStr = sc.next();
//        String[] strArray = rawStr.split(":");
//        for(String s:strArray){
//            if(s.length() != 4){
//                System.out.println("error");
//                return;
//            }
//        }
//        String s;
//        for(int i = 0; i < strArray.length; i++){
//            s = strArray[i];
//            if(!s.equals("0000")){
//                if(s.charAt(0) =='0'){
//                    s = s.substring(1);
//                    strArray[i] = s;
//                }
//            }
//        }
//
//    }
//}