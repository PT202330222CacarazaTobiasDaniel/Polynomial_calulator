package org.example;

import java.util.HashMap;
import java.util.Map;

public class Polynom implements Comparable<Polynom>{
    public Map<Integer,Double> polinom;
    private int maxDegree = -1;
    public Polynom()
    {
        this.polinom = new HashMap<Integer, Double>();
    }
    public Polynom(Monom m1)
    {
        this.polinom = new HashMap<Integer, Double>();
        this.adaugaMonom(m1.exponent, m1.coeficient);
    }
    public void adaugaMonom(Integer exponent, Double coeficient)
    {
        this.polinom.put(exponent, coeficient);
        if( exponent > maxDegree)
        {
            maxDegree = exponent;
        }
    }
    public void removeMonom(Integer exponent)
    {
        this.polinom.remove(exponent);
        if( exponent == maxDegree)
        {
            int j = maxDegree;
            for(int i = j; i>=0;i--)
            {
                if(this.polinom.containsKey(i)) {
                    if (this.polinom.get(i) < 1e-5) {
                        this.removeMonom(i);
                    }
                    maxDegree = i;
                    break;
                }
            }
        }
    }
    public void adaugaMonom(Monom mon)
    {
        this.polinom.put(mon.exponent, mon.coeficient);
        if( mon.exponent > maxDegree)
        {
            maxDegree = mon.exponent;
        }
    }

    public void removeMonom(Monom mon)
    {
        this.polinom.remove(mon.exponent);
        if( mon.exponent == maxDegree)
        {
            int j = maxDegree;
            for(int i = j; i>=0;i--)
            {
                if(this.polinom.containsKey(i))
                {
                    if(this.polinom.get(i) < 1e-5)
                    {
                        //this.removeMonom(i);
                    }
                    maxDegree = i;
                }
            }
        }
    }

    public String toString()
    {
        String s = new String();
        for(Map.Entry<Integer,Double> i : this.polinom.entrySet())
        {
            int exp = i.getKey();
            if(i.getValue() >= 1e-5)
            {
            /*if(exp== 0)
                s = s + i.getValue()  +" + ";
            else */
                if (this.getMaxDegree() == i.getKey()) {
                    s = s + i.getValue() + "x^" + exp;
                } else
                    s = s + i.getValue() + "x^" + exp + " + ";
            }

        }
        return s;
    }

    public int getMaxDegree()
    {
        return maxDegree;
    }
    public void setMaxDegree(int maxDegree)
    {
        this.maxDegree = maxDegree;
    }
    @Override
    public int compareTo(Polynom o) {

        return 0;
    }
}
