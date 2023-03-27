package org.assigment1;

import java.util.Map;

public class Operatii {
    public Polynom adunare(Polynom p1, Polynom p2)
    {
        Polynom suma = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = i.getValue();
            if(p2.polinom.containsKey(ex)) {
                c = c + p2.polinom.get(ex);
                p2.polinom.remove(ex);
            }
            suma.adaugaMonom( ex,c);
        }
        for(Map.Entry<Integer,Double> i : p2.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = p2.polinom.get(ex);
            suma.adaugaMonom( ex,c);
        }
        return suma;
    }

    public Polynom scadere(Polynom p1, Polynom p2)
    {
        Polynom scadere = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = i.getValue();
            if(p2.polinom.containsKey(ex)) {
                c = c - p2.polinom.get(ex);
                p2.polinom.remove(ex);
            }
            if(c != 0)
                scadere.adaugaMonom( ex,c);
        }
        for(Map.Entry<Integer,Double> i : p2.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = - p2.polinom.get(ex);
            scadere.adaugaMonom( ex,c);
        }
        return scadere;
    }
    public Polynom inmultire(Polynom p1, Polynom p2)
    {
        Polynom inmultire = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            for(Map.Entry<Integer,Double> j : p2.polinom.entrySet())
            {

                Integer ex = i.getKey()+ j.getKey();
                Double c = i.getValue()* j.getValue();
                if(!inmultire.polinom.containsKey(ex))
                    inmultire.adaugaMonom( ex,c);
                else
                {
                    Polynom add = new Polynom();
                    add.polinom.put(ex,c);
                    Operatii op = new Operatii();
                    inmultire = op.adunare(inmultire,add);
                }
            }
        }

        return inmultire;
    }

    public Polynom[] impartire(Polynom p1, Polynom p2)
    {
        Operatii op = new Operatii();
        //Polynom n = p1;
        Polynom rest = new Polynom();
        for(Map.Entry<Integer,Double> j : p1.polinom.entrySet())
        {
            rest.adaugaMonom(j.getKey(),j.getValue());

        }
        Polynom impartire = new Polynom();

        while(rest.getMaxDegree() >= p2.getMaxDegree())
        {
            if(p2.getMaxDegree()<= rest.getMaxDegree()) {
                    Monom m1 = new Monom();

                    m1 = new Monom(rest.getMaxDegree() - p2.getMaxDegree(), rest.polinom.get(rest.getMaxDegree()) / p2.polinom.get(p2.getMaxDegree()));

                    impartire.adaugaMonom(m1);
                    Polynom s = op.inmultire(p2, new Polynom(m1));
                    rest = op.scadere(rest, s);

            }

        }
        Polynom[] p = new Polynom[2];
        p[0] = impartire;
        p[1] = rest;
        return p;
    }

    public Polynom derivare( Polynom p1)
    {
        Polynom derivare = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = i.getValue();
            if(ex.equals(0))
            {
                continue;
            }
            else
            {
                derivare.adaugaMonom(ex-1,p1.polinom.get(ex)*ex);
            }
        }
        return derivare;
    }
    public Polynom integrare( Polynom p1)
    {
        Polynom integrare = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            Integer ex = i.getKey();
            Double c = i.getValue();
            if(ex.equals(0))
            {
                continue;
            }
            else
            {
                integrare.adaugaMonom(ex+1,p1.polinom.get(ex)/(ex+1));
            }
        }
        return integrare;
    }
}
