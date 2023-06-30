class Solution {
    public int equalPairs(int[][] grid) {
        int count = 0;
        boolean equal;
        
        for (int i = 0; i < grid.length; i++) {
            for( int j=0; j < grid.length; j++){
                equal = true;

                for(int k=0; k<grid.length; k++){
                    if(grid[i][k] != grid[k][j]){
                        equal = false;
                        break;
                    }
                }

                count += equal ? 1 : 0;
            }
        }

        return count;
    }
}