class Solution {
    public int heightChecker(int[] heights) {
    int[] helper = new int[heights.length];
    for (int j = 0; j < heights.length; j++){
        helper[j] = heights[j];
    }
    Arrays.sort(helper);
    int answer = 0;
    for (int i = 0; i < heights.length; i++){
        if (heights[i] != helper[i]) answer++;
    }
    return answer;
}
}
