package com.example.otimus.ppmo.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Otimus on 7/24/2017.
 */

public class TenderItem  {
    @SerializedName("Id")
    Integer id;

    @SerializedName("IFB No.")
    String ifdNo;

    @SerializedName("Bid Title")
    String bidTitle;

    @SerializedName("Procurement Category")
    String proCategory;

    @SerializedName("Notice Published Date")
    String publishedDate;

    @SerializedName("Last Date of Bid Submission")
    String lastDate;

    @SerializedName("Bid Opening Date")
    String bidOpeningDate;

    @SerializedName("No.of Days Left")
    String daysLeft;

    public TenderItem(Integer id, String ifdNo, String bidTitle, String proCategory, String publishedDate, String lastDate, String bidOpeningDate, String daysLeft) {
        this.id = id;
        this.ifdNo = ifdNo;
        this.bidTitle = bidTitle;
        this.proCategory = proCategory;
        this.publishedDate = publishedDate;
        this.lastDate = lastDate;
        this.bidOpeningDate = bidOpeningDate;
        this.daysLeft = daysLeft;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIfdNo() {
        return ifdNo;
    }

    public void setIfdNo(String ifdNo) {
        this.ifdNo = ifdNo;
    }

    public String getBidTitle() {
        return bidTitle;
    }

    public void setBidTitle(String bidTitle) {
        this.bidTitle = bidTitle;
    }

    public String getProCategory() {
        return proCategory;
    }

    public void setProCategory(String proCategory) {
        this.proCategory = proCategory;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public String getBidOpeningDate() {
        return bidOpeningDate;
    }

    public void setBidOpeningDate(String bidOpeningDate) {
        this.bidOpeningDate = bidOpeningDate;
    }

    public String getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(String daysLeft) {
        this.daysLeft = daysLeft;
    }
}
