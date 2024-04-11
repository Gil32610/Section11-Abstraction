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
        System.out.println(quantity + "x " + type + " .".repeat(20) + " $: " + getSalesPrice(quantity));
    }

    public abstract void showDetails();


    protected String getElementDescription(){
        return getClass().getSimpleName() + " "+ type;
    }


}
