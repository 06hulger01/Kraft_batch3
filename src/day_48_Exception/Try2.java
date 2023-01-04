package day_48_Exception;

public class Try2 {

    public static void main(String[] args) {

        try{
            System.out.println("selam size hata otması ihtimal kodun ustunden");
            int i = 10/0;
            System.out.println("selam");

        }catch(ArithmeticException e){
            System.out.println("hata alındı");
        }
        finally {
            System.out.println("final block kodları");
        }
        System.out.println("devam eder");


    }
//    try catch blokları mutlaka bir method içinde olması gerekiyor
//    --it must be used in method
//    try block u içindeki hata atan satırdan sonraki satırlar yurutulmez
//    --if an exception acours at the any time statement in try block, rest will not execute
//    hata atlırsa catch block u yürütülür/ aksi halde catch blocku içinde ki kodlar execute edilmez.
//    --catch block is used to handle the exception. İf an object of exception class thrown the codes which
//        are in catch block will excute

}
