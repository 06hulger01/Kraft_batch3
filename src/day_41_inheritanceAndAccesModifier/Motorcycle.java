package day_41_inheritanceAndAccesModifier;

public class Motorcycle extends Vehicle{
   int cc;
    public Motorcycle(String model){
        super(model);
    }
   public void changeCc(int cc){
       this.cc=cc;
      getModel();
   }
   public void start(){
    System.out.println("Motorcycle çalıştı");

  }

}
