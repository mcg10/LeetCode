class Solution {
    public int[] sortedSquares(int[] A) {
       int[] answer = new int[A.length] ;
        for (int n = 0; n < A.length; n++){
            answer[n] = A[n] * A[n];
        }
        Arrays.sort(answer);
        return answer;
    }
}
