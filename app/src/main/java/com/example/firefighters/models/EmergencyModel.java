package com.example.firefighters.models;

import com.example.firefighters.tools.ConstantsValues;

import java.util.Calendar;

public class EmergencyModel {
    private long id;

    private String senderMail; //Foreign key user sender
    private int messageId;  //Foreign key message

    private int sendUtc;
    private double longitude;
    private double latitude;
    private String gravity;
    private String status;
    private String sendDate;
    private String sendHour;
    private String currentUnit;

    public String getCurrentUnit() {
        return currentUnit;
    }

    public void setCurrentUnit(String currentUnit) {
        this.currentUnit = currentUnit;
    }

    public EmergencyModel() {
        gravity = ConstantsValues.GRAVITY_NORMAL;
        status = ConstantsValues.NOT_WORKING;

        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH) + 1;
        int utc = calendar.get(Calendar.ZONE_OFFSET);
        int hours = calendar.get(Calendar.HOUR_OF_DAY);
        int minutes = calendar.get(Calendar.MINUTE);
        int sec = calendar.get(Calendar.SECOND);
        sendDate = day + "/" + month + "/" + year;
        sendHour = hours + ":" + minutes + ":" + sec;
        sendUtc = utc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public int getSendUtc() {
        return sendUtc;
    }

    public void setSendUtc(int sendUtc) {
        this.sendUtc = sendUtc;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSendDate() {
        return sendDate;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public String getSendHour() {
        return sendHour;
    }

    public void setSendHour(String sendHour) {
        this.sendHour = sendHour;
    }

}
