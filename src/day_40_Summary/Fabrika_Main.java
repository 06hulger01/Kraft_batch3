package day_40_Summary;

public class Fabrika_Main {

    public static void main(String[] args) {

       /* Fabrika fabrika_3=new Fabrika("Aselsan");
        System.out.println(fabrika_3.fabrikaAdi);
        System.out.println(fabrika_3.depolamaAlani);
        System.out.println(fabrika_3.isciSayisi);
        fabrika_3.metreKareBasiOran();
        hareketEt();*/

       /* KraftBank musteri_1=new KraftBank(12334,"harun",false,500);
        System.out.println(musteri_1.getcustomerAccount("asd"));
        System.out.println(musteri_1.getCustomerId());
        System.out.println(KraftBank.staticDegisken);
        System.out.println(Math.PI);

        System.out.println(Math3.min(30, 40));
        System.out.println(Daire.cevreHesapla(2));
        Daire daire=new Daire(2);
        System.out.println(daire.getCevre());

        Daire daire_1=new Daire(8);
        Daire daire_2=new Daire(2);

        System.out.println();
*/


      /*  A a1=new A();
        A a2=new A();
        A a3=new A();
        A a4=new A(4);
        A a5=new A(3);
        A a6=new A();
        System.out.println(A.count);*/

        KraftBank musteri=new KraftBank(11,"Harun",false);
        musteri.addMoney(500);
        musteri.addMoney(500);
        System.out.println(musteri.getcustomerAccount("11ha1"));

    }
    public static void hareketEt(){
        System.out.println("hareket edildi");
    }


}
