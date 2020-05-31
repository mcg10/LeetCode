class Solution {
    public boolean judgeCircle(String moves) {
        int[] coords = {0,0};
        for (int i = 0; i < moves.length(); i++){
            if (moves.charAt(i) == "U".charAt(0)){
                coords[1] = coords[1] + 1;
            }
            if (moves.charAt(i) == "D".charAt(0)){
                coords[1] = coords[1] - 1;
            }
            if (moves.charAt(i) == "L".charAt(0)){
                coords[0] = coords[0] - 1;
            }
            if (moves.charAt(i) == "R".charAt(0)){
                coords[0] = coords[0] + 1;
            }
                
        }
        if (coords[0] != 0 || coords[1] != 0) return false;
        return true;
    }
}
