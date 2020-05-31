class Solution {
    public int[] countBits(int num) {
    int[] answer = new int[num +1]  ;
    for (int i = 0; i < num + 1; i++){
        answer[i] = Integer.bitCount(i);
    }
    return answer;
    }
}
