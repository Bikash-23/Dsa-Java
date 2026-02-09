public class Demo03 {
    public static int  buyAndSellStocks(int arr[]) {
        int n = arr.length;
        int buyPrice = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
           if(buyPrice < arr[i]){
            int profit = arr[i] - buyPrice;
            maxProfit = Math.max(maxProfit,profit);
           }else{
            buyPrice = arr[i];
           }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
