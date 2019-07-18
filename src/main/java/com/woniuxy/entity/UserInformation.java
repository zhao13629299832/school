package com.woniuxy.entity;

import java.math.BigDecimal;

public class UserInformation {
    private String userPhone;

    private BigDecimal userMoney;

    private String userAddressId;

    private Boolean userInformationIsdelete;

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserAddressId() {
        return userAddressId;
    }

    public void setUserAddressId(String userAddressId) {
        this.userAddressId = userAddressId;
    }

    public Boolean getUserInformationIsdelete() {
        return userInformationIsdelete;
    }

    public void setUserInformationIsdelete(Boolean userInformationIsdelete) {
        this.userInformationIsdelete = userInformationIsdelete;
    }
}