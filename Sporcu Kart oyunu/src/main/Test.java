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

public class Test extends javax.swing.JFrame {


    int toplamtiklanma = 0;
    int bsayac2 = 0;
    int sayac = 0;
    int sayac2 = 0;
    int bsayac = 0;
//    int tiklamakontrol = 0;
    int beraberlikTiklama = 0;

    public int getOyuncuSkor() {
        return oyuncuSkor;
    }

    public void setOyuncuSkor(int oyuncuSkor) {
        this.oyuncuSkor = oyuncuSkor;
    }

    public int getBilgisayarSkor() {
        return bilgisayarSkor;
    }

    public void setBilgisayarSkor(int bilgisayarSkor) {
        this.bilgisayarSkor = bilgisayarSkor;
    }

    public JLabel getLabe_kullanıcıSkor() {
        return labe_kullanıcıSkor;
    }

    public void setLabe_kullanıcıSkor(JLabel labe_kullanıcıSkor) {
        this.labe_kullanıcıSkor = labe_kullanıcıSkor;
    }

    public JLabel getLabel_bilgisayarSkor() {
        return label_bilgisayarSkor;
    }

    public void setLabel_bilgisayarSkor(JLabel label_bilgisayarSkor) {
        this.label_bilgisayarSkor = label_bilgisayarSkor;
    }
    int oyuncuSkor = 0;
    int bilgisayarSkor = 0;

    Futbolcular lewandowski = new Futbolcular("ROBERT LEWANDOWSKİ", 90, 88, 95);
    Futbolcular messi = new Futbolcular("LİONEL MESSİ", 90, 90, 97);
    Futbolcular neymar = new Futbolcular("JR NEYMAR", 90, 90, 92);
    Futbolcular ozan = new Futbolcular("OZAN TUFAN", 90, 99, 73);
    Futbolcular ronaldo = new Futbolcular("CRISTIANO RONALDO", 90, 95, 92);
    Futbolcular mane = new Futbolcular("SADİO MANE", 90, 94, 95);
    Futbolcular salah = new Futbolcular("MOHAMMED SALAH", 90, 94, 94);
    Futbolcular suarez = new Futbolcular("LUİS SUAREZ", 90, 90, 94);

    Basketbolcular durant = new Basketbolcular("KEVIN DURANT", 94, 94, 99);
    Basketbolcular curry = new Basketbolcular("STEPHAN CURRY", 93, 94, 97);
    Basketbolcular lebron = new Basketbolcular("LEBRON JAMES", 95, 96, 97);
    Basketbolcular gasol = new Basketbolcular("PAU GASOL", 90, 91, 92);
    Basketbolcular vesely = new Basketbolcular("JAN VESELY", 85, 76, 88);
    Basketbolcular boby = new Basketbolcular("BOBY DİXON", 82, 84, 85);
    Basketbolcular decolo = new Basketbolcular("NANDO DE COLO", 89, 90, 90);
    Basketbolcular harden = new Basketbolcular("JAMES HARDEN", 92, 93, 96);

    ArrayList<Integer> bilgisayarkartlari = new ArrayList<Integer>(4);
    ArrayList<Futbolcular> futbolcular = new ArrayList<>();
    ArrayList<Basketbolcular> basketbolcular = new ArrayList<>();
    ArrayList<Integer> basketbilgisayarkartlari = new ArrayList<Integer>(4);
    int tiklama = 0;
    int sayi = -1;
    int bsayi = -1;
    int sifir, bir, iki, uc, dort, bes, alti, yedi, sekiz, dokuz, on, onbir, oniki, onuc, ondort, onbes;
    int degisken;
    int a, b, c, d, e, f, g, h;
    int kontrol = 0, kontrol2 = 0, kontrol3 = 0, kontrol4 = 100;
    int bkontrol = 0, bkontrol2 = 0, bkontrol3 = 0, bkontrol4 = 100;

    public Test() {

        initComponents();
        label_tiklanma.setVisible(true);
        bortayabilgisayar.setVisible(false);
        bortayakullanici.setVisible(false);
        panel_kartalani.setVisible(true);
        label_durum.setVisible(false);
        button_yenioyun.setVisible(false);
        Label_kimkazandi.setVisible(false);
        label_kazanan.setVisible(false);
        label_oyunbitti.setVisible(false);
        futbolcular.add(lewandowski);
        futbolcular.add(messi);
        futbolcular.add(neymar);
        futbolcular.add(ozan);
        futbolcular.add(ronaldo);
        futbolcular.add(mane);
        futbolcular.add(salah);
        futbolcular.add(suarez);

        basketbolcular.add(durant);
        basketbolcular.add(curry);
        basketbolcular.add(lebron);

        basketbolcular.add(gasol);
        basketbolcular.add(vesely);
        basketbolcular.add(boby);
        basketbolcular.add(decolo);
        basketbolcular.add(harden);

        labe_kullanıcıSkor.setVisible(true);
        label_bilgisayarSkor.setVisible(true);

        bilgisayarkartlari.add(0);
        bilgisayarkartlari.add(1);
        bilgisayarkartlari.add(2);
        bilgisayarkartlari.add(3);

        basketbilgisayarkartlari.add(0);
        basketbilgisayarkartlari.add(1);
        basketbilgisayarkartlari.add(2);
        basketbilgisayarkartlari.add(3);
        label_durum2.setVisible(false);

    }

    public void bilgisayarKartDagit(int sayac) {
        Bilgisayar bilgisayar = new Bilgisayar("0", "0", 0);
        if (sayac == 1) {
            int rastgelearray = (int) (Math.random() * 4);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);

        }
        if (sayac == 2) {
            int rastgelearray = (int) (Math.random() * 3);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);

        }
        if (sayac == 3) {
            int rastgelearray = (int) (Math.random() * 2);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);

        }
        if (sayac == 4) {
            int rastgelearray = (int) (Math.random() * 1);
            sayi = bilgisayarkartlari.get(rastgelearray);
            bilgisayarkartlari.remove(rastgelearray);

        }

        if (sayi == 0) {
            b1.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sifir) + ".png")));

        }
        if (sayi == 1) {
            b2.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(bir) + ".png")));
        }
        if (sayi == 2) {
            b3.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(iki) + ".png")));

        }

        if (sayi == 3) {
            b4.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(uc) + ".png")));

        }

    }

    public void basketBilgisayarKartDagit(int bsayac) {
        Bilgisayar bilgisayar = new Bilgisayar("0", "0", 0);
        if (bsayac == 1) {
            int rastgelearray = (int) (Math.random() * 4);
            bsayi = basketbilgisayarkartlari.get(rastgelearray);
            basketbilgisayarkartlari.remove(rastgelearray);

        }
        if (bsayac == 2) {
            int rastgelearray = (int) (Math.random() * 3);
            bsayi = basketbilgisayarkartlari.get(rastgelearray);
            basketbilgisayarkartlari.remove(rastgelearray);

        }
        if (bsayac == 3) {
            int rastgelearray = (int) (Math.random() * 2);
            bsayi = basketbilgisayarkartlari.get(rastgelearray);
            basketbilgisayarkartlari.remove(rastgelearray);

        }
        if (bsayac == 4) {
            int rastgelearray = (int) (Math.random() * 1);
            bsayi = basketbilgisayarkartlari.get(rastgelearray);
            basketbilgisayarkartlari.remove(rastgelearray);

        }

        if (bsayi == 0) {
            bb1.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(sekiz) + ".png")));

        }
        if (bsayi == 1) {
            bb2.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(dokuz) + ".png")));
        }
        if (bsayi == 2) {
            bb3.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(on) + ".png")));

        }

        if (bsayi == 3) {
            bb4.setVisible(false);
            bilgisayar.kartSec(this);
            getBortayabilgisayar().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(onbir) + ".png")));

        }

    }

    public void ilkDurum(int kontrol, int kontrol2) {
        if (kontrol == -1) {
            b1.setVisible(true);

        }
        if (kontrol == -2) {
            b2.setVisible(true);

        }

        if (kontrol == -3) {
            b3.setVisible(true);

        }
        if (kontrol == -4) {
            b4.setVisible(true);

        }
        if (kontrol2 == -8) {
            b8.setVisible(true);
        }
        if (kontrol2 == -7) {
            b7.setVisible(true);
        }
        if (kontrol2 == -6) {
            b6.setVisible(true);
        }
        if (kontrol2 == -5) {
            b5.setVisible(true);
        }
    }

    public void basketilkDurum(int bkontrol, int bkontrol2) {
        if (bkontrol == -1) {
            bb1.setVisible(true);

        }
        if (bkontrol == -2) {
            bb2.setVisible(true);

        }

        if (bkontrol == -3) {
            bb3.setVisible(true);

        }
        if (bkontrol == -4) {
            bb4.setVisible(true);

        }
        if (bkontrol2 == -8) {
            bb8.setVisible(true);
        }
        if (bkontrol2 == -7) {
            bb7.setVisible(true);
        }
        if (bkontrol2 == -6) {
            bb6.setVisible(true);
        }
        if (bkontrol2 == -5) {
            bb5.setVisible(true);
        }
    }

    public int getBsayac() {
        return bsayac;
    }

    public void setBsayac(int bsayac) {
        this.bsayac = bsayac;
    }

    public ArrayList<Integer> getBasketbilgisayarkartlari() {
        return basketbilgisayarkartlari;
    }

    public void setBasketbilgisayarkartlari(ArrayList<Integer> basketbilgisayarkartlari) {
        this.basketbilgisayarkartlari = basketbilgisayarkartlari;
    }

    public int getBsayi() {
        return bsayi;
    }

    public void setBsayi(int bsayi) {
        this.bsayi = bsayi;
    }

    public int getBkontrol() {
        return bkontrol;
    }

    public void setBkontrol(int bkontrol) {
        this.bkontrol = bkontrol;
    }

    public int getBkontrol2() {
        return bkontrol2;
    }

    public void setBkontrol2(int bkontrol2) {
        this.bkontrol2 = bkontrol2;
    }

    public int getBkontrol3() {
        return bkontrol3;
    }

    public void setBkontrol3(int bkontrol3) {
        this.bkontrol3 = bkontrol3;
    }

    public int getBkontrol4() {
        return bkontrol4;
    }

    public void setBkontrol4(int bkontrol4) {
        this.bkontrol4 = bkontrol4;
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
        return Label_kimkazandi;
    }

    public void setLabel_kimkazandi_bilgisayar(JLabel Label_kimkazandi_bilgisayar) {
        this.Label_kimkazandi = Label_kimkazandi_bilgisayar;
    }

    public JButton getButton_yenioyun() {
        return button_yenioyun;
    }

    public void setButton_yenioyun(JButton button_yenioyun) {
        this.button_yenioyun = button_yenioyun;
    }

    public JLabel getLabel_durum() {
        return label_durum;
    }

    public void setLabel_durum(JLabel label_durum) {
        this.label_durum = label_durum;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_kartalani = new javax.swing.JPanel();
        button_yenioyun = new javax.swing.JButton();
        button_kartdagit = new javax.swing.JButton();
        label_durum = new javax.swing.JLabel();
        Label_kimkazandi = new javax.swing.JLabel();
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
        bb1 = new javax.swing.JButton();
        bb2 = new javax.swing.JButton();
        bb3 = new javax.swing.JButton();
        bb4 = new javax.swing.JButton();
        bb5 = new javax.swing.JButton();
        bb6 = new javax.swing.JButton();
        bb7 = new javax.swing.JButton();
        bb8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labe_kullanıcıSkor = new javax.swing.JLabel();
        label_bilgisayarSkor = new javax.swing.JLabel();
        label_durum2 = new javax.swing.JLabel();
        label_tiklanma = new javax.swing.JLabel();
        label_oyunbitti = new javax.swing.JLabel();
        label_kazanan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_kartalani.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_kartalani.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_yenioyun.setText("Yeni Oyuna Basla");
        button_yenioyun.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_yenioyun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_yenioyunActionPerformed(evt);
            }
        });
        panel_kartalani.add(button_yenioyun, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, -1, 54));

        button_kartdagit.setText(" Kart Dagit");
        button_kartdagit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button_kartdagit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_kartdagitActionPerformed(evt);
            }
        });
        panel_kartalani.add(button_kartdagit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 70, 54));

        label_durum.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        label_durum.setForeground(new java.awt.Color(255, 0, 51));
        label_durum.setText("Kaleci ile karşı karşıya kalma  özelliği değerlendirilyor");
        panel_kartalani.add(label_durum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 340, 40));

        Label_kimkazandi.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Label_kimkazandi.setForeground(new java.awt.Color(0, 0, 255));
        Label_kimkazandi.setText("Bilgisayar kartı kazandı.Bilgisayar 10 puan kazandı");
        panel_kartalani.add(Label_kimkazandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 330, 20));

        b4.setText(" ");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 160, 210));

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 159, 210));

        b2.setText(" ");
        panel_kartalani.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 153, 210));

        b1.setText(" ");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 142, 210));

        bortayabilgisayar.setText(" ");
        bortayabilgisayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bortayabilgisayarActionPerformed(evt);
            }
        });
        panel_kartalani.add(bortayabilgisayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, 160, 230));

        bortayakullanici.setText(" ");
        panel_kartalani.add(bortayakullanici, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 159, 230));

        b5.setText(" ");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 159, 200));

        b6.setText(" ");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 153, 200));

        b8.setText(" ");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 150, 200));

        b7.setText(" ");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        panel_kartalani.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 580, 159, 200));

        bb1.setText(" ");
        bb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb1ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 160, 210));

        bb2.setText(" ");
        bb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb2ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 160, 210));

        bb3.setText(" ");
        bb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb3ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 0, 160, 210));

        bb4.setText(" ");
        bb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb4ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 160, 210));

        bb5.setText(" ");
        bb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb5ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 580, 160, 200));

        bb6.setText(" ");
        bb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb6ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 580, 160, 210));

        bb7.setText(" ");
        bb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb7ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 580, 160, 210));

        bb8.setText(" ");
        bb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bb8ActionPerformed(evt);
            }
        });
        panel_kartalani.add(bb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 570, 160, 210));
        panel_kartalani.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 160, 210));

        labe_kullanıcıSkor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labe_kullanıcıSkor.setForeground(new java.awt.Color(255, 0, 51));
        labe_kullanıcıSkor.setText("Oyuncu Skoru:0");
        panel_kartalani.add(labe_kullanıcıSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, 270, 50));

        label_bilgisayarSkor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        label_bilgisayarSkor.setForeground(new java.awt.Color(255, 0, 0));
        label_bilgisayarSkor.setText("Bilgisayar Skoru:0");
        panel_kartalani.add(label_bilgisayarSkor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 350, -1, -1));

        label_durum2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        label_durum2.setForeground(new java.awt.Color(255, 0, 51));
        label_durum2.setText("Lütfen Basketbolcu kartı seçiniz");
        panel_kartalani.add(label_durum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 480, 110));

        label_tiklanma.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        panel_kartalani.add(label_tiklanma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 440, 190, 80));

        label_oyunbitti.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        label_oyunbitti.setForeground(new java.awt.Color(51, 51, 255));
        label_oyunbitti.setText("oyun bitti");
        panel_kartalani.add(label_oyunbitti, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 370, 200, 80));

        label_kazanan.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        label_kazanan.setForeground(new java.awt.Color(204, 0, 204));
        label_kazanan.setText("  kazandı");
        panel_kartalani.add(label_kazanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 230, 80));

        getContentPane().add(panel_kartalani, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1500, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bortayabilgisayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bortayabilgisayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bortayabilgisayarActionPerformed

    private void button_kartdagitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_kartdagitActionPerformed

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
        sekiz = a + 8;
        dokuz = b + 8;
        on = c + 8;
        onbir = d + 8;
        oniki = e + 8;
        onuc = f + 8;
        ondort = g + 8;
        onbes = h + 8;
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(a) + ".png")));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(b) + ".png")));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(c) + ".png")));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(d) + ".png")));
        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(e) + ".png")));
        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(f) + ".png")));
        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(g) + ".png")));
        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(h) + ".png")));
        bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(a + 8) + ".png")));
        bb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(b + 8) + ".png")));
        bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(c + 8) + ".png")));
        bb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(d + 8) + ".png")));
        bb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(e + 8) + ".png")));
        bb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(f + 8) + ".png")));
        bb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(g + 8) + ".png")));
        bb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(h + 8) + ".png")));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        b4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        bb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        bb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        bb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
        bb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/resim.png")));
    }//GEN-LAST:event_button_kartdagitActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 0 || toplamtiklanma >= 11) {

            tiklama++;
            label_durum2.setVisible(false);
            label_durum.setVisible(true);
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            yenidenoynat();
            Kullanıcı kullanıcı = new Kullanıcı("6", "furkan", 0);
            kullanıcı.kartSec(this);

            sayac++;
            bilgisayarKartDagit(sayac);

            int karsilastirma = (int) (Math.random() * 3);
            if (sayi == 0) {
                degisken = sifir;
            }
            if (sayi == 1) {
                degisken = bir;
            }
            if (sayi == 2) {
                degisken = iki;
            }
            if (sayi == 3) {
                degisken = uc;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(bes).getDribbling() > futbolcular.get(degisken).getDribbling()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (futbolcular.get(bes).getDribbling() < futbolcular.get(degisken).getDribbling()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(bes).getDribbling() == futbolcular.get(degisken).getDribbling()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -6;

                            sayac2++;
                            sayac--;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(bes).getPenalti() > futbolcular.get(degisken).getPenalti()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(bes).getPenalti() < futbolcular.get(degisken).getPenalti()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(bes).getPenalti() == futbolcular.get(degisken).getPenalti()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -6;

                            sayac--;
                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(bes).getKarsiKarsiya() > futbolcular.get(degisken).getKarsiKarsiya()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(bes).getKarsiKarsiya() < futbolcular.get(degisken).getKarsiKarsiya()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(bes).getKarsiKarsiya() == futbolcular.get(degisken).getKarsiKarsiya()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -6;

                            bilgisayarkartlari.add(sayi);
                            sayac--;
                            sayac2++;
                            break;
                        }

                    }
                }
            }

            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen basketbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 0 || toplamtiklanma >= 11) {
            tiklama++;
            label_durum2.setVisible(false);
            label_durum.setVisible(true);
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("5", "furkan", 0);
            kullanıcı.kartSec(this);

            sayac++;

            bilgisayarKartDagit(sayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (sayi == 0) {
                degisken = sifir;
            }
            if (sayi == 1) {
                degisken = bir;
            }
            if (sayi == 2) {
                degisken = iki;
            }
            if (sayi == 3) {
                degisken = uc;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(dort).getDribbling() > futbolcular.get(degisken).getDribbling()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (futbolcular.get(dort).getDribbling() < futbolcular.get(degisken).getDribbling()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(dort).getDribbling() == futbolcular.get(degisken).getDribbling()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -5;

                            sayac--;
                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(dort).getPenalti() > futbolcular.get(degisken).getPenalti()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(dort).getPenalti() < futbolcular.get(degisken).getPenalti()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(dort).getPenalti() == futbolcular.get(degisken).getPenalti()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -5;

                            sayac2++;
                            sayac--;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    label_durum.setVisible(true);
                    if (futbolcular.get(dort).getKarsiKarsiya() > futbolcular.get(degisken).getKarsiKarsiya()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(dort).getKarsiKarsiya() < futbolcular.get(degisken).getKarsiKarsiya()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(dort).getKarsiKarsiya() == futbolcular.get(degisken).getKarsiKarsiya()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -5;

                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            sayac--;
                            break;
                        }

                    }
                }

            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
    }//GEN-LAST:event_b5ActionPerformed
  else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen basketbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }
    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 0 || toplamtiklanma >= 11) {
            tiklama++;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            yenidenoynat();
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("8", "furkan", 0);
            kullanıcı.kartSec(this);
            sayac++;

            bilgisayarKartDagit(sayac);

            int karsilastirma = (int) (Math.random() * 3);
            if (sayi == 0) {
                degisken = sifir;
            }
            if (sayi == 1) {
                degisken = bir;
            }
            if (sayi == 2) {
                degisken = iki;
            }
            if (sayi == 3) {
                degisken = uc;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getDribbling() > futbolcular.get(degisken).getDribbling()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() < futbolcular.get(degisken).getDribbling()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(yedi).getDribbling() == futbolcular.get(degisken).getDribbling()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -8;

                            sayac--;
                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getPenalti() > futbolcular.get(degisken).getPenalti()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() < futbolcular.get(degisken).getPenalti()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(yedi).getPenalti() == futbolcular.get(degisken).getPenalti()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -8;
                            sayac2++;

                            sayac--;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {

                    label_durum.setText("kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(yedi).getKarsiKarsiya() > futbolcular.get(degisken).getKarsiKarsiya()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() < futbolcular.get(degisken).getKarsiKarsiya()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(yedi).getKarsiKarsiya() == futbolcular.get(degisken).getKarsiKarsiya()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -8;

                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            sayac--;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen basketbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 0 || toplamtiklanma >= 11) {

            tiklama++;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("7", "furkan", 0);
            kullanıcı.kartSec(this);

            sayac++;

            bilgisayarKartDagit(sayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (sayi == 0) {
                degisken = sifir;
            }
            if (sayi == 1) {
                degisken = bir;
            }
            if (sayi == 2) {
                degisken = iki;
            }
            if (sayi == 3) {
                degisken = uc;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("Dribbling özelliği değerlendiriliyor");
                    if (futbolcular.get(alti).getDribbling() > futbolcular.get(degisken).getDribbling()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (futbolcular.get(alti).getDribbling() < futbolcular.get(degisken).getDribbling()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(alti).getDribbling() == futbolcular.get(degisken).getDribbling()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -7;

                            sayac--;
                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("Penaltı özelliği değerlendiriliyor");
                    if (futbolcular.get(alti).getPenalti() > futbolcular.get(degisken).getPenalti()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(alti).getPenalti() < futbolcular.get(degisken).getPenalti()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(alti).getPenalti() == futbolcular.get(degisken).getPenalti()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -7;

                            sayac--;
                            sayac2++;
                            bilgisayarkartlari.add(sayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    oyuncuSkor += 10;
                    oyuncu.skorGoster(this);
                    label_durum.setText("kaleci ile karşı karşıya özelliği değerlendiriliyor");
                    if (futbolcular.get(alti).getKarsiKarsiya() > futbolcular.get(degisken).getKarsiKarsiya()) {

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(alti).getKarsiKarsiya() < futbolcular.get(degisken).getKarsiKarsiya()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (futbolcular.get(alti).getKarsiKarsiya() == futbolcular.get(degisken).getKarsiKarsiya()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            kontrol = -(sayi + 1);
                            kontrol2 = -7;

                            bilgisayarkartlari.add(sayi);
                            sayac--;
                            sayac2++;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen basketbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void bb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb1ActionPerformed

    }//GEN-LAST:event_bb1ActionPerformed

    private void bb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bb2ActionPerformed

    private void bb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bb3ActionPerformed

    private void bb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bb4ActionPerformed

    private void bb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb5ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 1 || toplamtiklanma >= 11) {
            tiklama++;
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            basketilkDurum(bkontrol, bkontrol2);
            bkontrol = 0;
            bkontrol2 = 0;
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("13", "furkan", 0);
            kullanıcı.kartSec(this);

            bsayac++;

            basketBilgisayarKartDagit(bsayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (bsayi == 0) {
                degisken = sekiz;
            }
            if (bsayi == 1) {
                degisken = dokuz;
            }
            if (bsayi == 2) {
                degisken = on;
            }
            if (bsayi == 3) {
                degisken = onbir;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("ucluk atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(oniki - 8).getUçlük() > basketbolcular.get(degisken - 8).getUçlük()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getUçlük() < basketbolcular.get(degisken - 8).getUçlük()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getUçlük() == basketbolcular.get(degisken - 8).getUçlük()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -5;

                            sayac2++;

                            bsayac--;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("ikilik atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(oniki - 8).getIkilik() > basketbolcular.get(degisken - 8).getIkilik()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getIkilik() < basketbolcular.get(degisken - 8).getIkilik()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getIkilik() == basketbolcular.get(degisken - 8).getIkilik()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -5;

                            bsayac--;
                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Serbest atış özelliği değerlendiriliyor");
                    label_durum.setVisible(true);
                    if (basketbolcular.get(oniki - 8).getSerbestAtış() > basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getSerbestAtış() < basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(oniki - 8).getSerbestAtış() == basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -5;

                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            bsayac--;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen futbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_bb5ActionPerformed

    public Futbolcular getLewandowski() {
        return lewandowski;
    }

    public void setLewandowski(Futbolcular lewandowski) {
        this.lewandowski = lewandowski;
    }

    public Futbolcular getMessi() {
        return messi;
    }

    public void setMessi(Futbolcular messi) {
        this.messi = messi;
    }

    public Futbolcular getNeymar() {
        return neymar;
    }

    public void setNeymar(Futbolcular neymar) {
        this.neymar = neymar;
    }

    public Futbolcular getOzan() {
        return ozan;
    }

    public void setOzan(Futbolcular ozan) {
        this.ozan = ozan;
    }

    public Futbolcular getRonaldo() {
        return ronaldo;
    }

    public void setRonaldo(Futbolcular ronaldo) {
        this.ronaldo = ronaldo;
    }

    public Futbolcular getMane() {
        return mane;
    }

    public void setMane(Futbolcular mane) {
        this.mane = mane;
    }

    public Futbolcular getSalah() {
        return salah;
    }

    public void setSalah(Futbolcular salah) {
        this.salah = salah;
    }

    public Futbolcular getSuarez() {
        return suarez;
    }

    public void setSuarez(Futbolcular suarez) {
        this.suarez = suarez;
    }

    public Basketbolcular getLebron() {
        return lebron;
    }

    public void setLebron(Basketbolcular lebron) {
        this.lebron = lebron;
    }

    public Basketbolcular getCurry() {
        return curry;
    }

    public void setCurry(Basketbolcular curry) {
        this.curry = curry;
    }

    public Basketbolcular getDurant() {
        return durant;
    }

    public void setDurant(Basketbolcular durant) {
        this.durant = durant;
    }

    public Basketbolcular getVesely() {
        return vesely;
    }

    public void setVesely(Basketbolcular vesely) {
        this.vesely = vesely;
    }

    public Basketbolcular getBoby() {
        return boby;
    }

    public void setBoby(Basketbolcular boby) {
        this.boby = boby;
    }

    public Basketbolcular getDecolo() {
        return decolo;
    }

    public void setDecolo(Basketbolcular decolo) {
        this.decolo = decolo;
    }

    public Basketbolcular getHarden() {
        return harden;
    }

    public void setHarden(Basketbolcular harden) {
        this.harden = harden;
    }

    public Basketbolcular getGasol() {
        return gasol;
    }

    public void setGasol(Basketbolcular gasol) {
        this.gasol = gasol;
    }

    public ArrayList<Futbolcular> getFutbolcular() {
        return futbolcular;
    }

    public void setFutbolcular(ArrayList<Futbolcular> futbolcular) {
        this.futbolcular = futbolcular;
    }

    public ArrayList<Basketbolcular> getBasketbolcular() {
        return basketbolcular;
    }

    public void setBasketbolcular(ArrayList<Basketbolcular> basketbolcular) {
        this.basketbolcular = basketbolcular;
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public int getSekiz() {
        return sekiz;
    }

    public void setSekiz(int sekiz) {
        this.sekiz = sekiz;
    }

    public int getDokuz() {
        return dokuz;
    }

    public void setDokuz(int dokuz) {
        this.dokuz = dokuz;
    }

    public int getOn() {
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public int getOnbir() {
        return onbir;
    }

    public void setOnbir(int onbir) {
        this.onbir = onbir;
    }

    public int getOniki() {
        return oniki;
    }

    public void setOniki(int oniki) {
        this.oniki = oniki;
    }

    public int getOnuc() {
        return onuc;
    }

    public void setOnuc(int onuc) {
        this.onuc = onuc;
    }

    public int getOndort() {
        return ondort;
    }

    public void setOndort(int ondort) {
        this.ondort = ondort;
    }

    public int getOnbes() {
        return onbes;
    }

    public void setOnbes(int onbes) {
        this.onbes = onbes;
    }

    public int getDegisken() {
        return degisken;
    }

    public void setDegisken(int degisken) {
        this.degisken = degisken;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getKontrol() {
        return kontrol;
    }

    public void setKontrol(int kontrol) {
        this.kontrol = kontrol;
    }

    public int getKontrol2() {
        return kontrol2;
    }

    public void setKontrol2(int kontrol2) {
        this.kontrol2 = kontrol2;
    }

    public int getKontrol3() {
        return kontrol3;
    }

    public void setKontrol3(int kontrol3) {
        this.kontrol3 = kontrol3;
    }

    public int getKontrol4() {
        return kontrol4;
    }

    public void setKontrol4(int kontrol4) {
        this.kontrol4 = kontrol4;
    }

    public JLabel getLabel_kimkazandi() {
        return Label_kimkazandi;
    }

    public void setLabel_kimkazandi(JLabel Label_kimkazandi) {
        this.Label_kimkazandi = Label_kimkazandi;
    }

    public JButton getBb1() {
        return bb1;
    }

    public void setBb1(JButton bb1) {
        this.bb1 = bb1;
    }

    public JButton getBb2() {
        return bb2;
    }

    public void setBb2(JButton bb2) {
        this.bb2 = bb2;
    }

    public JButton getBb3() {
        return bb3;
    }

    public void setBb3(JButton bb3) {
        this.bb3 = bb3;
    }

    public JButton getBb4() {
        return bb4;
    }

    public void setBb4(JButton bb4) {
        this.bb4 = bb4;
    }

    public JButton getBb5() {
        return bb5;
    }

    public void setBb5(JButton bb5) {
        this.bb5 = bb5;
    }

    public JButton getBb6() {
        return bb6;
    }

    public void setBb6(JButton bb6) {
        this.bb6 = bb6;
    }

    public JButton getBb7() {
        return bb7;
    }

    public void setBb7(JButton bb7) {
        this.bb7 = bb7;
    }

    public JButton getBb8() {
        return bb8;
    }

    public void setBb8(JButton bb8) {
        this.bb8 = bb8;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLabel_durum2() {
        return label_durum2;
    }

    public void setLabel_durum2(JLabel label_durum2) {
        this.label_durum2 = label_durum2;
    }

    private void bb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb6ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 1 || toplamtiklanma >= 11) {
            tiklama++;
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            basketilkDurum(bkontrol, bkontrol2);
            bkontrol = 0;
            bkontrol2 = 0;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("14", "furkan", 0);
            kullanıcı.kartSec(this);

            bsayac++;

            basketBilgisayarKartDagit(bsayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (bsayi == 0) {
                degisken = sekiz;
            }
            if (bsayi == 1) {
                degisken = dokuz;
            }
            if (bsayi == 2) {
                degisken = on;
            }
            if (bsayi == 3) {
                degisken = onbir;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("ucluk atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(onuc - 8).getUçlük() > basketbolcular.get(degisken - 8).getUçlük()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getUçlük() < basketbolcular.get(degisken - 8).getUçlük()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getUçlük() == basketbolcular.get(degisken - 8).getUçlük()) {

                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -6;

                            sayac2++;
                            bsayac--;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("ikilik atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(onuc - 8).getIkilik() > basketbolcular.get(degisken - 8).getIkilik()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getIkilik() < basketbolcular.get(degisken - 8).getIkilik()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getIkilik() == basketbolcular.get(degisken - 8).getIkilik()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -6;

                            sayac2++;
                            bsayac--;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Serbest atış özelliği değerlendiriliyor");
                    label_durum.setVisible(true);
                    if (basketbolcular.get(onuc - 8).getSerbestAtış() > basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getSerbestAtış() < basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onuc - 8).getSerbestAtış() == basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -6;

                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            bsayac--;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen futbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_bb6ActionPerformed

    private void bb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb7ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 1 || toplamtiklanma >= 11) {
            tiklama++;
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            basketilkDurum(bkontrol, bkontrol2);
            bkontrol = 0;
            bkontrol2 = 0;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("15", "furkan", 0);
            kullanıcı.kartSec(this);

            bsayac++;

            basketBilgisayarKartDagit(bsayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (bsayi == 0) {
                degisken = sekiz;
            }
            if (bsayi == 1) {
                degisken = dokuz;
            }
            if (bsayi == 2) {
                degisken = on;
            }
            if (bsayi == 3) {
                degisken = onbir;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("ucluk atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(ondort - 8).getUçlük() > basketbolcular.get(degisken - 8).getUçlük()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getUçlük() < basketbolcular.get(degisken - 8).getUçlük()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getUçlük() == basketbolcular.get(degisken - 8).getUçlük()) {

                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -7;

                            sayac2++;
                            bsayac--;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("ikilik atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(ondort - 8).getIkilik() > basketbolcular.get(degisken - 8).getIkilik()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getIkilik() < basketbolcular.get(degisken - 8).getIkilik()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getIkilik() == basketbolcular.get(degisken - 8).getIkilik()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -7;

                            bsayac--;
                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Serbest atış özelliği değerlendiriliyor");
                    label_durum.setVisible(true);
                    if (basketbolcular.get(ondort - 8).getSerbestAtış() > basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getSerbestAtış() < basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(ondort - 8).getSerbestAtış() == basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        if (tiklama == 8 + sayac2) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -7;

                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            bsayac--;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen futbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }    }//GEN-LAST:event_bb7ActionPerformed

    private void bb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bb8ActionPerformed
        if (toplamtiklanma > 10) {
            tiklama++;
            beraberlikTiklama--;
        }
        if (tiklama % 2 == 1 || toplamtiklanma >= 11) {
            tiklama++;
            ilkDurum(kontrol, kontrol2);
            kontrol = 0;
            kontrol2 = 0;
            label_durum.setVisible(true);
            label_durum2.setVisible(false);
            basketilkDurum(bkontrol, bkontrol2);
            bkontrol = 0;
            bkontrol2 = 0;
            Oyuncu oyuncu = new Oyuncu("0", "0", 0);
            Kullanıcı kullanıcı = new Kullanıcı("16", "furkan", 0);
            kullanıcı.kartSec(this);

            bsayac++;

            basketBilgisayarKartDagit(bsayac);
            int karsilastirma = (int) (Math.random() * 3);
            if (bsayi == 0) {
                degisken = sekiz;
            }
            if (bsayi == 1) {
                degisken = dokuz;
            }
            if (bsayi == 2) {
                degisken = on;
            }
            if (bsayi == 3) {
                degisken = onbir;
            }
            while (true) {

                if (karsilastirma == 1) {
                    label_durum.setText("ucluk atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(onbes - 8).getUçlük() > basketbolcular.get(degisken - 8).getUçlük()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);

                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");

                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getUçlük() < basketbolcular.get(degisken - 8).getUçlük()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getUçlük() == basketbolcular.get(degisken - 8).getUçlük()) {

                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -8;

                            sayac2++;

                            bsayac--;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 0) {
                    label_durum.setText("ikilik atis özelliği değerlendiriliyor");
                    if (basketbolcular.get(onbes - 8).getIkilik() > basketbolcular.get(degisken - 8).getIkilik()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getIkilik() < basketbolcular.get(degisken - 8).getIkilik()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getIkilik() == basketbolcular.get(degisken - 8).getIkilik()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -8;

                            bsayac--;
                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            break;
                        }

                    }
                }
                if (karsilastirma == 2) {
                    label_durum.setText("Serbest atış özelliği değerlendiriliyor");
                    label_durum.setVisible(true);
                    if (basketbolcular.get(onbes - 8).getSerbestAtış() > basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        oyuncuSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Kullanıcı kartı kazandı Kullanıcı 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getSerbestAtış() < basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        bilgisayarSkor += 10;
                        oyuncu.skorGoster(this);
                        Label_kimkazandi.setVisible(true);
                        Label_kimkazandi.setText("Bilgisayar kartı kazandı Bilgisayar 10 puan kazandı");
                        break;

                    }
                    if (basketbolcular.get(onbes - 8).getSerbestAtış() == basketbolcular.get(degisken - 8).getSerbestAtış()) {
                        if (tiklama == sayac2 + 8) {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Sonkartların durumu berabere başka bir özellik değerlendirilicektir");
                            karsilastirma = (int) (Math.random() * 3);
                        } else {
                            Label_kimkazandi.setVisible(true);
                            Label_kimkazandi.setText("Durum Berabere Kartlar eski yerlerine dönecektir");
                            bkontrol = -(bsayi + 1);
                            bkontrol2 = -8;

                            sayac2++;
                            basketbilgisayarkartlari.add(bsayi);
                            bsayac--;
                            break;
                        }

                    }
                }
            }
            toplamtiklanma = tiklama + sayac2;
            label_tiklanma.setText(String.valueOf(toplamtiklanma));
            if (toplamtiklanma > 10) {
                tiklama--;
                beraberlikTiklama++;
            }
            if (tiklama == (beraberlikTiklama + sayac2 + 8)) {
                label_oyunbitti.setVisible(true);
                label_kazanan.setVisible(true);
                if (oyuncuSkor < bilgisayarSkor) {
                    label_kazanan.setText("Bilgisayar kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor > bilgisayarSkor) {
                    label_kazanan.setText("Kullanıcı Kazandı");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
                if (oyuncuSkor == bilgisayarSkor) {
                    label_kazanan.setText("Durum berabere");
                    label_bilgisayarSkor.setText("Toplam bilgisayar skor:" + String.valueOf(bilgisayarSkor));
                    labe_kullanıcıSkor.setText("Toplam oyuncu skor:" + String.valueOf(oyuncuSkor));
                }
            }
        } else {
            label_durum2.setVisible(true);
            label_durum2.setText("lutfen futbolcu kartı seçin");
            Label_kimkazandi.setVisible(false);
            label_durum.setVisible(false);
        }
    }//GEN-LAST:event_bb8ActionPerformed

    private void button_yenioyunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_yenioyunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_yenioyunActionPerformed

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
                new Test().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_kimkazandi;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton bb1;
    private javax.swing.JButton bb2;
    private javax.swing.JButton bb3;
    private javax.swing.JButton bb4;
    private javax.swing.JButton bb5;
    private javax.swing.JButton bb6;
    private javax.swing.JButton bb7;
    private javax.swing.JButton bb8;
    private javax.swing.JButton bortayabilgisayar;
    private javax.swing.JButton bortayakullanici;
    private javax.swing.JButton button_kartdagit;
    private javax.swing.JButton button_yenioyun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labe_kullanıcıSkor;
    private javax.swing.JLabel label_bilgisayarSkor;
    private javax.swing.JLabel label_durum;
    private javax.swing.JLabel label_durum2;
    private javax.swing.JLabel label_kazanan;
    private javax.swing.JLabel label_oyunbitti;
    private javax.swing.JLabel label_tiklanma;
    private javax.swing.JPanel panel_kartalani;
    // End of variables declaration//GEN-END:variables
}