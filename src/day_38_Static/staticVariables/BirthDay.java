package day_38_Static.staticVariables;

public class BirthDay {

    static int cakeSlice = 26;

    public void takeSlice(){
        cakeSlice--;
    }
    public void takeSlice(int count){
        cakeSlice-=count;
    }

}
