import java.util.Map;

public class Operatii {
    public Polynom adunare(Polynom p1,Polynom p2)
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
    public Polynom inmultire(Polynom p1,Polynom p2)
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

    public Polynom impartire(Polynom p1,Polynom p2)
    {
        Polynom impartire = new Polynom();
        for(Map.Entry<Integer,Double> i : p1.polinom.entrySet())
        {

            for(Map.Entry<Integer,Double> j : p2.polinom.entrySet())
            {

                Integer ex = i.getKey()+ j.getKey();
                Double c = i.getValue()* j.getValue();
                if(!impartire.polinom.containsKey(ex))
                    impartire.adaugaMonom( ex,c);
                else
                {
                    Polynom add = new Polynom();
                    add.polinom.put(ex,c);
                    Operatii op = new Operatii();
                    impartire = op.adunare(impartire,add);
                }
            }
        }

        return impartire;
    }

}
