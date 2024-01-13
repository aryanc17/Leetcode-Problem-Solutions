class Solution {
    public int minSteps(String s, String t) {
        int count[] = new int[26];
        int res = 0;
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i : count){
            if(i > 0)
                res += i;
        }
        return res;
    }
}