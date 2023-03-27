package org.assigment1;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Interfata extends JFrame {


    public Interfata() {
        initializare();
    }

    private void initializare() {

        jPanel1 = new JPanel();
        Text2 = new JTextField();
        Text1 = new JTextField();
        scadere = new JButton();
        inmultire = new JButton();
        adunare = new JButton();
        impartire = new JButton();
        derivare = new JButton();
        integrare = new JButton();
        jScrollPane1 = new JScrollPane();
        resultat = new JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Text2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text2ActionPerformed(evt);
            }
        });

        Text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text1ActionPerformed(evt);
            }
        });

        scadere.setText("-");
        scadere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scadereActionPerformed(evt);
            }
        });

        inmultire.setText("*");
        inmultire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inmultireActionPerformed(evt);
            }
        });

        adunare.setText("+");
        adunare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adunareActionPerformed(evt);
            }
        });

        impartire.setText("/");
        impartire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impartireActionPerformed(evt);
            }
        });

        derivare.setText("Derivare");
        derivare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                derivareActionPerformed(evt);
            }
        });

        integrare.setText("Integrare");
        integrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                integrareActionPerformed(evt);
            }
        });

        resultat.setColumns(20);
        resultat.setRows(5);
        resultat.setEditable(false);
        jScrollPane1.setViewportView(resultat);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup( jPanel1Layout.createSequentialGroup()
                                .addGap(60)
                                .addComponent(Text1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                .addComponent(Text2, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
                                )
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(inmultire, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(impartire, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(integrare, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(adunare, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(scadere, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(derivare, GroupLayout.PREFERRED_SIZE,180,GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60)
                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Text1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Text2, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(scadere, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adunare, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(derivare, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inmultire, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(impartire, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(integrare, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        )
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void Text1ActionPerformed(java.awt.event.ActionEvent evt) {
        resultat.setText("");
    }

    private void Text2ActionPerformed(java.awt.event.ActionEvent evt) {
        resultat.setText("");
    }

    private void adunareActionPerformed(java.awt.event.ActionEvent evt) {
        Pattern pattern = Pattern.compile("(\\+?-?[0-9]+)x|X\\^([0-9]+)");

        Polynom t = new Polynom();
        Polynom t2 = new Polynom();
        Matcher matcher = pattern.matcher(Text1.getText());
        while(matcher.find()) {
            String c = matcher.group(1);
            String c2 = matcher.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text2.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t2.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();
        resultat.setText(op.adunare(t,t2).toString());
    }

    private void scadereActionPerformed(java.awt.event.ActionEvent evt) {
        Pattern pattern = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Polynom t = new Polynom();
        Polynom t2 = new Polynom();
        Matcher matcher = pattern.matcher(Text1.getText());
        while(matcher.find()) {
            String c = matcher.group(1);
            String c2 = matcher.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text2.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t2.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();
        resultat.setText(op.scadere(t,t2).toString());
    }

    private void inmultireActionPerformed(java.awt.event.ActionEvent evt) {
        Pattern pattern = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Polynom t = new Polynom();
        Polynom t2 = new Polynom();
        Matcher matcher = pattern.matcher(Text1.getText());
        while(matcher.find()) {
            String c = matcher.group(1);
            String c2 = matcher.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text2.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t2.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();
        resultat.setText(op.inmultire(t,t2).toString());
    }

    private void impartireActionPerformed(java.awt.event.ActionEvent evt) {
        Pattern pattern = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Polynom t = new Polynom();
        Polynom t2 = new Polynom();
        Matcher matcher = pattern.matcher(Text1.getText());
        while(matcher.find()) {
            String c = matcher.group(1);
            String c2 = matcher.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text2.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t2.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();
        Polynom[] m = op.impartire(t,t2);
        resultat.setText("Impartire : "+m[0].toString()+"\nRest: "+m[1]);
    }

    private void integrareActionPerformed(java.awt.event.ActionEvent evt) {
        Polynom t2 = new Polynom();
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text2.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t2.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();

        resultat.setText(op.integrare(t2).toString());
    }
    private void derivareActionPerformed(java.awt.event.ActionEvent evt) {
        Polynom t = new Polynom();
        Pattern pattern2 = Pattern.compile("(\\+?-?[0-9]+)x\\^([0-9]+)");

        Matcher matcher2 = pattern2.matcher(Text1.getText());
        while(matcher2.find()) {
            String c = matcher2.group(1);
            String c2 = matcher2.group(2);
            if(!c.isEmpty() && !c2.isEmpty())
                t.adaugaMonom(Integer.parseInt(c2),Double.parseDouble(c));
        }
        Operatii op = new Operatii();

        resultat.setText(op.derivare(t).toString());

    }
    public static void main(String args[]) {
        new Interfata().setVisible(true);
    }


    private JTextField Text1;
    private JTextField Text2;
    private JButton adunare;
    private JButton derivare;
    private JButton impartire;
    private JButton inmultire;
    private JButton integrare;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTextArea resultat;
    private JButton scadere;
}