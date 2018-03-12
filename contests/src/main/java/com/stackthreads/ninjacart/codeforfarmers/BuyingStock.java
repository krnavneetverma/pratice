package com.stackthreads.ninjacart.codeforfarmers;

import java.util.Scanner;
/**
 * Buying Stock <Ninjacart>
Alice wants to buy a stock. She knows the increase and decrease in the stock value for N consecutive days. Positive value denotes the increase in stock price and negative value denotes the decrease in stock price.
She can buy stock in the morning, the increment or decrement in the stock occurs in afternoon and the selling can be done only at night. She can buy and sell stock at most once.
She can choose not to buy stock at all. Selling is only possible if she has bought the stock before. You can safely assume that she buys the stock at the price 0 units at any particular day.

You have to calculate the maximum profit she can earn.

Input Format:
First line of the input contains an integer N denoting the number of days.
Next line contains N space separated integers denoting increase or decrease in value. (Positive number denotes increase and negative denotes decrease)

Output Format:
Maximum profit that can be earned in this trade.

Constraints :

 

Sample Input
5
-5 2 3 -4 5 
Sample Output
6
Explanation
Alice buys stock on day 2 morning . Initial value of stock is 0 ,

On day 2 , it increase by 2 ,so it's value becomes 2

On day 3 , it increase by 3 ,so it's value becomes 5

On day 4 , it decreases by 4 ,so it's value becomes 1

On day 5 , it increase by 5 ,so it's value becomes 6 ,

On day 5 night, she sells the stock to gain profit of 6

Note: Your code should be able to convert the sample input into the sample output. However, this is not enough to pass the challenge, because the code will be run on multiple test cases. Therefore, your code must solve this problem statement.
 * @author nverma4
 *
 */
public class BuyingStock {

	public static void main(String[] args) {
		// read inputs
		Scanner sc = new Scanner(System.in);
		int days= sc.nextInt();
		sc.nextLine();
		String priceChangeCharArr[] = sc.nextLine().split(" ");
		int min = 0, max = 0, result=0;
		// parse price char array to int array
		int priceChgArr[] = new int[days];
		int diffArr[] = new int[days];
		
		for (int i = 0; i < days; i++) {
			priceChgArr[i] = Integer.parseInt(priceChangeCharArr[i]);
			diffArr[i]=priceChgArr[i];
			if (i == 0) {
				min = priceChgArr[0];
				max = priceChgArr[0];
				continue;
			}
			diffArr[i] += diffArr[i - 1];
			if (min > diffArr[i])
				min = diffArr[i];
			if (max < diffArr[i])
				max = diffArr[i];
		}
		result=max;
		for(int i =0; i<days-1; i++) {
			for(int j=i+1; j<days; j++) {
				diffArr[j]-=diffArr[i];
				if(diffArr[j]>result) {
					result=diffArr[j];
				}
			}
		}
		
		System.out.println(result);
		sc.close();
	}
}
