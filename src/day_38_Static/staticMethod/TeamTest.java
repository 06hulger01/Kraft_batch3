package day_38_Static.staticMethod;

public class TeamTest {

    public static void main(String[] args) {
        Team member1 = new Team("Vena");
        Team member2 = new Team("Mustafa");
        Team member3 = new Team("Özlem");

        Team.teamChangeTo(2);
        Team.team=3;

        member1.getInfo();
        member3.getInfo();
        member2.getInfo();

        TeamTest nesne = new TeamTest();

        nesne.method();//1

        TeamTest.method();//2

        method();//3 en uygun çaşırma şekli budur

    }
    public static void method(){
        System.out.println("this is a static method");
    }


}
