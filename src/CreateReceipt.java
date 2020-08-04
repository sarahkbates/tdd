import java.text.DecimalFormat;

public class CreateReceipt {

    private static DecimalFormat money = new DecimalFormat("#0.00");

    private static Receipt createReceipt(Items[] cart) {
        if (cart == null) {
            return null;
        };

        Receipt receipt = new Receipt();
        for(Items item: cart){
            receipt.pricesAfterTax = receipt.pricesAfterTax.concat("\n" + item.quantity + " " + item.name + " : $" + money.format(calcPricesAfterTax(item)));
        }

        System.out.println(receipt.pricesAfterTax);
        receipt.totalToPay = calcTotalToPay(cart);
        receipt.taxTotal = calcTaxTotal(cart);
        System.out.println("Sales Tax: $" + money.format(receipt.taxTotal) + "Total: $" + money.format(receipt.totalToPay) + "\n");
        return receipt;
    }

    private static double calcPricesAfterTax(Items item){
        double priceAfterTax = (Math.ceil)
    }
    private static double calcTotalToPay(Items[] cart){
        double totalToPay = 0.0;
        for (Items item: cart){
            totalToPay += calcPriceAfterTax(item);
        }
    }


}