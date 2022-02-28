/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfntdelivery;

/**
 *
 * @author USER
 */
public class Product {

    public String productName;
    public double price;
    public int amount;
    public String productDetails;

    String details = "";
    double totalHarga = 0;

    

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public String getProductDetails(String productName) {
        if (productName.equalsIgnoreCase("Pizza")) {
            return "a dish of Italian origin, consisting of a\n"
                    + "flat round base ofdough baked with a topping of \n"
                    + "tomatoes and cheese, typically with \n"
                    + "sadded meat, fish, or vegetables.";
        }

        return null;
    }

    public String getOrderDetails(Product[] product) {

        for (Product product1 : product) {
            if (product1.getAmount() > 0) {
                details = product1.getProductName() + "\t" + product1.getPrice() + "\t" + product1.getAmount() + "\n" + details;
                totalHarga = product1.getPrice() * product1.getAmount() + totalHarga;
            }
        }
        return details + "\n" + "Total Harga: \t" + totalHarga;
    }

    public Double getTotalHarga(Product[] product) {
        return this.totalHarga;
    }

    public boolean isFilledAmount(Product[] product) {
        boolean isNN = false;
        for (int i = 0; i < product.length; i++) {
            if (product[i].getAmount() > 0) {
                isNN = true;
            }
        }
        return isNN;
    }

}
