package com.rajat.SuperKeyword;

public class Clothing {

    private String productId;
    private String size;
    private String designer;
    private String price;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Clothing(String productId, String size, String designer, String price) {
        this.productId = productId;
        this.size = size;
        this.designer = designer;
        this.price = price;
    }
}
