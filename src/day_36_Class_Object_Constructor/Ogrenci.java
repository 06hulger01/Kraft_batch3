package day_36_Class_Object_Constructor;

public class Ogrenci {
    String okul="İstanbul Ünversitesi";
    String tc;
    int okulNo; // 2221236125
    String ad;
    String soyad;
    int bolumNo;
    int fakulteNo;
    double yilSonuNotu;

    public Ogrenci(String ad,String soyad,String tc){
      this.ad=ad;
      this.soyad=soyad;
      this.tc=tc;
    }
    public Ogrenci(){

    }

    public Ogrenci(String ad){
        this.ad=ad;
    }

    public  boolean sinifiGectiMi(){
        if(this.yilSonuNotu<65){
            return false;

        }
            return true;
    }

    public int getOgrenciYili(){
     //   String str=String.valueOf(okulNo);
        return  2000+Integer.parseInt(String.valueOf(okulNo).substring(0,2));

    }

}
