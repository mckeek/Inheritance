package com.company;

public class VIPCustomer {

    private String cName;
    private double cLimit;
    private String cEMail;

    public VIPCustomer() {
        this("default", 1000, "default@default");
    }

    public VIPCustomer(String cName, String cEMail) {
        this(cName, 1000, cEMail);
    }

    public VIPCustomer(String cName, double cLimit, String cEMail) {
        this.cName = cName;
        this.cLimit = cLimit;
        this.cEMail = cEMail;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public double getcLimit() {
        return cLimit;
    }

    public void setcLimit(double cLimit) {
        this.cLimit = cLimit;
    }

    public String getcEMail() {
        return cEMail;
    }

    public void setcEMail(String cEMail) {
        this.cEMail = cEMail;
    }
}


