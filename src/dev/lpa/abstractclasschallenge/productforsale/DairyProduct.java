package dev.lpa.abstractclasschallenge.productforsale;

public class DairyProduct extends ProductForSale {
    public DairyProduct(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.printf("This is a %s dairy product, maintain in a cold environment%n",type);
        System.out.printf("Price of product $%6.2f%n", price);
        System.out.println(description);
    }
}
