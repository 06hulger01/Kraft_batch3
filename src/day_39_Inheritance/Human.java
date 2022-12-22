package day_39_Inheritance;
//multi level inheritance
public class Human {

    public void name(){
        System.out.println("İsmi vardır");
    }
}
class Man extends Human{
    public void role(){
        System.out.println("Baba olurlar");
    }
}
class Child extends Man{
    public void activity(){
        System.out.println("oyun oynarlar");
    }
}

class test{
    public static void main(String[] args) {
        Child child = new Child();

        child.activity();
        child.role();
        child.name();

        Man man = new Man();
        man.role();
        man.name();
//        man.activity(); //erişemez

        Human human = new Human();
        human.name();
//        human.role(); //erişemez
//        human.activity(); //erişemez


    }
}
