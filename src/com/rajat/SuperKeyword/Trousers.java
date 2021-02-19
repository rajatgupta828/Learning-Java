package com.rajat.SuperKeyword;

public class Trousers extends Clothing {

    private String waist;
    private String bottom;

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getBottom() {
        return bottom;
    }

    public void setBottom(String bottom) {
        this.bottom = bottom;
    }

    public Trousers(String productId, String size, String designer, String price, String waist, String bottom) {
        super(productId, size, designer, price);
        this.waist = waist;
        this.bottom = bottom;
    }
}
