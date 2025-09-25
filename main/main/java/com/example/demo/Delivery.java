package com.example.demo;

public class Delivery {
    private String udate;
    private String cmmcode;
    private String jcode;
    private String dos;

    public Delivery(String udate, String cmmcode, String jcode, String dos) {
        this.udate = udate;
        this.cmmcode = cmmcode;
        this.jcode = jcode;
        this.dos = dos;
    }

    public String getUdate() { return udate; }
    public String getCmmcode() { return cmmcode; }
    public String getJcode() { return jcode; }
    public String getDos() { return dos; }

    public void setUdate(String udate) { this.udate = udate; }
    public void setCmmcode(String cmmcode) { this.cmmcode = cmmcode; }
    public void setJcode(String jcode) { this.jcode = jcode; }
    public void setDos(String dos) { this.dos = dos; }
}
