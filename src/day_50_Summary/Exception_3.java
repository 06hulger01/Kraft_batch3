package day_50_Summary;

public class Exception_3 {
    public static void main(String[] args) {

        System.out.println("Program başladı");
        try {
            int x=5;
            int y=0;
            int z=x/y;
            System.out.println(z);
            System.out.println("----------sorun yok aferim böyle devam et-----");
        }catch (java.lang.Exception e){

        }
        finally {
            System.out.println("finally bloğu çalıştı");
        }

        System.out.println("program devam ediyor");
    }
}
