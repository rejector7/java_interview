package interview;

import java.util.*;

public class jd_0911 {

}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        String[] lines = new String[n];
        String target;

        String line;
        List<Integer> index = new ArrayList<>();
        HashMap<Character, List<Integer>> hMap = new HashMap<>();
        for(int i = 0; i < n; i++){
            line = sc.next();
            lines[i] = line;
            for(int j = 0; j < m; j++){
                index.clear();
                index.add(i);
                index.add(j);
                hMap.put(line.charAt(j), new ArrayList<>(index));
            }
        }
        target = sc.next();
        Character preChar = lines[0].charAt(0);
        Character curChar;
        int zSum = target.length();
        int xSum = 0;
        int ySum = 0;
        List<Integer> index1;
        List<Integer> index2;
        for(int i = 0; i < target.length(); i++){
            curChar = target.charAt(i);
            index1 = hMap.get(preChar);
            index2 = hMap.get(curChar);
            xSum += getListSum(index1,  index2);
            ySum += getTurnValue(index1, index2);

            System.out.println(hMap.get(preChar).get(0));
            System.out.println(hMap.get(preChar).get(1));
            System.out.println(hMap.get(curChar).get(0));
            System.out.println(hMap.get(curChar).get(1));
            preChar = curChar;
        }

        System.out.println(xSum);
        System.out.println(ySum);
        System.out.println(zSum);
        System.out.println(x*xSum + y*ySum + z*zSum);
    }

    private static int getListSum(List<Integer> list1, List<Integer> list2){
        return Math.abs(list1.get(0) - list2.get(0)) + Math.abs(list1.get(1) - list2.get(1));
    }

    private static int getTurnValue(List<Integer> list1, List<Integer> list2){
        if(list1.get(0).equals(list2.get(0)) || list1.get(1).equals(list2.get(1))){
            return 0;
        }else return 1;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        HashMap<Integer, List<Integer>> dependMap = new HashMap<>();
        HashMap<Integer, List<Integer>> dependedMap = new HashMap<>();
        List<Integer> dependList = new ArrayList<>();
        List<Integer> dependedList;
        int c;
        int serviceId;
        for(int i = 0; i < n; i++){
            dependList.clear();
            c = sc.nextInt();
            for(int j = 0; j < c; j++){
                serviceId = sc.nextInt();
                dependList.add(serviceId);
                dependedList = dependedMap.getOrDefault(serviceId, new ArrayList<>());
                dependedList.add(i + 1);
                dependedMap.put(serviceId, dependedList);
            }
            dependMap.put(i+1, new ArrayList<>(dependList));
        }
        boolean[] start= new boolean[n];
        int starting;
        for(int i = 0; i < q; i++){
            starting = sc.nextInt();
            serviceId = sc.nextInt();
            if(starting == 1){

            }
        }
    }
}