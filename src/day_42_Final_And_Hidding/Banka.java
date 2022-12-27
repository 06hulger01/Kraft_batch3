package day_42_Final_And_Hidding;

public  class Banka {
    int faiz=20;
    int dosyaMasrafi;

   void faizHesapla(){
        faiz=faiz+(faiz*5)/100+dosyaMasrafi;

    }
}
