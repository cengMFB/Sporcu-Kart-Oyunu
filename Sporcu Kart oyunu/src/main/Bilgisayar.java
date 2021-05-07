
package main;

import java.util.ArrayList;

/**
 *
 * @author recep
 */
public class Bilgisayar extends Oyuncu {

    Test newJFrame = new Test();
    private String oyuncuID;
    private String oyuncuAd;
    private int skor;

  
    @Override
 public void kartSec(Test newJFrame) {
        this.newJFrame = newJFrame;
        newJFrame.getBortayabilgisayar().setVisible(true);
        
    }

    public Bilgisayar() {
    }
  


    public Bilgisayar(String oyuncuID, String oyuncuAd, int skor) {
        super(oyuncuID, oyuncuAd, skor);

    }
}
