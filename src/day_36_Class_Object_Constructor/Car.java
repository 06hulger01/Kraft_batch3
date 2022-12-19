package day_36_Class_Object_Constructor;

public class Car {
    String saseNo;
    String marka;
    int hiz;

    public Car(String saseNo){
     this.saseNo=saseNo;
    }
    public Car(){
    }
    public Car(String saseNo,String marka){
        this.saseNo=saseNo;
        this.marka=marka;
    }
    public Car(int hiz){
        this.hiz=hiz;
    }
    public Car(String saseNo,String marka,int hiz){
        this.saseNo=saseNo;
        this.marka=marka;
        this.hiz=hiz;
    }

}
