// Last updated: 11/20/2025, 3:15:27 PM
class Solution {
    public int minimumArea(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int x_min=n;
        int x=-1;
        int y_min=m;
        int y=-1;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    x_min=Math.min(x_min,i);
                    x=Math.max(x,i);
                    y_min=Math.min(y_min,j);
                    y=Math.max(y,j);
                }
            }
        }
        if (x == -1) return 0;
        return (x-x_min+1)*(y-y_min+1);
    }
}