class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList<>();
        int rowstart = 0, rowend = matrix.length-1;
        int colstart = 0, colend = matrix[0].length-1;
        while(rowstart <= rowend && colstart <= colend){
            //left to right
            for(int i=colstart; i<=colend; i++)
                list.add(matrix[rowstart][i]);
            rowstart++;

            //up to down
            for(int i=rowstart; i<=rowend; i++)
                list.add(matrix[i][colend]);
            colend--;

            //right to left
            if (rowstart <= rowend) {
            for(int i=colend; i>=colstart; i--)
                list.add(matrix[rowend][i]);
            rowend--;
            }

            //bottom to up
            if (colstart <= colend) {
            for(int i=rowend; i>=rowstart; i--)
                list.add(matrix[i][colstart]);
            colstart++;
            }
        }
        return list;
    }
}
