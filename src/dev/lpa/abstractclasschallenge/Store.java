package dev.lpa.abstractclasschallenge;

import dev.lpa.abstractclasschallenge.productforsale.ProductForSale;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<OrderItem> orders = new ArrayList<>();

    }

    public static void displayProductDetails(ProductForSale product){
        System.out.println("Welcome to the store!");
        System.out.println("Available Items:");


    }

    public static void addProductToOrder(ProductForSale product, ArrayList<OrderItem> orders){

    }

    public static void printOrderedItems(ArrayList<OrderItem> orders){
        for (OrderItem item:orders){
            item.getProductForSale().printPriceLineItem(item.getQuantity());
        }
    }
}
