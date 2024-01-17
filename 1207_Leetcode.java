import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int e : map.values()){
            set.add(e);
        }    

        return map.size() == set.size();
    }
}