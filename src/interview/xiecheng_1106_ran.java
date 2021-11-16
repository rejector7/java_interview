package interview;

import java.sql.Array;
import java.util.*;

public class xiecheng_1106_ran {
}


//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int x, y;
//        HashMap<Integer, List<Integer>> conflicts = new HashMap<>();
//        List<Integer> members;
//        for(int i =0; i < m; i++){
//            x = sc.nextInt();
//            y = sc.nextInt();
//            members = conflicts.getOrDefault(x, new ArrayList<>());
//            members.add(y);
//            conflicts.put(x, new ArrayList<>(members));
//            members = conflicts.getOrDefault(y, new ArrayList<>());
//            members.add(x);
//            conflicts.put(y, new ArrayList<>(members));
//        }
//        int[] memberGroupId = new int[n + 1];
//        int groupNum = 0;
//        List<Integer> conflictMembers;
//        List<Integer> conflictGroups = new ArrayList<>();
//        for(int i = 1; i <= n; i++){
//            if(memberGroupId[i] != 0){
//                continue;
//            } else{
//                conflictMembers = conflicts.get(i);
//                conflictGroups.clear();
//                for(int member: conflictMembers){
//                    conflictGroups.add(memberGroupId[member]);
//                }
//                boolean b = false;
//                for(int j = 1; j <= groupNum; j++){
//                    if(conflictGroups.contains(j)){
//                        continue;
//                    }else {
//                        memberGroupId[i] = j;
//                        b = true;
//                    }
//                }
//                if(!b){
//                    groupNum += 1;
//                    memberGroupId[i] = groupNum;
//                }
//            }
//        }
//        System.out.println(groupNum);
//    }
//}
//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        HashMap<Integer, List<Integer>> edges = new HashMap<>();
//        int p;
//        List<Integer> nodes;
//        for(int i = 2; i <= n; i++){
//            p = sc.nextInt();
//            nodes = edges.getOrDefault(p, new ArrayList<Integer>());
//            nodes.add(i);
//            edges.put(p, new ArrayList<>(nodes));
//        }
//        HashMap<Integer, Integer> treeHeight = new HashMap<>();
//        getLongest(1, edges, treeHeight);
//        int result = 0;
//        List<Integer> childList = new ArrayList<>();
//        int childLen;
//        for(int i = 1; i <= n; i++){
//            if(!edges.containsKey(i)) continue;
//            if(edges.get(i).size() < 2){
//                result = Math.max(result, treeHeight.get(i) + 1);
//            } else{
//                childList.clear();
//                for( int child : edges.get(i)){
//                    childList.add(treeHeight.get(child));
//                }
//                Collections.sort(childList);
//                childLen = childList.size();
//                result = Math.max(result, childList.get(childLen - 1) + childList.get(childLen - 2) + 3);
//            }
//        }
//        System.out.println(result);
//    }
//    private static void getLongest(int index, HashMap<Integer, List<Integer>> edges, HashMap<Integer, Integer> treeHeight){
//        if(!edges.containsKey(index)) {
//            treeHeight.put(index, 0);
//        } else{
//            int childMax = 0;
//            for(int child : edges.get(index)){
//                getLongest(child, edges, treeHeight);
//                childMax = Math.max(childMax, treeHeight.get(child));
//            }
//            treeHeight.put(index, childMax + 1);
//        }
//    }
//}