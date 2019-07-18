package com.woniuxy.entity;

import java.util.Date;

public class UserOrder {
    private String userOrderId;

    private String userPhone;

    private String userAddressId;

    private Integer userOrderState;

    private Date userOrderCreatertime;

    private Date userOrderUpdatetime;

    private String storeId;

    private String driverId;

    private Boolean userAddressIsdelete;

    public String getUserOrderId() {
        return userOrderId;
    }

    public void setUserOrderId(String userOrderId) {
        this.userOrderId = userOrderId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(String userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Integer getUserOrderState() {
        return userOrderState;
    }

    public void setUserOrderState(Integer userOrderState) {
        this.userOrderState = userOrderState;
    }

    public Date getUserOrderCreatertime() {
        return userOrderCreatertime;
    }

    public void setUserOrderCreatertime(Date userOrderCreatertime) {
        this.userOrderCreatertime = userOrderCreatertime;
    }

    public Date getUserOrderUpdatetime() {
        return userOrderUpdatetime;
    }

    public void setUserOrderUpdatetime(Date userOrderUpdatetime) {
        this.userOrderUpdatetime = userOrderUpdatetime;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public Boolean getUserAddressIsdelete() {
        return userAddressIsdelete;
    }

    public void setUserAddressIsdelete(Boolean userAddressIsdelete) {
        this.userAddressIsdelete = userAddressIsdelete;
    }
}