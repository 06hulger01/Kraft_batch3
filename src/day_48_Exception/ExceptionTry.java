package day_48_Exception;

public class ExceptionTry {
    public static void main(String[] args) {

        System.out.println("test suit started");
        System.out.println("Test1 started");
        System.out.println("Test2 started");
        try{
            int array[] = {1,2,3};
            int i = array[3];
        }catch(Exception e){
            System.out.println("gelen deger index dısında");
        }
        System.out.println("Test3 started");
        System.out.println("Test4 started");
        System.out.println("Test5 started");
        System.out.println("test suit ended");

//        exception normal program akışının kesintiye ugraması
//        distrupts the normal flow
//        abnormal caondition



    }
}
