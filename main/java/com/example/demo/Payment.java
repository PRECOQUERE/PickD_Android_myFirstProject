package com.example.demo;

public class Payment {
    private String udate;
    private String cmmcode;
    private int price;

    public Payment(String udate, String cmmcode, int price) {
        this.udate = udate;
        this.cmmcode = cmmcode;
        this.price = price;
    }

    //  Getter & Setter
    public String getUdate() { return udate; }
    public String getCmmcode() { return cmmcode; }
    public int getPayprice() { return price; }

    public void setUdate(String udate) { this.udate = udate; }
    public void setCmmcode(String cmmcode) { this.cmmcode = cmmcode; }
    public void setPayprice(int price) { this.price = price; }

}

