class Solution {
    public String reverseWords(String s) {
    String [] words = s.split(" ");
    String answer = "";
        for (int i = 0; i < words.length; i++){
            if (words[words.length-i-1].length() != 0 && i!=0) {
             answer+=" ";
            }
            if(words[words.length-i-1].length() != 0){
                answer+=words[words.length-i-1];
            }
        }
        return answer;
    }
}
