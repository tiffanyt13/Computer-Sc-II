/**************************************************
 *                    Stock						  *
---------------------------------------------------
 *	-symbol: string								  *
 *	-name: string								  *
 *	-previousClosingPrice: double				  *
 *	-currentPrice: double						  *
---------------------------------------------------
 *	stock(symbol: String, name: String)			  *
 *	getChangePercent(): double					  *
 ****************************************************/
public class Stock {
	private String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;

	Stock(String newSymbol, String newName){
		symbol = newSymbol;
		name = newName;	

	}
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String string) {
		this.symbol = string;

	}
}
