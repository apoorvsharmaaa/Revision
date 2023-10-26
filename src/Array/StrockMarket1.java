package Array;

public class StrockMarket1 {
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int minimum = prices[0];
        int maxProfit = 0;
        for (int price: prices){
            minimum = Math.min(minimum,price);
            maxProfit = Math.max(maxProfit,price-minimum);
        }
        return maxProfit;
    }
}
