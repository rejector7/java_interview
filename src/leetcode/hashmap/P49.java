package leetcode.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P49 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String, List<String>> hashMap= new HashMap<>();
            String key;
            for(String s: strs){
                char[] charArray = s.toCharArray();
                Arrays.sort(charArray);
                key = String.valueOf(charArray);
                List<String> list = hashMap.getOrDefault(key, new ArrayList<>());
                list.add(s);
                hashMap.put(key, list);
            }
            return new ArrayList<List<String>>(hashMap.values());
        }
    }
}
