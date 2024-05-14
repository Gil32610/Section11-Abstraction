package dev.lpa.abstractclasschallenge.productforsale;

public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPriceLineItem(int quantity) {
        // -15 means left justify a string and allow 15 spaces as min
        //8.2f means maximum floating pointer number width 8 and 2 precision after the period
        System.out.printf("%2d quantity at $%8.2f each, %-15s %-35s %n", quantity, price, type, description);
    }

    //This method should perform an operation specific for each class that extends this abstract class!
    //An individual implementation is required for every class that extends this class
    public abstract void showDetails();


    protected String getElementDescription() {
        return getClass().getSimpleName() + " " + type;
    }


}
