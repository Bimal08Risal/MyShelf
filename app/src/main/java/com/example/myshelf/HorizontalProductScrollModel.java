package com.example.myshelf;

public class HorizontalProductScrollModel {

    private String productID;
    private String productImage;
    private String productTitle;
    private String productAuthor;
    private String productPrice;

    public HorizontalProductScrollModel(String productID,String productImage, String productTitle, String productAuthor, String productPrice) {
        this.productID = productID;
        this.productImage = productImage;
        this.productTitle = productTitle;
        this.productAuthor = productAuthor;
        this.productPrice = productPrice;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
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
