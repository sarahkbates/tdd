public class Items {

    String name;
    int quantity;
    double price;
    double tax;
    boolean isTaxExempt;
    boolean isImported;

    public Items(String name, int quantity, double price, double tax, boolean isTaxExempt, boolean isImported ){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.tax = tax;
        this.isTaxExempt = isTaxExempt;
        this.isImported = isImported;

        if(this.isTaxExempt && this.isImported){
            this.tax = 0.05;

        } else if (this.isTaxExempt){
            this.tax = 0.0;

        } else if (this.isImported){
            this.tax = 0.15;

        } else {
            this.tax = 0.10;
        }
    }
}
