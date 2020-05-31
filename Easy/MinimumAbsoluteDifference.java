class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
    Arrays.sort(arr);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length - 1; i++){
        int dif = arr[i+1] - arr[i];
        min = Math.min(min, dif);
    }
    List<List<Integer>> answer = new ArrayList<>();
    for (int j = 0; j < arr.length -1; j++){
       if (arr[j+1] - arr[j] == min) {
           List<Integer> helper = new ArrayList<>();
           helper.add(arr[j]);
           helper.add(arr[j+1]);
           answer.add(helper);
       }
    }
    return answer;
    }
}
