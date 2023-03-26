package org.example;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import junit.framework.TestCase;

import static junit.framework.TestCase.*;

public class OperatieTest {
    @BeforeAll
    void init()
    {
        System.out.println("Testare operatii !");
    }

    @Test
    public void testAdd() {
        Polynom a = new Polynom();
        a.adaugaMonom(0,1.0);
        a.adaugaMonom(2,3.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(0,4.0);
        a2.adaugaMonom(1,3.0);
        Operatii op = new Operatii();
        Polynom result = op.adunare(a,a2);
        Polynom expected = new Polynom();
        expected.adaugaMonom(0,5.0);
        expected.adaugaMonom(1,3.0);
        expected.adaugaMonom(2,3.0);
        assertTrue(result.compareTo(expected)== 0);
    }
    @Test
    public void testSub() {
        Polynom a = new Polynom();
        a.adaugaMonom(0,1.0);
        a.adaugaMonom(2,3.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(2,2.0);
        a2.adaugaMonom(1,3.0);
        Operatii op = new Operatii();
        Polynom result = op.scadere(a,a2);
        Polynom expected = new Polynom();
        expected.adaugaMonom(0,1.0);
        expected.adaugaMonom(1,-3.0);
        expected.adaugaMonom(2,1.0);
        assertTrue(result.compareTo(expected)== 0);
    }
    @Test
    public void testInmultire() {
        Polynom a = new Polynom();
        a.adaugaMonom(0,1.0);
        a.adaugaMonom(2,3.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(2,2.0);
        a2.adaugaMonom(1,3.0);
        Operatii op = new Operatii();
        Polynom result = op.inmultire(a,a2);
        Polynom expected = new Polynom();
        expected.adaugaMonom(1,3.0);
        expected.adaugaMonom(2,2.0);
        expected.adaugaMonom(3,9.0);
        expected.adaugaMonom(4,6.0);
        assertTrue(result.compareTo(expected)== 0);
    }

    @Test
    public void testImpartire() {
        Polynom a = new Polynom();
        a.adaugaMonom(2,2.0);
        a.adaugaMonom(3,4.0);
        a.adaugaMonom(5,6.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(2,6.0);
        a2.adaugaMonom(1,3.0);
        Operatii op = new Operatii();
        Polynom[] result = op.impartire(a,a2);
        Polynom[] expected = new Polynom[2];
        expected[0] = new Polynom();
        expected[1] = new Polynom();
        expected[0].adaugaMonom(3,1.0);
        expected[0].adaugaMonom(2,-0.5);
        expected[0].adaugaMonom(1,11.0/12.0);
        expected[0].adaugaMonom(0,-1.0/8.0);
        expected[1].adaugaMonom(1,3.0/8.0);
        assertTrue(result[0].compareTo(expected[0])== 0 && result[1].compareTo(expected[1])== 0);
    }

    @Test
    public void testDerivare() {
        Polynom a = new Polynom();
        a.adaugaMonom(2,2.0);
        a.adaugaMonom(3,4.0);
        a.adaugaMonom(5,6.0);

        Operatii op = new Operatii();
        Polynom result = op.derivare(a);

        Polynom expected = new Polynom();
        expected.adaugaMonom(4,30.0);
        expected.adaugaMonom(2,12.0);
        expected.adaugaMonom(1,4.0);
        assertTrue(result.compareTo(expected)== 0);
    }

    @Test
    public void testIntegrare() {
        Polynom a = new Polynom();
        a.adaugaMonom(4,30.0);
        a.adaugaMonom(2,12.0);
        a.adaugaMonom(1,4.0);

        Operatii op = new Operatii();
        Polynom result = op.integrare(a);

        Polynom expected = new Polynom();
        expected.adaugaMonom(2,2.0);
        expected.adaugaMonom(3,4.0);
        expected.adaugaMonom(5,6.0);
        assertTrue(result.compareTo(expected)== 0);
    }

    @Test
    public void testFalsAdd()
    {
        Polynom a = new Polynom();
        a.adaugaMonom(0,1.0);
        a.adaugaMonom(2,3.0);
        Polynom a2 = new Polynom();
        a2.adaugaMonom(0,4.0);
        a2.adaugaMonom(1,3.0);
        Operatii op = new Operatii();
        Polynom result = op.adunare(a,a2);
        Polynom expected = new Polynom();
        expected.adaugaMonom(0,1.0);
        expected.adaugaMonom(1,3.0);
        expected.adaugaMonom(2,3.0);
        assertTrue(result.compareTo(expected)== 0);
    }

}
