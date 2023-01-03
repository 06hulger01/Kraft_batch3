package day_47_OOP_Summary;

import day_47_LibraryManagement.Personel;

public class OOP_Summary {
    String name;
   private String tc;
   static int count=10;
   static {
       count++;
   }
    OOP_Summary(String name,String tc){
        this.name=name;
        this.tc=tc;


    }
    public String getTc(){
        return this.tc;
    }
    public  void setTc(String tc){
        this.tc=tc;
    }
    public static String reverseTc(String tc){

        String str="";
        for (int i = tc.length()-1; i >= 0; i--) {
           str+=tc.charAt(i);
        }
        return str;
    }






    Personel OOP_Summary(Personel personel){
     Personel personel1= personel;
        return personel1;
    }

   public void setName(String name){
        this.name=name;
    }
}
