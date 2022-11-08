package day_7_aritmetic_operators;

public class Example {

    public static void main(String[] args){

        //Örnek: Ali fizik dersinden 92, kimya dersinden 55, matematik dersinden 89 almıştır.
        //1.Ali’nin not ortalaması kaçtır?
        //2. Ortalama sınıf geçme notu 80 üzeri olduğuna göre Ali’nin sınıfı geçti ise ekrana
        // true geçmedi ise false yazdırın.
        //(ipucu:  boolean sonuc= ortalama>80)
/*
double fizik=92,kimya=55,matematik=89;
double ortalama=(fizik+kimya+matematik)/3;
System.out.println("Ali'nin Not Ortalaması: "+ortalama);
boolean sonuc=ortalama>80;

     //   System.out.println("Ali sınıfı geçti mi: "+(ortalama>80));
     System.out.println("Ali sınıfı geçti mi: "+sonuc);

        //Örnek: Toplantı salonunda 15 adet sıra ve her sırada
        // 12 adet koltuk vardır. Toplantıya 113 katılmıştır.
        //1.Toplantı salonun toplam kapasitesi nedir?
        //2.Kaç adet boş koltuk vardır ?
        //3.Kaç adet sırada oturulmaktadır ?
        //4. Kaç sıra tamamen boş kalmıştır.
        //5.Oturulan sıralarda kaç adet boş koltuk vardır?

        int sira=15;
        int siradakiKoltukSayisi=12;
        int katilimci=113;

        int toplamKapasite=sira*siradakiKoltukSayisi; //1
        int bosKoltuk=toplamKapasite-katilimci; //2
        int oturulanSiraSayisi=katilimci/siradakiKoltukSayisi+1; //3
       // System.out.print(Math.ceil(3.1));
        int bosSira=sira-oturulanSiraSayisi; //4
        int oturulanSiralardakiBosKoltukSayisi=12-(katilimci%12);



   //Örnek: 31502 toplamSaniye kaç saat kaç dakika kaç saniyedir?
        //(1 saat 60 dakika 1 dakika 60 sn)
        //1 saat 3600 sn
        int toplamSaniye=31502;
        int saat=toplamSaniye/3600;
        int dakika=(toplamSaniye-saat*3600)/60;
        int saniye=toplamSaniye -(saat*3600+dakika*60);

        System.out.print(saat+" - "+dakika+" - "+saniye);
*/
        //2. çözüm

        int toplamSaniye=31502;
        int saat=toplamSaniye/3600;
        int dakika=toplamSaniye%3600/60;
        int saniye=toplamSaniye%60;



        System.out.print(saat+" - "+dakika+" - "+saniye);






    }
}
