package com.toni.slutprojekt1.model;

public class weatherBean {

    private String cityStr;

    private String countryStr;

    private String cloudsStr;
    private String dateStr;
    private String humStr;

    public weatherBean(String cityStr, String countryStr) {

        this.cityStr = cityStr;
        this.countryStr = countryStr;

    }

    public String getCityStr() {
        return cityStr;
    }

    public String getCountryStr() {
        return countryStr;
    }

    public String getCloudsStr() {
        return cloudsStr;
    }

    public void setCloudsStr(String cloudsStr) {
        this.cloudsStr = cloudsStr;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }

    public String getHumStr() {
        return humStr;
    }

    public void setHumStr(String humStr) {
        this.humStr = humStr;
    }

}