package com.example.demo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"udate", "cmmcode", "payway", "price", "payprice", "paydate"})
public class Payment {
    private String udate;
    private String cmmcode;
    private String payway;
    private String price;
    private String payprice;
    private String paydate;

    public Payment(String udate, String cmmcode, String payway, String price, String payprice, String paydate) {
        this.udate = udate;
        this.cmmcode = cmmcode;
        this.payway = payway;
        this.price = price;
        this.payprice = payprice;
        this.paydate = paydate;
    }

    //  Getter & Setter
    public String getUdate() { return udate; }
    public String getCmmcode() { return cmmcode; }
    public String getPayway() { return payway; }
    public String getpPrice() { return price; }
    public String getPayprice() { return payprice; }
    public String getPaydate() { return paydate; }

    public void setUdate(String udate) { this.udate = udate; }
    public void setCmmcode(String cmmcode) { this.cmmcode = cmmcode; }
    public void setPayway(String payway) { this.payway= payway;}
    public void setPrice(String price) { this.price = price; }
    public void setPayprice(String payprice) { this.payprice = payprice; }
    public void setPaydate(String paydate) { this.paydate = paydate;}

}

