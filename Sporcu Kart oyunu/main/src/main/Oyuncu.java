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

    public ArrayList<Futbolcular> getFutbolcularListe() {
        return futbolcularListe;
    }

    public void setFutbolcularListe(ArrayList<Futbolcular> futbolcularListe) {
        this.futbolcularListe = futbolcularListe;
    }

    public ArrayList<Basketbolcular> getBasketbolcularListe() {
        return basketbolcularListe;
    }

    public void setBasketbolcularListe(ArrayList<Basketbolcular> basketbolcularListe) {
        this.basketbolcularListe = basketbolcularListe;
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

    public void futbolcuListeEkle(ArrayList<Futbolcular> geçici){
       this.futbolcularListe=geçici;
    }
    public void basketbolcuListeEkle(ArrayList<Basketbolcular> geçici){
        this.basketbolcularListe=geçici;
    }

    

  
}

