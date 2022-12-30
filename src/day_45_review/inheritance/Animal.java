package day_45_review.inheritance;

public class Animal {

    int t=10;

    public static void method(){
        System.out.println("method from animal");
    }


}
class Bird extends Animal{

    int t =20;

    public static void method(){
        System.out.println("method from Bird");
    }
}

class MainHiding{
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.method();

//        Bird bird = new Bird();
//        bird.method();
//        System.out.println(bird.t);

        Animal bird = new Bird();
        bird.method();
        System.out.println(bird.t);


    }
}
