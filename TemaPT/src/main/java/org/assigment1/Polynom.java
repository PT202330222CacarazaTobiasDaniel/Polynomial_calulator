package org.assigment1;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class Polynom implements Comparable<Polynom>{
    public Map<Integer,Double> polinom;
    private int maxDegree = -1;
    private int minDegree = Integer.MAX_VALUE;
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
        if( exponent < minDegree)
        {
            minDegree = exponent;
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
        if( mon.exponent < minDegree)
        {
            minDegree = mon.exponent;
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
            if(abs(i.getValue()) >= 1e-5)
            {

                if ( getMinDegree() == i.getKey()) {
                    s = s + i.getValue() + "x^" + exp;
                }
                else if(i.getValue() >0)
                    s = s + " + "+i.getValue() + "x^" + exp;
                else
                    s = s + " "+i.getValue() + "x^" + exp;
            }

        }
        return s;
    }

    public int getMaxDegree()
    {
        return maxDegree;
    }
    public int getMinDegree()
    {
        return minDegree;
    }
    public void setMaxDegree(int maxDegree)
    {
        this.maxDegree = maxDegree;
    }
    @Override
    public int compareTo(Polynom o) {


        for (Map.Entry<Integer, Double> i : this.polinom.entrySet()) {

            for (Map.Entry<Integer, Double> j : o.polinom.entrySet()) {

                if(i.getValue() == j.getValue() && i.getKey()== j.getKey())
                {
                    continue;
                }
                else
                {
                    if(i.getKey()- j.getKey() != 0)
                        return i.getKey()- j.getKey() ;
                    else
                        return  i.getValue().intValue() -j.getValue().intValue();
                }

            }
        }
        return 0;
    }
}
