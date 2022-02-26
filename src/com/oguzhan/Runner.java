package com.oguzhan;

public class Runner {
    public static void main(String[] args) {

        Mudur mudur = new Mudur();
        mudur.maas = 19000;
        mudur.odemeYap("Şube Müdürü");
        mudur.odemeYap("İnsan Kaynakları Müdürü");
        mudur.odemeYap();
        //--------------------------------
        Muhendis muhendis = new Muhendis();
        muhendis.maas = 16500;
        muhendis.odemeYap();
        //--------------------------------
    }
}
