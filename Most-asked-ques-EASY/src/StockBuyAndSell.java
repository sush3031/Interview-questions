/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

Example : prices = [7,1,5,3,6,4]
output : 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StockBuyAndSellSolution {
	public static int profit(int[] prices) {
		int min = Integer.MAX_VALUE;
		int profit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min) {
				min = prices[i];
			} else {
				profit = Math.max(profit, prices[i] - min);
			}
		}
		return profit;
	}
}

public class StockBuyAndSell {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of days : ");
		int n = Integer.parseInt(br.readLine());
		int prices[] = new int[n];
		System.out.println("Enter the values of prices : ");
		String line = br.readLine();
		String strs[] = line.trim().split("\\s+");
		for (int i = 0; i < n; i++) {
			prices[i] = Integer.parseInt(strs[i]);
		}
		int maxProfit = StockBuyAndSellSolution.profit(prices);
		System.out.println("The maxProfit is " + maxProfit);

	}

}
