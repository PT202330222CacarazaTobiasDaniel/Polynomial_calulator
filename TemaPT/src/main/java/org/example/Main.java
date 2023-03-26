package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Polynom a = new Polynom();
        a.adaugaMonom(0,10.0);
        a.adaugaMonom(3,5.0);
        a.adaugaMonom(2,1.0);
        Operatii op = new Operatii();

        Pattern pattern = Pattern.compile("\\+?-?([0-9]?x\\^[0-9])");
        Matcher matcher = pattern.matcher("2x^2-4x^9+3x^3");
        while(matcher.find()) {
            String c = matcher.group(0);
            System.out.println("found: <" + c +  ">");
        }

        Polynom a2 = new Polynom();
        a2.adaugaMonom(1,5.0);
        a2.adaugaMonom(2,-1.0);
        a2.adaugaMonom(0,-10.0);
        a2.adaugaMonom(3,4.0);
        System.out.println(a.toString());
        System.out.println(a2.toString());
        Polynom ad =op.adunare(a,a2);
        Polynom sc =op.scadere(ad,a);
        Polynom in =op.inmultire(ad,sc);
        System.out.println(ad.toString());
        System.out.println(sc.toString());
        System.out.println(in.toString());
        Polynom a3 = new Polynom();
        //Monom m = new Monom(1,2.2);
        //System.out.println(m);
        a3.adaugaMonom(0,-1.0);
        a3.adaugaMonom(2,1.0);
        a3.adaugaMonom(90,1.0);
        a.adaugaMonom(0,-1.0);
        a.adaugaMonom(4,1.0);
        Polynom[] p = op.impartire(a,a3);
        Polynom der = op.derivare(a3);
        //a3.removeMonom(1);
        Polynom integr = op.integrare(der);
        System.out.println(der);
        System.out.println(integr);
        System.out.println(p[0].toString());
        System.out.println(p[1].toString());
        ///la scadere
        /*
        Pattern pattern = Pattern.compile("\\+?-?([0-9]?x\\^[0-9])");

        Polynom text = new Polynom();
        Polynom text2 = new Polynom();
        Matcher matcher = pattern.matcher(jTextField2.getText());
        while(matcher.find()) {
            String c = matcher.group(0);
            //String c2 = matcher.group(1);
            //System.out.println(""+" "+c.substring(0,2)+"  "+c.substring(4)+" ");
            if(!c.isEmpty())
                text.adaugaMonom(Integer.parseInt(c.substring(4)),Double.parseDouble(c.substring(0,2)));
        }
        Pattern pattern2 = Pattern.compile("\\+?-?([0-9]?x\\^[0-9])");

        Matcher matcher2 = pattern2.matcher(jTextField1.getText());
        while(matcher2.find()) {
            String c = matcher2.group(0);
            //System.out.println(""+c+" ");
            if(!c.isEmpty())
                text2.adaugaMonom(Integer.parseInt(c.substring(4)),Double.parseDouble(c.substring(0,2)));
        }
        Operatii op = new Operatii();
        jTextArea1.setText(op.scadere(text,text2).toString());*/
    }
}