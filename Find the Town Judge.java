class Solution {
    public int findJudge(int N, int[][] trust) {
        int n=trust.length;
        int a[]=new int[N];
        
        for(int i=0;i<n;i++)
        {
            a[trust[i][1]-1]++;
            a[trust[i][0]-1]--;
        }
         for(int i=0;i<N;i++){
             if(a[i]==N-1)
                 return i+1;
         }
            return -1;
    }
}
