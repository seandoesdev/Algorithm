class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStartOfWord = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                answer.append(ch);
                isStartOfWord = true;
            } else {
                if (isStartOfWord) {
                    answer.append(Character.toUpperCase(ch));
                } else {
                    answer.append(Character.toLowerCase(ch));
                }
                isStartOfWord = false;
            }
        }
        return answer.toString();
    }
}