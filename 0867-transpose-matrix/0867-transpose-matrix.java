class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length,i,j;
    
        int t[][]=new int[c][r];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                t[i][j]=matrix[j][i];
            }
        }
        return t;
    }
}