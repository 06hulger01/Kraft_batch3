package day_38_Static.staticMethod;

public class Candidate {
    String name;
//    int schoolID;
    String schoolID;
   static String branch;
   static int counter;

    public Candidate(String name) {
        this.name = name;
        this.schoolID = setNumber2();
    }
    public static int setNumber(){
        counter++;
        return counter;
    }
    public static String setNumber2(){
        counter++;
//        return "000"+counter;
        return String.format("%07d",counter);
    }
    public static void setBranch(String str){
        branch = str;
    }


    public void getInfo() {
        System.out.println("name=" + name);
        System.out.println("schoolID=" + schoolID);
        System.out.println("Branch=" + branch);
    }
}
class main3{
    public static void main(String[] args) {
        Candidate.setBranch("JAVA");
        Candidate st1 = new Candidate("Ferid");
        Candidate st2 = new Candidate("Alperen");
        Candidate st3 = new Candidate("Özlem");

        st1.getInfo();
        st2.getInfo();
        st3.getInfo();

    }
}

