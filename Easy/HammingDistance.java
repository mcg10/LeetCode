class Solution {
    public int hammingDistance(int x, int y) {
       String s1 = String.format("%32s", Integer.toBinaryString(x)).replaceAll(" ", "0");
       String s2 = String.format("%32s", Integer.toBinaryString(y)).replaceAll(" ", "0");
    int num = 0;
    for (int i = 0; i < s1.length(); i++){
        if (s1.charAt(i) != s2.charAt(i)) num++;
    }
    return num;
}
}
