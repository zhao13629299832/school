package com.woniuxy.entity;

public class Advertising {
    private String advertisingId;

    private String advertisingName;

    private String advertisingNote;

    private String advertisingPhoto;

    private Boolean advertisingIsdelete;

    public String getAdvertisingId() {
        return advertisingId;
    }

    public void setAdvertisingId(String advertisingId) {
        this.advertisingId = advertisingId;
    }

    public String getAdvertisingName() {
        return advertisingName;
    }

    public void setAdvertisingName(String advertisingName) {
        this.advertisingName = advertisingName;
    }

    public String getAdvertisingNote() {
        return advertisingNote;
    }

    public void setAdvertisingNote(String advertisingNote) {
        this.advertisingNote = advertisingNote;
    }

    public String getAdvertisingPhoto() {
        return advertisingPhoto;
    }

    public void setAdvertisingPhoto(String advertisingPhoto) {
        this.advertisingPhoto = advertisingPhoto;
    }

    public Boolean getAdvertisingIsdelete() {
        return advertisingIsdelete;
    }

    public void setAdvertisingIsdelete(Boolean advertisingIsdelete) {
        this.advertisingIsdelete = advertisingIsdelete;
    }
}