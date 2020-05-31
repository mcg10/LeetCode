class Solution {
    public String reverseWords(String s) {
      String empty = "";
        for (int i = 0; i < s.length(); i++){
            empty += s.charAt(s.length() - 1 - i);
        }
        String[] helper = empty.split(" ");
        String answer = "";
        for (int j = 0; j < helper.length; j++){
            answer += helper[helper.length - 1 - j] + " ";
        }
        return answer.substring(0, answer.length()-1);
    }
}
