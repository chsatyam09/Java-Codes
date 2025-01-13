public class Rough {

    public static void stock(int stock[]) {
        int profit = 0;
        int buy = stock[0];
        int max_profit = 0;

        for (int i = 1; i < stock.length; i++) {
            if (stock[i] < buy) {
                buy = stock[i];
            }

            else if (stock[i] > buy) {
                profit += stock[i] - buy;
            }

            if (profit > max_profit) {
                max_profit = profit;
            }

        }
        System.out.println(max_profit);

    }

    public static void main(String[] args) {
        int stock[] = { 7, 8, 1, 9, 6, 4 };
        stock(stock);

    }
}
