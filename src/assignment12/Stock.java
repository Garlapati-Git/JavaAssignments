package assignment12;

public class Stock 
{

	public static void main(String[] args) 
	{
		int [] price = {7,1,5,3,6,4};//{7,6,4,3,1};
		int buyDay = 0;
		int sellDay = 0;
        int buyPrice = price[0];
		int profit = 0;
        int maxProfit = 0;

        
        for (int i = 1; i < price.length; i++) 
        {

            if (price[i] < buyPrice) 
            {
                buyPrice = price[i];
                buyDay = i+1;
            } 
            else 
            {
                profit = price[i] - buyPrice;
                if (profit > maxProfit) 
                {
                    maxProfit = profit;
                    sellDay = i+1;
                }
            }
        }

        System.out.println("Profit is " +maxProfit);
        if(maxProfit == 0)
		{
        	System.out.println("No transactions can be done");
        }
        else
        {
        	System.out.println("If you Buy on day " +buyDay);
			System.out.println("And Sell on day " +sellDay);
        }
	}

}
