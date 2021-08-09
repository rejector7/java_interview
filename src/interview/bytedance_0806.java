package interview;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 给一个邻接矩阵，找出所有的多边形。
 *
 * 思路：
 * dfs，从每个起点，列举出所有的路径（不重复节点）。
 * 遍历所有的路径，判断路径是否首尾相连，并做去重处理。
 *
 * 列举路径:通过dfs，节点有路径中，路径外两种状态 1， 0
 */
public class bytedance_0806 {

    private List<String> getAllPoly(String[] vertexes, int[][] adj){
        int n = vertexes.length;
        HashMap<String, Integer> vertexIndex = new HashMap<>();
        for(int i = 0; i < n; i++){
            vertexIndex.put(vertexes[i], i);
        }
        int[] visited = new int[n];
        List<String> tempRes;
        List<String> res = new ArrayList<>();
        tempRes = DFS(vertexes, adj, visited);
        for(String s: tempRes){
            if(adj[vertexIndex.get(String.valueOf(s.charAt(0)))][vertexIndex.get(String.valueOf(s.charAt(s.length() - 1)))] == 1){
                res.add(s);
            }
        }
        return res;
    }

    // get all paths
    private List<String> DFS(String[] vertexes, int[][] adj, int[] visited){
        HashSet<String> res = new HashSet<>();
        for(int i = 0; i < visited.length; i++){
            res.addAll(DFSVisit(vertexes, adj, visited, i, vertexes[i]));
        }
        return new ArrayList<>(res);
    }

    private HashSet<String> DFSVisit(String[] vertexes, int[][] adj, int[] visited, int i, String cur){
        visited[i] = 1;
        HashSet<String> res = new HashSet<>();
        for(int j = 0; j < visited.length; j++){
            if(adj[i][j] == 1 && visited[j] == 0){ //遍历所有连边
                res.addAll(DFSVisit(vertexes, adj, visited, j, cur + vertexes[j]));
            }
        }
        visited[i] = 0;
        res.add(cur);
        return res;
    }

    public static void main(String[] args){

    }
}
