package day_38_Static.staticMethod;

public class Team {

    static int team;

    String name;

    public Team(String name) {
        this.name = name;
    }
    public static void teamChangeTo(int i){
        team=i;
    }


    public void getInfo() {
        System.out.println("Team{" +
                "name='" + name + '\'' +
                "team= '"+team+
                '}');
    }
}
