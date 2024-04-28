package dev.lpa.abstractclasschallenge;

import dev.lpa.abstractclasschallenge.productforsale.ProductForSale;

public record OrderItem (int quantity, ProductForSale productForSale){}
