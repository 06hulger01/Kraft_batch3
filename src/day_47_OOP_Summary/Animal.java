package day_47_OOP_Summary;

public class Animal {

   public  String name;
   public String gender;
  public  int age;
     int count=5;
    public Animal(){

    }
    Animal(String name){
        this.name=name;
    }
    public void sleep(){
        System.out.println("hayvan uyuyor");
    }
    public static void eat(){
        System.out.println("hayvan yemek yiyor");
    }


}
