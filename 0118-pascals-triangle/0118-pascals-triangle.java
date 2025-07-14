class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();

        for(int i=0; i<numRows; i++){
            List<Integer> Row = new ArrayList();
            for(int j=0; j<=i; j++){
                if(j == 0 || j == i)
                    Row.add(1);
                else{
                    List<Integer> previousRow = result.get(i-1);
                    Row.add(previousRow.get(j) + previousRow.get(j-1));
                }
            }
            result.add(Row);
        }
        return result;
    }
}