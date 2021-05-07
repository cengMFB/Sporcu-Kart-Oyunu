package main;


public class Sporcular {



    private String isim;
    private int penalti;
    private int dribbling;
    private int karsiKarsiya;
    private int ikilik;
    private int üçlük;
    private int serbestAtis;
 

    public Sporcular() {
    
    }

    public Sporcular(String isim, int penalti, int dribbling, int karsiKarsiya, int ikilik, int üçlük, int serbestAtis) {
        this.isim = isim;
        this.penalti = penalti;
        this.dribbling = dribbling;
        this.karsiKarsiya = karsiKarsiya;
        this.ikilik = ikilik;
        this.üçlük = üçlük;
        this.serbestAtis = serbestAtis;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setPenalti(int penalti) {
        this.penalti = penalti;

    }

    public int getPenalti() {
        return penalti;
    }

    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;

    }

    public int getDribbling() {
        return dribbling;
    }

    public void setKarsiKarsiya(int karsiKarsiya) {
        this.karsiKarsiya = karsiKarsiya;

    }

    public int getKarsiKarsiya() {
        return karsiKarsiya;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setUçlük(int üçlük) {
        this.üçlük = üçlük;
    }

    public int getUçlük() {
        return üçlük;
    }

    public void setSerbestAtış(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getSerbestAtış() {
        return serbestAtis;
    }



 
}
