package com.example.codecrafterstable;

public class Center {

    /**
     * ID : 1
     * co_id : 1
     * colllection_center : Kiganjo
     * purchase_price : 123
     * close : 1
     * status : 1
     */

    private String ID;
    private String co_id;
    private String collection_center;
    private String purchase_price;
    private String close;
    private String status;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCo_id() {
        return co_id;
    }

    public void setCo_id(String co_id) {
        this.co_id = co_id;
    }

    public String getCollection_center() {
        return collection_center;
    }

    public void setCollection_center(String collection_center) {
        this.collection_center = collection_center;
    }

    public Center(String ID, String co_id, String collection_center, String purchase_price, String close, String status) {
        this.ID = ID;
        this.co_id = co_id;
        this.collection_center = collection_center;
        this.purchase_price = purchase_price;
        this.close = close;
        this.status = status;
    }

    public String getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(String purchase_price) {
        this.purchase_price = purchase_price;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] toStringArray() {
        String[] stringData = new String[6];
        stringData[0] = ID;
        stringData[1] = co_id;
        stringData[2] = collection_center;
        stringData[3] = purchase_price;
        stringData[4] = close;
        stringData[5] = status;
        return stringData;
    }
}

