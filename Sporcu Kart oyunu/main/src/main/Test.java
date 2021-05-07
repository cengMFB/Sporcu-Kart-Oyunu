package main;

import java.util.ArrayList;


public class Test {

   

    public static void main(String[] args) {
        Futbolcular ozan = new Futbolcular("OZAN TUFAN", 80, 99, 73);
        Futbolcular messi = new Futbolcular("LİONEL MESSİ", 95, 90, 97);
        Futbolcular ronaldo = new Futbolcular("CRISTIANO RONALDO", 92, 95, 92);
        Futbolcular neymar = new Futbolcular("JR NEYMAR", 92, 90, 92);
        Futbolcular lewandowski = new Futbolcular("ROBERT LEWANDOWSKİ", 91, 88, 95);
        Futbolcular salah = new Futbolcular("MOHAMMED SALAH", 92, 94, 94);
        Futbolcular mane = new Futbolcular("SADİO MANE", 90, 94, 93);
        Futbolcular suarez = new Futbolcular("LUİS SUAREZ", 95, 90, 94);

        Basketbolcular lebron = new Basketbolcular("LEBRON JAMES", 95, 96, 97);
        Basketbolcular curry = new Basketbolcular("STEPHAN CURRY", 93, 94, 97);
        Basketbolcular durant = new Basketbolcular("KEVIN DURANT", 94, 94, 99);
        Basketbolcular vesely = new Basketbolcular("JAN VESELY", 85, 76, 88);
        Basketbolcular boby = new Basketbolcular("BOBY DİXON", 82, 84, 85);
        Basketbolcular decolo = new Basketbolcular("NANDO DE COLO", 89, 90, 90);
        Basketbolcular harden = new Basketbolcular("JAMES HARDEN", 92, 93, 96);
        Basketbolcular gasol = new Basketbolcular("PAU GASOL", 90, 91, 92);

     

        ArrayList<Futbolcular> futbolcular = new ArrayList<>();
        futbolcular.add(ozan);
        futbolcular.add(messi);
        futbolcular.add(ronaldo);

        futbolcular.add(neymar);
        futbolcular.add(lewandowski);
        futbolcular.add(salah);
        futbolcular.add(mane);
        futbolcular.add(suarez);

        ArrayList<Basketbolcular> basketbolcular = new ArrayList<>();
        basketbolcular.add(lebron);
        basketbolcular.add(curry);
        basketbolcular.add(durant);
        basketbolcular.add(vesely);
        basketbolcular.add(boby);
        basketbolcular.add(decolo);
        basketbolcular.add(harden);
        basketbolcular.add(gasol);

        System.out.println(basketbolcular.get(6).getSerbestAtış());
        Kullanıcı kullanıcı = new Kullanıcı("1", "player", 0);
        Bilgisayar bilgisayar = new Bilgisayar("2", "computer", 0);

        int boyut = futbolcular.size();
        ArrayList<Futbolcular> geçici = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            int kartListe = (int) (Math.random() * boyut);
            geçici.add(futbolcular.get(kartListe));
            futbolcular.remove(kartListe);
            kullanıcı.futbolcuListeEkle(geçici);

            boyut--;


        }


        System.out.println();
        ArrayList<Futbolcular> geçici1 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            geçici1.add(futbolcular.get(i));
            bilgisayar.futbolcuListeEkle(geçici1);


        }
        System.out.println();
        boyut = basketbolcular.size();
        ArrayList<Basketbolcular> geçici2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            int kartListe = (int) (Math.random() * boyut);
            geçici2.add(basketbolcular.get(kartListe));
            basketbolcular.remove(kartListe);
            kullanıcı.basketbolcuListeEkle(geçici2);
            boyut--;


        }
        System.out.println();
        ArrayList<Basketbolcular> geçici3 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {

            geçici3.add(basketbolcular.get(i));
            bilgisayar.basketbolcuListeEkle(geçici3);


        }

        for (int i = 0; i < 4; i++) {
            System.out.println(kullanıcı.getFutbolcularListe().get(i).getIsim());
        }
        System.out.println("******");
        for (int i = 0; i < 4; i++) {
            System.out.println(kullanıcı.getBasketbolcularListe().get(i).getIsim());
        }
        System.out.println("*******");
        for (int i = 0; i < 4; i++) {
            System.out.println(bilgisayar.getFutbolcularListe().get(i).getIsim());
        }

        System.out.println("********");
        for (int i = 0; i < 4; i++) {
            System.out.println(bilgisayar.getBasketbolcularListe().get(i).getIsim());
        }

      

       
    }
}
