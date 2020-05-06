class Solution {
    public int majorityElement(int[] nums) {
        
        int maj_index = 0, count = 1; 
        int i; 
        int size=nums.length;
        for (i = 1; i < size; i++)  
        { 
            if (nums[maj_index] == nums[i]) 
                count++; 
            else
                count--; 
            if (count == 0) 
            { 
                maj_index = i; 
                count = 1; 
            } 
        } 
        return nums[maj_index]; 
    }
}
