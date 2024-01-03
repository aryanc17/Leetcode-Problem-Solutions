class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0;
        int ans = 0;

        for(int i=0; i<bank.length; i++){
            int curr = countDevices(bank[i]);
            if(curr > 0){
                ans += curr * prev; 
                prev = curr;
            }
        }
        return ans;
    }

    int countDevices(String s){
        int cnt = 0;

        for(char c : s.toCharArray()){
            if(c == '1') cnt++;
        }
        return cnt;
    }
}
