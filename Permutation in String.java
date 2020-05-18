class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()) return false;
        
        int m = s1.length();
        int n = s2.length();
        int[] cnt_arr = new int[26];
        for(int i = 0; i < m; i++){
            cnt_arr[s1.charAt(i) - 'a']--;
            cnt_arr[s2.charAt(i) - 'a']++;
        }
        
        for(int i = m; i < n; i++){
            if(areAllZeroes(cnt_arr)){
                return true;
            }
            cnt_arr[s2.charAt(i) - 'a']++;
            cnt_arr[s2.charAt(i - m) - 'a']--;
        }
        
        if(areAllZeroes(cnt_arr)){
            return true;
        }
        
        return false;
    }
    
    boolean areAllZeroes(int[] cnt_arr){
        for(int i = 0; i < 26; i++){
            if(cnt_arr[i] != 0) return false;
        }
        return true;
    }
}
