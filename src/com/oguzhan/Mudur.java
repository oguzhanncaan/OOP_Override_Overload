package com.oguzhan;

public class Mudur extends Personel{

    /**
     * Üst sınıftan miras alınan ve değiştirilmesi gerekli olan methodların
     * kodlanmasına Override --> Methodun ezilmesi adı verilir.
     * Method üzerinde @Override anatasyonu eklenir.
     * Zorunluluk yoktur ancak ezilme işlemi yapıldığı belirtilmelidir.
     */
    @Override
    public void odemeYap(){
        maas = maas * 1.13; // mudurluk tazminatı
        System.out.println("Müdür e ödeme yapıldı: " +maas);
    }
    /**
     * Overload --> Bir methodun aşırı yüklenmesi!!!
     * Aslında mantık method aynı kalıp ile defalarca kullanıldığında ortaya çıkar.
     */
    public void odemeYap(String mudurTipi){
        if (mudurTipi.equals("Şube Müdürü")){
            maas = maas * 1.29;
        }else if(mudurTipi.equals("İnsan Kaynakları Müdürü")){
            maas = maas * 1.26;
        } else {
            maas = maas * 1.13;
        }

        System.out.println("Müdür maaşı: " +maas);
    }

    public void odemeYap(int mudurYili){

    }

    /**
     * DİKKAT!!!!
     * Değişkenin adının değişmesi methodun değiştiği anlamına gelmez.
     * Değişken tipinin değişmesi lazım.!!!!!
     */
}
