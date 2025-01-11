class Solution {
    public int maxAreaOfIsland(int[][] grid) {
       if(grid.length==0){
        return 0;
       }
        
       int max=0;
       int n=grid.length;
       int m=grid[0].length;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(grid[i][j]==1){
                max=Math.max(max,land(grid,i,j));
                
            }
        }
       }
       return max;
    }
    public  int land(int[][] grid,int i,int j){
        int n=grid.length;
        int m=grid[0].length;
       if(i<0||j<0||i>=n||j>=m||grid[i][j]!=1){
         return 0;
       }
       grid[i][j]=0;
       return 1+land(grid,i-1,j)+
       land(grid,i+1,j)+
       land(grid,i,j+1)+
       land(grid,i,j-1);
       
    }
}