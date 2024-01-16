import java.util.*;

class RandomizedSet {
    Set<Integer> s;
    public RandomizedSet() {
        s = new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(s.contains(val)) return false;

        else{
            s.add(val);
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!s.contains(val)){
            return false;
        }
        else{
            s.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(s);
        int ran = (int)(Math.random()*s.size());

        return list.get(ran);
    }
}
