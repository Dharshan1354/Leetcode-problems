class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        for(int row = 1; row < numRows; row++){
            List<Integer> previousrow = result.get(row-1);
            List<Integer> currentrow = new ArrayList<>();
            currentrow.add(1);

            for(int i=1; i<row; i++){
                currentrow.add(previousrow.get(i-1) + previousrow.get(i));
            }

            if(row > 0)
                currentrow.add(1);
            result.add(currentrow);
        }
    return result;   
    }
}