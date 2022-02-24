package com.mycompany.boatAndCo.entity;

public class Adress {
    public int number;
    public String street;
    public int cp;
    public String city;

    public Adress() {
    }

    public Adress(int number, String street, int cp, String city) {
        this.number = number;
        this.street = street;
        this.cp = cp;
        this.city = city;
    }
}
