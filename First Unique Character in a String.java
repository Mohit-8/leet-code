class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int ar[]=new int[26];
        for(int i=0;i<n;i++)
        {
            ar[s.charAt(i)-'a']+=1;
        }
        for(int i=0;i<n;i++)
        {
            if(ar[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
