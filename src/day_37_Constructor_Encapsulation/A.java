package day_37_Constructor_Encapsulation;

public class A {
    int x;
    int y;

    public A(){
        System.out.println("Obje oluşturuldu");
    }
    public A(int x){
        this();
        this.x=x;
    }
    public A(int x,int y){
        this(x);
        this.y=y;
    }

    public void b(){
        System.out.println("b metodu çalıştı");
    }
    public int setX(int x){
        this.b();
        this.x=x;
        return this.x;

    }


}
