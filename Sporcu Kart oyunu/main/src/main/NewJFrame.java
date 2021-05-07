/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class NewJFrame extends javax.swing.JFrame {

    int sayac = 0;
    ArrayList<Integer> bilgisayarkartlari = new ArrayList<Integer>(4);

    int tiklama = 0;

    int sifir, bir, iki, uc, dort, bes, alti, yedi;

    public NewJFrame() {

        initComponents();
        bortayabilgisayar.setVisible(false);
        bortayakullanici.setVisible(false);
panel_kartalani.setVisible(true);
        label_durum.setVisible(false);
        button_yenioyun.setVisible(false);
        Label_kimkazandi_bilgisayar.setVisible(false);
        label_kimkazandi_kullanici.setVisible(false);
      

    }

    public int bilgisayarkartdagit(int sayac) {
        bilgisayarkartlari.add(0);
        bilgisayarkartlari.add(1);
        bilgisayarkartlari.add(2);
        bilgisayarkartlari.add(3);
        int sayi;
        if (sayac == 1) {
            int rastgelearray = (int) (Math.random() * 4);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);
            return sayi;
        }
        if (sayac == 2) {
            int rastgelearray = (int) (Math.random() * 3);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);
            return sayi;
        }
        if (sayac == 3) {
            int rastgelearray = (int) (Math.random() * 2);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);
            return sayi;
        }
        if (sayac == 4) {
            int rastgelearray = (int) (Math.random() * 1);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);
            return sayi;
        }
        return 0;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }

    public ArrayList<Integer> getBilgisayarkartlari() {
        return bilgisayarkartlari;
    }

    public void setBilgisayarkartlari(ArrayList<Integer> bilgisayarkartlari) {
        this.bilgisayarkartlari = bilgisayarkartlari;
    }

    public int getTiklama() {
        return tiklama;
    }

    public void setTiklama(int tiklama) {
        this.tiklama = tiklama;
    }

    public int getSifir() {
        return sifir;
    }

    public void setSifir(int sifir) {
        this.sifir = sifir;
    }

    public int getBir() {
        return bir;
    }

    public void setBir(int bir) {
        this.bir = bir;
    }

    public int getIki() {
        return iki;
    }

    public void setIki(int iki) {
        this.iki = iki;
    }

    public int getUc() {
        return uc;
    }

    public void setUc(int uc) {
        this.uc = uc;
    }

    public int getDort() {
        return dort;
    }

    public void setDort(int dort) {
        this.dort = dort;
    }

    public int getBes() {
        return bes;
    }

    public void setBes(int bes) {
        this.bes = bes;
    }

    public int getAlti() {
        return alti;
    }

    public void setAlti(int alti) {
        this.alti = alti;
    }

    public int getYedi() {
        return yedi;
    }

    public void setYedi(int yedi) {
        this.yedi = yedi;
    }

    public JLabel getLabel_kimkazandi_bilgisayar() {
        return Label_kimkazandi_bilgisayar;
    }

    public void setLabel_kimkazandi_bilgisayar(JLabel Label_kimkazandi_bilgisayar) {
        this.Label_kimkazandi_bilgisayar = Label_kimkazandi_bilgisayar;
    }

    public JList<String> getSkorlar_listesi() {
        return Skorlar_listesi;
    }

    public void setSkorlar_listesi(JList<String> Skorlar_listesi) {
        this.Skorlar_listesi = Skorlar_listesi;
    }



    public JButton getButton_yenioyun() {
        return button_yenioyun;
    }

    public void setButton_yenioyun(JButton button_yenioyun) {
        this.button_yenioyun = button_yenioyun;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLabel_durum() {
        return label_durum;
    }

    public void setLabel_durum(JLabel label_durum) {
        this.label_durum = label_durum;
    }

    public JLabel getLabel_kimkazandi_kullanici() {
        return label_kimkazandi_kullanici;
    }

    public void setLabel_kimkazandi_kullanici(JLabel label_kimkazandi_kullanici) {
        this.label_kimkazandi_kullanici = label_kimkazandi_kullanici;
    }

    public JTextField getTxt_skorlar_basligi() {
        return txt_skorlar_basligi;
    }

    public void setTxt_skorlar_basligi(JTextField txt_skorlar_basligi) {
        this.txt_skorlar_basligi = txt_skorlar_basligi;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_kartalani = new javax.swing.JPanel();
        button_yenioyun = new javax.swing.JButton();
        button_kartdagit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Skorlar_listesi = new javax.swing.JList<>();
        txt_skorlar_basligi = new javax.swing.JTextField();
        label_durum = new javax.swing.JLabel();
        label_kimkazandi_kullanici = new javax.swing.JLabel();
        Label_kimkazandi_bilgisayar = new javax.swing.JLabel();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        bortayabilgisayar = new javax.swing.JButton();
        bortayakullanici = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_kartalani.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_kartalani.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_yenioyun.setText("Yeni Oyuna Basla");
        button_yenioyun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel_kartalani.add(button_yenioyun, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, -1, 54));

        button_kartdagit.setText(" Kart Dagit");
        button_kartdagit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_kartdagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kartdagitActionPerformed(evt);
            }
        });
        panel_kartalani.add(button_kartdagit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 70, 54));

        Skorlar_listesi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Skorlar_listesi);

        panel_kartalani.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 300, 240, 220));

        txt_skorlar_basligi.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        txt_skorlar_basligi.setForeground(new java.awt.Color(0, 0, 255));
        txt_skorlar_basligi.setText("Skorlar");
        panel_kartalani.add(txt_skorlar_basligi, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 280, 240, -1));

        label_durum.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        label_durum.setForeground(new java.awt.Color(255, 0, 51));
        label_durum.setText("Kaleci ile karşı karşıya kalma  özelliği değerlendirilyor");
        panel_kartalani.add(label_durum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 340, 40));

        label_kimkazandi_kullanici.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        label_kimkazandi_kullanici.setForeground(new java.awt.Color(0, 0, 255));
        label_kimkazandi_kullanici.setText("Kullanıcı kartı kazandı.Kullanıcı 10 puan kazandı");
        panel_kartalani.add(label_kimkazandi_kullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 330, 20));

        Label_kimkazandi_bilgisayar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Label_kimkazandi_bilgisayar.setForeground(new java.awt.Color(0, 0, 255));
        Label_kimkazandi_bilgisayar.setText("Bilgisayar kartı kazandı.Bilgisayar 10 puan kazandı");
        panel_kartalani.add(Label_kimkazandi_bilgisayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 330, 20));

        b4.setText(" ");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 160, 210));

        b3.setText(" ");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 159, 210));

        b2.setText(" ");
        panel_kartalani.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 153, 210));

        b1.setText(" ");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 142, 210));

        bortayabilgisayar.setText(" ");
        bortayabilgisayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bortayabilgisayarActionPerformed(evt);
            }
        });
        panel_kartalani.add(bortayabilgisayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 290, 160, 230));

        bortayakullanici.setText(" ");
        panel_kartalani.add(bortayakullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 159, 230));

        b5.setText(" ");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 159, 200));

        b6.setText(" ");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 153, 200));

        b8.setText(" ");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 150, 200));

        b7.setText(" ");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 580, 159, 200));

        b9.setText(" ");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 210, 240));

        getContentPane().add(panel_kartalani, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bortayabilgisayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bortayabilgisayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bortayabilgisayarActionPerformed
public void basketciKartlaridagit()
{
//int q,w,e,r,t,y,u,ı;
// int v = 8;
//        ArrayList<Integer> arrayBasketci = new ArrayList<Integer>(v);
//        for (int i = 8; i < 17; i++) {
//            arrayBasketci.add(i);
//        }
//   int rastgele = (int) (Math.random() * 8);
//        q = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 7);
//          w = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 6);
//         e = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//        
//        rastgele = (int) (Math.random() * 5);
//           r = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 4);
//       t = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 3);
//           y = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 2);
//          u = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//
//        rastgele = (int) (Math.random() * 1);
//      ı = arrayBasketci.get(rastgele);
//        arrayBasketci.remove(rastgele);
//        
//        b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(q) + ".png")));
//
//        b10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(w) + ".png")));
//        b11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(e) + ".png")));
//        b12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(r) + ".png")));
//        b13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(t) + ".png")));
//        b14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(y) + ".png")));
//        b15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(u) + ".png")));
//        b16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(ı) + ".png")));

}
    private void button_kartdagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kartdagitActionPerformed
        int a, b, c, d, e, f, g, h;
       

        button_kartdagit.setVisible(false);
        int n = 8;
        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        int rastgele = (int) (Math.random() * 8);
        a = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 7);
        b = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 6);
        c = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 5);
        d = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 4);
        e = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 3);
        f = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 2);
        g = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        rastgele = (int) (Math.random() * 1);
        h = arrayList.get(rastgele);
        arrayList.remove(rastgele);

        sifir = a;
        bir = b;
        iki = c;
        uc = d;
        dort = e;
        bes = f;
        alti = g;
        yedi = h;
        

        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/"+String.valueOf(a)+".png")));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(b) + ".png")));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(c) + ".png")));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(d) + ".png")));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(e) + ".png")));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(f) + ".png")));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(g) + ".png")));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(h) + ".png")));
 b9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basket/10.png")));
    

 
    }//GEN-LAST:event_button_kartdagitActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        tiklama++;
        yenidenoynat();
        bortayakullanici.setVisible(true);
        getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bes) + ".png")));
        b6.setVisible(false);

        sayac++;
        Bilgisayar bilgisayar = new Bilgisayar("1", "computer", 0);
        //        int sayi = bilgisayar.kartSec(sayac);
        int sayi = bilgisayarkartdagit(sayac);

        if (sayi == 0) {
            b1.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sifir) + ".png")));

        }
        if (sayi == 1) {
            b2.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bir) + ".png")));
        }
        if (sayi == 2) {
            b3.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(iki) + ".png")));

        }

        if (sayi == 3) {
            b4.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(uc) + ".png")));

        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        tiklama++;
        yenidenoynat();
        bortayakullanici.setVisible(true);
        getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(dort) + ".png")));
        b5.setVisible(false);

        sayac++;
        Bilgisayar bilgisayar = new Bilgisayar("1", "computer", 0);

        //        int sayi = bilgisayar.kartSec(sayac);
        int sayi = bilgisayarkartdagit(sayac);
        if (sayi == 0) {
            b1.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sifir) + ".png")));

        }
        if (sayi == 1) {
            b2.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bir) + ".png")));
        }
        if (sayi == 2) {
            b3.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(iki) + ".png")));

        }

        if (sayi == 3) {
            b4.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(uc) + ".png")));

        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        tiklama++;
        yenidenoynat();
        Futbolcular lewandowski = new Futbolcular("ROBERT LEWANDOWSKİ", 91, 88, 95);
        Futbolcular messi = new Futbolcular("LİONEL MESSİ", 95, 90, 97);
        Futbolcular neymar = new Futbolcular("JR NEYMAR", 92, 90, 92);
        Futbolcular ozan = new Futbolcular("OZAN TUFAN", 80, 99, 73);
        Futbolcular ronaldo = new Futbolcular("CRISTIANO RONALDO", 92, 95, 92);
        Futbolcular mane = new Futbolcular("SADİO MANE", 90, 94, 93);
        Futbolcular salah = new Futbolcular("MOHAMMED SALAH", 92, 94, 94);
        Futbolcular suarez = new Futbolcular("LUİS SUAREZ", 95, 90, 94);

        ArrayList<Futbolcular> futbolcular = new ArrayList<>();
        futbolcular.add(lewandowski);
        futbolcular.add(messi);
        futbolcular.add(neymar);
        futbolcular.add(ozan);
        futbolcular.add(ronaldo);
        futbolcular.add(mane);
        futbolcular.add(salah);
        futbolcular.add(suarez);
        label_durum.setVisible(true);
        bortayakullanici.setVisible(true);
        getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(yedi) + ".png")));
        b8.setVisible(false);
        sayac++;

        Bilgisayar bilgisayar = new Bilgisayar("1", "computer", 0);
        //        int sayi = bilgisayar.kartSec(sayac);
        int sayi = bilgisayarkartdagit(sayac);
        int karsilastirma = (int) (Math.random() * 3);

        if (sayi == 0) {

            b1.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sifir) + ".png")));
            while (true) {

                if (karsilastirma == 1) {

                    label_durum.setText("Dribbling Özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getDribbling() > futbolcular.get(sifir).getDribbling()) {

                        label_kimkazandi_kullanici.setVisible(true);

                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() < futbolcular.get(sifir).getDribbling()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() == futbolcular.get(sifir).getDribbling()) {
                        if (tiklama == 8) {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                          
                          
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getPenalti() > futbolcular.get(sifir).getPenalti()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() < futbolcular.get(sifir).getPenalti()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() == futbolcular.get(sifir).getPenalti()) {
                        if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getKarsiKarsiya() > futbolcular.get(sifir).getKarsiKarsiya()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() < futbolcular.get(sifir).getKarsiKarsiya()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() == futbolcular.get(sifir).getKarsiKarsiya()) {
                          if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
            }
        }
        if (sayi == 1) {
            b2.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bir) + ".png")));
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling Özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getDribbling() > futbolcular.get(bir).getDribbling()) {

                        label_kimkazandi_kullanici.setVisible(true);

                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() < futbolcular.get(bir).getDribbling()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() == futbolcular.get(bir).getDribbling()) {
                        if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getPenalti() > futbolcular.get(bir).getPenalti()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() < futbolcular.get(bir).getPenalti()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() == futbolcular.get(bir).getPenalti()) {
                         if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getKarsiKarsiya() > futbolcular.get(bir).getKarsiKarsiya()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() < futbolcular.get(bir).getKarsiKarsiya()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() == futbolcular.get(bir).getKarsiKarsiya()) {
                        if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
            }
        }
        if (sayi == 2) {
            b3.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(iki) + ".png")));
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getDribbling() > futbolcular.get(iki).getDribbling()) {

                        label_kimkazandi_kullanici.setVisible(true);

                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() < futbolcular.get(iki).getDribbling()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() == futbolcular.get(iki).getDribbling()) {
                          if (tiklama == 8) { 
                            Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                             Label_kimkazandi_bilgisayar.setVisible(true);
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                           
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getPenalti() > futbolcular.get(iki).getPenalti()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() < futbolcular.get(iki).getPenalti()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() == futbolcular.get(iki).getPenalti()) {
                        if(tiklama==8){
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);  }
                        else{
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");

                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getKarsiKarsiya() > futbolcular.get(iki).getKarsiKarsiya()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() < futbolcular.get(iki).getKarsiKarsiya()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() == futbolcular.get(iki).getKarsiKarsiya()) {
                        if(tiklama==8){
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);  }
                        else{
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");

                            break;
                        }

                    }
                }
            }
        }

        if (sayi == 3) {
            b4.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(uc) + ".png")));
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getDribbling() > futbolcular.get(uc).getDribbling()) {

                        label_kimkazandi_kullanici.setVisible(true);

                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() < futbolcular.get(uc).getDribbling()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() == futbolcular.get(uc).getDribbling()) {

                        if(tiklama==8){
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);  }
                        else{
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");

                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getPenalti() > futbolcular.get(uc).getPenalti()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() < futbolcular.get(uc).getPenalti()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() == futbolcular.get(uc).getPenalti()) {
                        if(tiklama==8){
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);  }
                        else{
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");

                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setVisible(true);
                    if (futbolcular.get(yedi).getKarsiKarsiya() > futbolcular.get(uc).getKarsiKarsiya()) {

                        label_kimkazandi_kullanici.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() < futbolcular.get(uc).getKarsiKarsiya()) {

                        Label_kimkazandi_bilgisayar.setVisible(true);
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() == futbolcular.get(uc).getKarsiKarsiya()) {
                        if(tiklama==8){
                            Label_kimkazandi_bilgisayar.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);  }
                        else{
                            Label_kimkazandi_bilgisayar.setText("Durum Berabere Kartlar eski yerlerine dönecektir");

                            break;
                        }

                    }
                }
            }
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        tiklama++;
        yenidenoynat();
        bortayakullanici.setVisible(true);
        getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(alti) + ".png")));

        b7.setVisible(false);
        //Kullanıcı kullanıcı=new Kullanıcı("0", "recep", 0);
        //kullanıcı.b7Kapat();

        sayac++;

        //        bilgisayar.b7kapat();
        Bilgisayar bilgisayar = new Bilgisayar("1", "computer", 0);
        //        int sayi = bilgisayar.kartSec(sayac);
        int sayi = bilgisayarkartdagit(sayac);
        if (sayi == 0) {
            b1.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sifir) + ".png")));

        }
        if (sayi == 1) {
            b2.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bir) + ".png")));
        }
        if (sayi == 2) {
            b3.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(iki) + ".png")));

        }

        if (sayi == 3) {
            b4.setVisible(false);
            bortayabilgisayar.setVisible(true);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(uc) + ".png")));

        }
    }//GEN-LAST:event_b7ActionPerformed

//    public void arrayList() {
//        int n = 4;
//        ArrayList<Integer> arrayListbilgisayar = new ArrayList<Integer>(n);
//        for (int i = 0; i < n; i++) {
//            arrayListbilgisayar.add(i);
//        }
//
//    }

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b9ActionPerformed

    public JButton getB1() {
        return b1;
    }

    public void setB1(JButton b1) {
        this.b1 = b1;
    }

    public JButton getB2() {
        return b2;
    }

    public void setB2(JButton b2) {
        this.b2 = b2;
    }

    public JButton getB3() {
        return b3;
    }

    public void setB3(JButton b3) {
        this.b3 = b3;
    }

    public JButton getB4() {
        return b4;
    }

    public void setB4(JButton b4) {
        this.b4 = b4;
    }

    public JButton getB5() {
        return b5;
    }

    public void setB5(JButton b5) {
        this.b5 = b5;
    }

    public JButton getB6() {
        return b6;
    }

    public void setB6(JButton b6) {
        this.b6 = b6;
    }

    public JButton getB7() {
        return b7;
    }

    public void setB7(JButton b7) {
        this.b7 = b7;
    }

    public JButton getB8() {
        return b8;
    }

    public void setB8(JButton b8) {
        this.b8 = b8;
    }

    public JButton getBortayabilgisayar() {
        return bortayabilgisayar;
    }

    public void setBortayabilgisayar(JButton bortayabilgisayar) {
        this.bortayabilgisayar = bortayabilgisayar;
    }

    public JButton getBortayakullanici() {
        return bortayakullanici;
    }

    public void setBortayakullanici(JButton bortayakullanici) {
        this.bortayakullanici = bortayakullanici;
    }

    public JButton getButton_kartdagit() {
        return button_kartdagit;
    }

    public void setButton_kartdagit(JButton button_kartdagit) {
        this.button_kartdagit = button_kartdagit;
    }

    public JPanel getPanel_kartalani() {
        return panel_kartalani;
    }

    public void setPanel_kartalani(JPanel panel_kartalani) {
        this.panel_kartalani = panel_kartalani;
    }
    public void yenidenoynat() {
        if (tiklama == 4) {
            button_yenioyun.setVisible(true);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_kimkazandi_bilgisayar;
    private javax.swing.JList<String> Skorlar_listesi;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bortayabilgisayar;
    private javax.swing.JButton bortayakullanici;
    private javax.swing.JButton button_kartdagit;
    private javax.swing.JButton button_yenioyun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel label_kimkazandi_kullanici;
    private javax.swing.JPanel panel_kartalani;
    private javax.swing.JTextField txt_skorlar_basligi;
    // End of variables declaration//GEN-END:variables
}
