class Solution {
    List<Integer> list = new ArrayList<Integer>();
    int num1 = 0;
    int num2 = 1;
    int num3 = 0;
    public int findMinFibonacciNumbers(int k) {
        fib(k);
        int length = list.size();
        int counter = 0;
        for (int i = 0; i < length; i++){
            if (k - list.get(length - i - 1) >= 0){
                k = k - list.get(length - i - 1);
                counter++;
            }
        }
        return counter;
    }
    public void fib(int N) {
        if (N == 0) {
            list.add(0);
            return;
        }
        if (N == 1) {
            list.add(1);
            return;
        }
        list.add(1);
        for (int i = 0; i < N; i++) {
            int num3 = num1 + num2;
            list.add(num3);
            num1 = num2;
            num2 = num3;
            if (num2 >= N) return;
        }
    }
}
