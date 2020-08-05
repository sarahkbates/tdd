public class Main {

    public static void main(String[] args) {



    //Input 1:
        Items book = new Items("book", 1, 12.49, true, false);
        Items musicCD = new Items("music CD", 1, 14.99, false, false);
        Items chocolateBar = new Items("chocolate bar", 1, 0.85, true, false);

        Items[] cartInput1 = new Items[]{book, musicCD, chocolateBar};

        CreateReceipt.createReceipt(cartInput1);

        //Input 2:
        Items importedBoxOfChocolates1 = new Items("imported box of chocolates", 1, 10.00, true, true);
        Items importedBottleOfPerfume1 = new Items("imported bottle of perfume", 1, 47.50, false, true);

        Items[] cart2 = new Items[]{importedBoxOfChocolates1, importedBottleOfPerfume1};

        CreateReceipt.createReceipt(cart2);

        //Input 3:

        Items importedBottleOfPerfume2 = new Items("imported bottle of perfume", 1, 27.99, false, true);
        Items bottleOfPerfume = new Items ("bottle of perfume", 1, 18.99, false, false);
        Items headachePills = new Items("headache pills", 1, 9.75, true, false);
        Items importedBoxOfChocolates2 = new Items("imported box of chocolates", 1, 11.25, true, true);

        Items[] cart3 = new Items[]{importedBottleOfPerfume2, bottleOfPerfume, headachePills, importedBoxOfChocolates2};

        CreateReceipt.createReceipt(cart3);

    }

}
