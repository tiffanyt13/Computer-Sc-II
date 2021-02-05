/********************************************************************
 *  Modified 9.2 (The Stock class) Following the example of the		*
 *  Circle class in Section 9.2, design a class named Stock 		*
 *  that contains:													*
 *  																*
 *  + A string data field named symbol for the stock’s symbol		*
 *  																*
 *  + A string data field named name for the stock’s name.			*
 *  																*
 *  + A double data field named currentPrice 						*
 * that stores the stock price for the current time.				*
 * 																	*
 * + A constructor that creates a stock with the specified 			*
 * symbol and name													*
 * 																	*
 * + A method named getChangePercent() that returns the 			*
 * percentage changed from previousClosingPrice to currentPrice.	*
 * 																	*
 * + Make a UML diagram for the class in the comments in the top 	*
 * of the class, and then implement the class. 						*
 * 																	*
 * +Write a test program that creates a Stock object with the stock *
 * symbol ORCL, the name Oracle Corporation,and the previous closing*
 * price of 34.5. Set a new current price to 34.35 and display 		*
 * the price-change percentage.										*
 ********************************************************************/

/**************************************************
                    Stock						  *
---------------------------------------------------
 *	-symbol: string								  *
 *	-name: string								  *
 *	-previousClosingPrice: double				  *
 *	-currentPrice: double						  *
---------------------------------------------------
 *	stock(symbol: String, name: String)			  *
 *	getChangePercent(): double					  *
 ****************************************************/

public class Exercise9_2 {
	public static void main(String[] args) {

		Stock stock1 = new Stock("ORCL" , "Oracle Corporation");
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;
		stock1.setSymbol ("google");
		System.out.println("The stock Symbol is " + stock1.getSymbol() + " and the Stock name is " + stock1.name);
		System.out.printf("%.2f", stock1.getChangePercent());
		System.out.print("%");

	}
}
