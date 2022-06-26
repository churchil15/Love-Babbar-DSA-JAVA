class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<Integer>();
                
        int row = matrix.length;
        int col = matrix[0].length;
        
        int count = 0;
        int total = row*col;
        
        // index initialization
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = row-1;
        int endingCol = col-1;
        
        while(count<total){
            
            //printing starting row
            for(int index = startingCol; count<total && index<=endingCol; index++){
                
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;
            
            
            // printing ending coloumn
            for(int index = startingRow; count<total && index<=endingRow; index++){
                
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;
            
            
            
            // printing ending row
            for(int index = endingCol; count<total && index>=startingCol; index--){
                
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;
            
            
            // printing starting coloumn
            for(int index = endingRow; count<total && index>=startingRow; index--){
                
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }
        
        return ans;
        
        
    }
}
