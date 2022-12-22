package day_38_Static.staticClass;


public class Outer {

    //outer nesne
    static class Nested {
        public static void message(){
            System.out.println("selam static nested classdan");
        }
    }

    class Inner{

        //selam nesnesi burda
        public void message2(){
            System.out.println("selam Inner class dan");
        }
    }

}
class main{
    public static void main(String[] args) {
        Outer.Nested.message();

//        Outer outer = new Outer();
//        Outer.Inner selam = outer.new Inner();

        Outer.Inner selam = new Outer().new Inner();// yukarıdaki 2 satırın tek satırda hali

        selam.message2();





    }
}
