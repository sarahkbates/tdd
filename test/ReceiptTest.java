import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReceiptTest {
    @Test
    public void EmptyCartReturnsNullReceipt(){
        //arrange
        Items[] cart = null;
        //so, there's nothing in the cart

        //act
        Receipt receipt = CreateReceipt.createReceipt(cart);
        //okay, now make a receipt given the empty basket

        //assert
        assertNull(receipt);
        //telling it that there should not be a receipt.
    }
    @Test
    public void OneTaxExemptItem(){
        //arrange
        Items taxExempt = new Items("tax exempt item", 1, 5.00, true, false);
        Items[] cart = new Items[]{taxExempt};
        //creating the tax exempt item to test and cart

        //act
        Receipt receipt = CreateReceipt.createReceipt(cart);
        //create the receipt

        //assert
        assertEquals(taxExempt.price, receipt.totalToPay);
        //passing in what is expected, and what is actual

    }
}
