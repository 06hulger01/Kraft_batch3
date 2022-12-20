package day_37_Constructor_Encapsulation;

public class KraftBank {

    String musteriAd;
    int hesapNo;
    double bakiye;

   // public KraftBank(String musteriAd){
     //   this.musteriAd=musteriAd;
    //}
    public  KraftBank(String musteriAd,int hesapNo){
        this.musteriAd=musteriAd;
        this.hesapNo=hesapNo;
    }
    public  KraftBank(String musteriAd,int hesapNo,double bakiye){
        this(musteriAd,hesapNo);
     //   this.musteriAd=musteriAd;
     //   this.hesapNo=hesapNo;
        this.bakiye=bakiye;
    }

    public double paraEkle(double para){
        this.bakiye+=para;
        return this.bakiye;
    }
    public double paraCek(double para){
        if(this.bakiye<para){
            System.out.println("Sayın "+this.musteriAd+" bakiyeniz yetersiz");
            return this.bakiye;
        }
        this.bakiye-=para;
        return this.bakiye;
    }




}
