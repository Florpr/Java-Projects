
import java.util.Scanner;
public class BrokerageFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int SharesBought;
        double PriceOfPurchasedShares;
        double SellingSharePrice;

System.out.print("Please enter the amount of shares sold: ");
SharesBought = scanner.nextInt();
System.out.print("Please enter the purchase price of each share: ");
        PriceOfPurchasedShares = scanner.nextDouble();
System.out.print("Please enter the selling price of each share: ");
SellingSharePrice = scanner.nextDouble();

double TotalInvested;
double TotalSaleAmount;
double ServiceFee;

TotalInvested = (PriceOfPurchasedShares*SharesBought);
TotalSaleAmount = (SellingSharePrice*SharesBought);
ServiceFee = (TotalInvested*0.015) + (TotalSaleAmount * 0.015);

double MoneyAcceptedAfterStock;
MoneyAcceptedAfterStock = TotalSaleAmount - (TotalSaleAmount*0.015);
 double GainedOrLost;
 GainedOrLost = (MoneyAcceptedAfterStock) - (TotalInvested+(TotalInvested*0.015));
 System.out.println("How much money was invested?: " + TotalInvested);
 System.out.println("The total service fee: " + ServiceFee);
 System.out.println("How much money was gained or lost?: " + GainedOrLost);
 System.out.println("Amount of money received after selling the stock: " + MoneyAcceptedAfterStock);

 scanner.close();
    }
}
