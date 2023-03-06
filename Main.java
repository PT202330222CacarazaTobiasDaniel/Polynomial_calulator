public class Main {
    public static void main(String[] args) {
        Polynom a = new Polynom();
        a.adaugaMonom(0,10.0);
        a.adaugaMonom(1,5.0);
        a.adaugaMonom(2,1.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(1,5.0);
        a2.adaugaMonom(2,1.0);
        a2.adaugaMonom(0,10.0);
        a2.adaugaMonom(3,4.0);
        System.out.println(a.toString());
        System.out.println(a2.toString());
        Operatii op = new Operatii();
        Polynom ad =op.adunare(a,a2);
        Polynom sc =op.scadere(ad,a);
        Polynom in =op.inmultire(ad,sc);
        System.out.println(ad.toString());
        System.out.println(sc.toString());
        System.out.println(in.toString());
    }
}