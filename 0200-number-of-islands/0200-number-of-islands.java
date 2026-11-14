class Solution {
    private int n;
    private int c;
    public int numIslands(char[][] grid) {
        n =grid.length;
        c =grid[0].length;

        int count=0;

        if(n==0) return 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    dfsboolean(grid,i,j);
                    ++count;
                }
            }
        }
        return count;
    }

    private void dfsboolean(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=n || j>=c || grid[i][j]!='1') return;

        grid[i][j]='0';
        dfsboolean(grid,i+1,j);
        dfsboolean(grid,i-1,j);
        dfsboolean(grid,i,j+1);
        dfsboolean(grid,i,j-1);

    }
}