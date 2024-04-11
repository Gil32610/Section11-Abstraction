package dev.lpa.abstractclasschallenge.productforsale;

import dev.lpa.abstractclasschallenge.productforsale.ProductForSale;

public class Yogurt extends ProductForSale {
    public Yogurt(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {

    }
}
