class Solution {
    public int findComplement(int num) {
        int i=0,result=0;
        while(num>0)
        {
            if(num%2==0)
                result += Math.pow(2,i);
                i++;
            num=num/2;
        }
        return result;
        
    }
}
