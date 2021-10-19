package interview;

import java.util.*;

public class meituan_1017_ran {

}

//Problem02
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//
//    }
//}
//
////Problem3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int[][] nodesEdges =  new int[T][2];
//        int n, m;
//        String line;
//        HashMap<Integer, List<Integer>> edges = new HashMap<>();
//        int[][] edgesNums;
//        for(int i = 0; i < T; ++i){
//            n = sc.nextInt();
//            m = sc.nextInt();
//            sc.nextLine();
//            line = sc.nextLine();
//            edges = getEdges(line);
//            boolean b = checkTree(edges, n);
//            if(b) System.out.println("Yes");
//            else System.out.println("No");
//        }
//    }
//
//    private static HashMap<Integer, List<Integer>> getEdges(String line){
//
//        String[] edgeTuples = line.substring(1, line.length() - 1).split("] \\[");
//        String temp;
//        String[] nodes;
//        HashMap<Integer, List<Integer>> edges = new HashMap<>();
//        List<Integer> edgeEnds = new ArrayList<>();
//        for(String edge: edgeTuples){
//            temp = edge.substring(0);
//            nodes = temp.split(", ");
//            edgeEnds.clear();
//            edgeEnds = edges.getOrDefault(Integer.valueOf(nodes[0]), new ArrayList<>());
//            edgeEnds.add(Integer.valueOf(nodes[1]));
//            edges.put(Integer.valueOf(nodes[0]), new ArrayList<>(edgeEnds));
//        }
//
//        return edges;
//    }
//
//    private static boolean checkTree(HashMap<Integer, List<Integer>> edges, int n){
//        HashSet<Integer> connected = new HashSet<>();
//        Stack<Integer> visited = new Stack<>();
//        visited.add(1);
//        connected.add(1);
//        while(!visited.empty()){
//            List<Integer> nodes = edges.get(visited.pop());
//            if(nodes != null){
//                for(int a: nodes){
//                    if(connected.contains(a)) return false;
//                    connected.add(a);
//                    visited.add(a);
//                }
//            }
//        }
//        for(int i = 0; i < n; i++){
//            if(!connected.contains(i + 1)) return false;
//        }
//        return true;
//    }
//}

//Problem04
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int a, m, y;
//        for(int i = 0; i < T; i++){
//            a = sc.nextInt();
//            m = sc.nextInt();
//            y = sc.nextInt();
//            System.out.println(getMin(a, m, y));
//        }
//    }
//
//    private static int getMin(int a, int m, int y){
//        int mul = 1;
//        int i = 0;
//        if(1 % m == y) return 0;
//        while(i++ < m + 1){
//            mul *= a;
//            if(mul % m == y) return i;
//            mul = mul % m;
//        }
//        return -1;
//    }
//}