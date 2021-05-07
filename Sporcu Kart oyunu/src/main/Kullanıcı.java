package main;

import java.util.ArrayList;
import javax.swing.JButton;

public class Kullanıcı extends Oyuncu {

    private String oyuncuID;
    private String oyuncuAd;
    private int skor;
    Test newJFrame = new Test();

   

    public Kullanıcı() {
    }

    @Override
    public void kartSec(Test newJFrame) {
        super.kartSec(newJFrame);
        newJFrame.getLabel_durum();
        if ("5".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getB5().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getDort()) + ".png")));
        }
        if ("6".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getB6().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getBes()) + ".png")));
        }
        if ("7".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getB7().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getAlti()) + ".png")));

        }
        if ("8".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getB8().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getYedi()) + ".png")));
        }
        if ("13".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getBb5().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getOniki()) + ".png")));
        }
        if ("14".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getBb6().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getOnuc()) + ".png")));
        }
        if ("15".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getBb7().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getOndort()) + ".png")));
        }
        if ("16".equals(getOyuncuID())) {
            newJFrame.getBortayakullanici().setVisible(true);
            newJFrame.getBb8().setVisible(false);
            newJFrame.getBortayakullanici().setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/" + String.valueOf(newJFrame.getOnbes()) + ".png")));
        }
    }

    public Kullanıcı(String oyuncuID, String oyuncuAd, int skor) {
        super(oyuncuID, oyuncuAd, skor);
    }

}
