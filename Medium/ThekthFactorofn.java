class Solution {
    public int kthFactor(int n, int k) {
    int[] helper = new int[n];
    int counter = 0;
    for (int i = 1; i < n + 1; i++ ){
        if (n%i == 0){
            helper[counter] = i;
            counter++;
        }
    }
    if (helper[k-1] == 0) return -1;
    else return helper[k-1];
    }
}
