class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder(rsp.length());
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            switch (c) {
                case '2': sb.append('0'); break;
                case '0': sb.append('5'); break;
                case '5': sb.append('2'); break;
                default: throw new IllegalArgumentException("Invalid char: " + c);
            }
        }
        return sb.toString();
    }
}