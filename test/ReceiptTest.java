import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReceiptTest {
    @Test
    public void EmptyCartReturnsNullReceipt() {
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
    public void OneTaxExemptItem() {
        Items taxExempt = new Items("tax exempt item", 1, 5.00, true, false);
        Items[] cart = new Items[]{taxExempt};

        Receipt receipt = CreateReceipt.createReceipt(cart);


        assertEquals(taxExempt.price, receipt.totalToPay);

    }

    @Before
    public void newReceiptMade() {
        Receipt receipt = new Receipt();

    }

    @Test
    public void checkInput1ForTotal() {
        Items book = new Items("book", 1, 12.49, true, false);
        Items musicCD = new Items("music CD", 1, 14.99, false, false);
        Items chocolateBar = new Items("chocolate bar", 1, 0.85, true, false);

        Items[] cartInput1 = new Items[]{book, musicCD, chocolateBar};
        Receipt receipt = CreateReceipt.createReceipt(cartInput1);
        double expectedTotalCart1 = 30.33;

        assertEquals(expectedTotalCart1, receipt.totalToPay);
    }

    @Test
    public void checkInput1ForTax() {
        Items book = new Items("book", 1, 12.49, true, false);
        Items musicCD = new Items("music CD", 1, 14.99, false, false);
        Items chocolateBar = new Items("chocolate bar", 1, 0.85, true, false);

        Items[] cartInput1 = new Items[]{book, musicCD, chocolateBar};
        Receipt receipt = CreateReceipt.createReceipt(cartInput1);
        double expectedTaxCart1 = 1.50;

        assertEquals(expectedTaxCart1, receipt.taxTotal);

    }

    @Test
    public void checkInput2ForTotal() {
        Items importedBoxOfChocolates1 = new Items("imported box of chocolates", 1, 10.00, true, true);
        Items importedBottleOfPerfume1 = new Items("imported bottle of perfume", 1, 47.50, false, true);

        Items[] cartInput2 = new Items[]{importedBoxOfChocolates1, importedBottleOfPerfume1};
        Receipt receipt = CreateReceipt.createReceipt(cartInput2);
        double expectedTotalCart2 = 66.50;

        assertEquals(expectedTotalCart2, receipt.totalToPay);
    }


    @Test
    public void checkInput2ForTax() {
        Items importedBoxOfChocolates1 = new Items("imported box of chocolates", 1, 10.00, true, true);
        Items importedBottleOfPerfume1 = new Items("imported bottle of perfume", 1, 47.50, false, true);

        Items[] cartInput2 = new Items[]{importedBoxOfChocolates1, importedBottleOfPerfume1};
        Receipt receipt = CreateReceipt.createReceipt(cartInput2);
        double expectedTaxCart2 = 1.50;

        assertEquals(expectedTaxCart2, receipt.taxTotal);
    }

    @Test
    public void checkInput3ForTotal() {
        Items importedBottleOfPerfume2 = new Items("imported bottle of perfume", 1, 27.99, false, true);
        Items bottleOfPerfume = new Items ("bottle of perfume", 1, 18.99, false, false);
        Items headachePills = new Items("headache pills", 1, 9.75, true, false);
        Items importedBoxOfChocolates2 = new Items("imported box of chocolates", 1, 11.25, true, true);

        Items[] cartInput3 = new Items[]{importedBottleOfPerfume2, bottleOfPerfume, headachePills, importedBoxOfChocolates2};

        Receipt receipt = CreateReceipt.createReceipt(cartInput3);
        double expectedTotalCart3 = 6.70;

        assertEquals(expectedTotalCart3, receipt.totalToPay);
    }


    @Test
    public void checkInput3ForTax() {
        Items importedBottleOfPerfume2 = new Items("imported bottle of perfume", 1, 27.99, false, true);
        Items bottleOfPerfume = new Items ("bottle of perfume", 1, 18.99, false, false);
        Items headachePills = new Items("headache pills", 1, 9.75, true, false);
        Items importedBoxOfChocolates2 = new Items("imported box of chocolates", 1, 11.25, true, true);

        Items[] cartInput3 = new Items[]{importedBottleOfPerfume2, bottleOfPerfume, headachePills, importedBoxOfChocolates2};

        Receipt receipt = CreateReceipt.createReceipt(cartInput3);
        double expectedTaxCart3 = 75.98;

        assertEquals(expectedTaxCart3, receipt.taxTotal);
    }


}
