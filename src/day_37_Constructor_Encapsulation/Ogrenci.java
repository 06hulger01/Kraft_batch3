package day_37_Constructor_Encapsulation;

public class Ogrenci {

   private String ad;
   private int okulNo;
  private   String tc;

  public Ogrenci(String tc){
      this.tc=tc;
  }

  public String getAd(){
      return  this.ad;
  }
  public void setAd(String ad){
      this.ad=ad;
  }
  public void setOkulNo(String sifre,int okulNo){
      if("Ankara88".equals(sifre)){
          this.okulNo=okulNo;
      }else {
          System.out.println("şifre hatalıdır.");
      }
  }

  public int getOkulNo(){
      return this.okulNo;
  }




}
