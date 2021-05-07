
package main;

import java.util.ArrayList;

/**
 *
 * @author recep
 */
public class Bilgisayar extends Oyuncu {

    NewJFrame newJFrame = new NewJFrame();
    private String oyuncuID;
    private String oyuncuAd;
    private int skor;

 


    public Bilgisayar(String oyuncuID, String oyuncuAd, int skor) {
        super(oyuncuID, oyuncuAd, skor);

    }
}
