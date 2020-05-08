class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double slope,check;
        if(coordinates.length==2)
            return true;
        
        // if(coordinates[1][1]-coordinates[0][1]==0)
        //     slope=0;
        // else
            slope = (double)(coordinates[1][1]-coordinates[0][1])/(coordinates[1][0]-coordinates[0][0]);
        
        for(int i=2;i<coordinates.length;i++)
         {
        //      if(coordinates[i][1]-coordinates[i-1][1]==0)
        //          check=0;
            // else{
            check = (double)(coordinates[i][1]-coordinates[i-1][1])/(coordinates[i][0]-coordinates[i-1][0]);
            // }
            if(check!=slope)
                return false;
            
        }
        return true;
        
    }
}
