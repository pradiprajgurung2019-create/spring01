package org.example;

public class Charger {
    private String ctype;
    private int cprice;
    private String cmodel;


    public String getCtype() {
        return ctype;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public int getCprice() {
        return cprice;
    }

    public void setCprice(int cprice) {
        this.cprice = cprice;
    }

    public String getCmodel() {
        return cmodel;
    }

    public void setCmodel(String cmodel) {
        this.cmodel = cmodel;
    }

    @Override
    public String toString() {
        return "Charger{" +
                "ctype='" + ctype + '\'' +
                ", cprice=" + cprice +
                ", cmodel='" + cmodel + '\'' +
                '}';
    }
}
