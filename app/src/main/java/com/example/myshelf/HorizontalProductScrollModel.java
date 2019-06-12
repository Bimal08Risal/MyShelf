package com.example.myshelf;

public class HorizontalProductScrollModel {

    private int productImage;
    private String productTitle;
    private String productAuthor;
    private String productPrice;

    public HorizontalProductScrollModel(int productImage, String productTitle, String productAuthor, String productPrice) {
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productAuthor = productAuthor;
        this.productPrice = productPrice;
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

    public String getProductAuthor() {
        return productAuthor;
    }

    public void setProductAuthor(String productAuthor) {
        this.productAuthor = productAuthor;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }
}
