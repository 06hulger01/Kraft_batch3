package day_44_Interfaces;

public abstract class B implements A {
    int a;

    @Override
    public void M1() {

    }
    @Override
    public void M2() {

    }
    @Override
    public void M3() {

    }

    public void M10(){}
    //Abstract class içinde normal body li method herhangi bir implementsyon zorunluluüu oluşturmaz
}
class C extends B {

    @Override
    public void M2() {

    }
    @Override
    public void M1() {

    }

    @Override
    public void M4() {

    }

    @Override
    public void M5() {
        //Interface içerisinde body si olan bir method override zorunluluğu yok ama override kısıtlaması da yok
        super.M5();
    }
}
