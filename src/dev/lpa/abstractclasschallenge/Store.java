package dev.lpa.abstractclasschallenge;

import dev.lpa.abstractclasschallenge.productforsale.CerealProduct;
import dev.lpa.abstractclasschallenge.productforsale.DairyProduct;
import dev.lpa.abstractclasschallenge.productforsale.PersonalHygieneProduct;
import dev.lpa.abstractclasschallenge.productforsale.ProductForSale;

import java.util.ArrayList;

public class Store {

    private static ArrayList<ProductForSale> products = new ArrayList<>();

    public static void main(String[] args) {
        products.add(new CerealProduct("Baby food Dairy Flour", 12.00, "The most delicious cereal product ever made...."));
        products.add(new DairyProduct("Drink Yogurt Fruit Mix", 18.00, "This yogurt is perfect for restricted lactose diets"));
        products.add(new PersonalHygieneProduct("Tooth paste Colgate", 3.00, "Protect your teeth from cavities"));
        listProducts();
    }

    public static void listProducts(){
        for (ProductForSale product: products){
            System.out.println("-".repeat(30));
            product.showDetails();
        }
    }
}
