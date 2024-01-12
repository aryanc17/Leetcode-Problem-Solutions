class Solution {
    public boolean halvesAreAlike(String s) {
        int cntA = 0;
        int cntB = 0;
        int j=0;

        for(int i=0; i<(s.length()/2); i++){
            char ch = s.charAt(i);
            j++;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) cntA++;
        }

        for(int i = j; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) cntB++;
        }

        if(cntA == cntB) return true;

        return false;


        
    }
}