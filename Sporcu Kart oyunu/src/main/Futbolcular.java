package main;

public class Futbolcular extends Sporcular {

    private String isim;

    private int penalti;

    private int dribbling;

    private int karsiKarsiya;

    public Futbolcular(String isim, int penalti, int dribbling, int karsiKarsiya) {
        super(isim, penalti, dribbling, karsiKarsiya, 0, 0, 0);
    }

    public Futbolcular() {
    }
}
