package com.woniuxy.entity;

import java.math.BigDecimal;

public class Shop {
    private String shopId;

    private String shopName;

    private BigDecimal shopPrice;

    private Integer shopNumber;

    private String shopPhoto;

    private String shopType;

    private Boolean shopIsdelete;

    private String shopNote;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    public Integer getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(Integer shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getShopPhoto() {
        return shopPhoto;
    }

    public void setShopPhoto(String shopPhoto) {
        this.shopPhoto = shopPhoto;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Boolean getShopIsdelete() {
        return shopIsdelete;
    }

    public void setShopIsdelete(Boolean shopIsdelete) {
        this.shopIsdelete = shopIsdelete;
    }

    public String getShopNote() {
        return shopNote;
    }

    public void setShopNote(String shopNote) {
        this.shopNote = shopNote;
    }
}