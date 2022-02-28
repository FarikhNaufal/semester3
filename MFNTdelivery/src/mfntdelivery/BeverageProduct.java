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
public class BeverageProduct extends Product{
    public BeverageProduct(){}

    public BeverageProduct(String productName, double price, int amount, String productDetails){
        this.productName = productName;
        this.price = price;
        this.amount = amount;
        this.productDetails = productDetails;
    }
    
    public BeverageProduct(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
}
