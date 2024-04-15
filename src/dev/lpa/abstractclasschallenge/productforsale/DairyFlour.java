package dev.lpa.abstractclasschallenge.productforsale;

public class DairyFlour extends ProductForSale {
    public DairyFlour(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + ": The most delicious snack ever");
    }
}
