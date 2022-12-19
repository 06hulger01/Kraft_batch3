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


    public boolean sinifiGectiMi(){
        if(yilSonuNotu<65){
            return false;
        }
            return true;
    }

    public int getOgrenciYili(){
     //   String str=String.valueOf(okulNo);
        return  2000+Integer.parseInt(String.valueOf(okulNo).substring(0,2));

    }

}
