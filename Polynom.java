import java.util.HashMap;
import java.util.Map;

public class Polynom implements Comparable<Polynom> {
    public Map<Integer,Double> polinom;

    public Polynom()
    {
        this.polinom = new HashMap<Integer, Double>();
    }

    public void adaugaMonom(Integer exponent, Double coeficient)
    {
        this.polinom.put(exponent, coeficient);
    }

    public String toString()
    {
        String s = new String();
        for(Map.Entry<Integer,Double> i : this.polinom.entrySet())
        {
            int exp = i.getKey();
            if(exp== 0)
                s = s + i.getValue()  +" + ";
            else if (false) {// revin
                s = s + i.getValue() + "x^"+exp ;
            } else
                s = s + i.getValue() + "x^"+exp +" + ";


        }
        return s;
    }


    @Override
    public int compareTo(Polynom o) {
        return 0;
    }
}
