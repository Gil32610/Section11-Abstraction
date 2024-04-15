package dev.lpa.abstractclasschallenge.productforsale;

public class ToothPaste extends ProductForSale {
    public ToothPaste(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName()+": Anti cavities and maximum protection");
    }
}
