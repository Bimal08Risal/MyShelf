package com.example.myshelf;

public class MyOrderItemModel {

    private int productImage;
    private int rating;
    private String productTitle;
    private String delivertStatus;

    public MyOrderItemModel(int productImage, int rating, String productTitle, String delivertStatus) {
        this.productImage = productImage;
        this.rating = rating;
        this.productTitle = productTitle;
        this.delivertStatus = delivertStatus;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getDelivertStatus() {
        return delivertStatus;
    }

    public void setDelivertStatus(String delivertStatus) {
        this.delivertStatus = delivertStatus;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
