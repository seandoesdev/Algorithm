class Solution {
    public int solution(int[] num_list) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }

        int evenNum = even.length() > 0 ? Integer.parseInt(even.toString()) : 0;
        int oddNum = odd.length() > 0 ? Integer.parseInt(odd.toString()) : 0;

        return evenNum + oddNum;
    }
}
