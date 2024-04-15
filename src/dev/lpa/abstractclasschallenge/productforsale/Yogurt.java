package dev.lpa.abstractclasschallenge.productforsale;

public class Yogurt extends ProductForSale {
    public Yogurt(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + ": Healthy yogurt!");
    }
}
