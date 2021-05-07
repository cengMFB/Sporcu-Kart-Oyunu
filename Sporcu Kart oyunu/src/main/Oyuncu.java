/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author recep
 */
import java.util.ArrayList;

public  class Oyuncu
{
 Test newJFrame=new Test();

    public Test getNewJFrame() {
        return newJFrame;
    }

    public void kartSec(Test newJFrame) {
        this.newJFrame = newJFrame;
    }
       public void skorGoster(Test newJFrame) {
        this.newJFrame = newJFrame;
        newJFrame.getLabe_kullanıcıSkor().setText("Oyuncu Skoru:"+String.valueOf(newJFrame.getOyuncuSkor()));
         newJFrame.getLabel_bilgisayarSkor().setText(" Bilgisayar Skoru:"+String.valueOf(newJFrame.getBilgisayarSkor()));
    }
    private String oyuncuID;
    private String oyuncuAd;
    private int skor;
    
    private ArrayList<Futbolcular> futbolcularListe=new ArrayList<>();
    private ArrayList<Basketbolcular> basketbolcularListe=new ArrayList<>();

    public Oyuncu()
    {
        this.oyuncuID = "Henuz Girilmedi";
        this.oyuncuAd = "Henuz Girilmedi";
        this.skor=0;
    }



    public Oyuncu(String oyuncuID, String oyuncuAd,int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAd = oyuncuAd;
        this.skor=0;
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAd() {
        return oyuncuAd;
    }

    public void setOyuncuAd(String oyuncuAd) {
        this.oyuncuAd = oyuncuAd;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

//    public void futbolcuListeEkle(ArrayList<Futbolcular> geçici){
//       this.futbolcularListe=geçici;
//    }
//    public void basketbolcuListeEkle(ArrayList<Basketbolcular> geçici){
//        this.basketbolcularListe=geçici;
//    }

    

  
}

