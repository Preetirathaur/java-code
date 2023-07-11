/* You are given an array prices where prices[i] is the price of given stock on the ith day ,you want to maximize your profit by choosing a single day 
   to buy one stock and choosing a different day in the future to sell that stock .return the maximum profit you can achieve from this transaction . if you cannot achieve any profit return 0.
   prices=[7,1,5,3,6,4]*/
   import java.util.*;
  public class stockmarket {
    public static int Buyandsellstockprices(int prices[])
    {
        int buyPrice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxprofit=Math.max(maxprofit,profit);

            }
            else{
                buyPrice=prices[i];

            }

        }
        return maxprofit;
    }
    public static  void main(String [] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(Buyandsellstockprices(prices));
    } 
    
  }
