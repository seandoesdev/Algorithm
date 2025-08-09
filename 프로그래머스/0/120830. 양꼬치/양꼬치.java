class Solution {
    public int solution(int n, int k) {
        int lamb_skewers_price = 12000;
        int drink = 2000;

        int total_price = n * lamb_skewers_price + (k - n / 10) * drink;
        return total_price;
    }
}