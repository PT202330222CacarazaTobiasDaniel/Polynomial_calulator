package org.example;

import java.util.HashMap;
import java.util.Map;

public class Monom {

    Integer exponent;
    Double coeficient;
    public Monom()
    {
        this.exponent = 0;
        this.coeficient = 0.0;
    }
    public Monom(Integer exponent, Double coeficient)
    {
        this.exponent = exponent;
        this.coeficient = coeficient;
    }

    public String toString()
    {
        String s = new String();

            s = s + this.coeficient + "x^"+this.exponent +" + ";


        return s;
    }
}
