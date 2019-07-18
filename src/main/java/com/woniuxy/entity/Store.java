package com.woniuxy.entity;

public class Store {
    private String storeId;

    private String storeName;

    private String storePhone;

    private Boolean storeIsdelete;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone;
    }

    public Boolean getStoreIsdelete() {
        return storeIsdelete;
    }

    public void setStoreIsdelete(Boolean storeIsdelete) {
        this.storeIsdelete = storeIsdelete;
    }
}