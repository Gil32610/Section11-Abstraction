package dev.lpa.abstractclasschallenge.productforsale;

public class PersonalHygieneProduct extends ProductForSale {
    public PersonalHygieneProduct(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName()+": "+ type);
        System.out.printf("Price of product $%6.2f%n", price);
        System.out.println(description);
    }
}
