package com.woniuxy.entity;

public class Car {
    private String carId;

    private String shopId;

    private Integer carNumber;

    private Boolean carIsdelete;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(Integer carNumber) {
        this.carNumber = carNumber;
    }

    public Boolean getCarIsdelete() {
        return carIsdelete;
    }

    public void setCarIsdelete(Boolean carIsdelete) {
        this.carIsdelete = carIsdelete;
    }
}