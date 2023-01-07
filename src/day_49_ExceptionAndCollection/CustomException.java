package day_49_ExceptionAndCollection;

public class CustomException extends ArithmeticException{


    public CustomException(String message) {
        super(message);

    }
}
class customExceptionTry{

    public static void check(int length){
        if (length<170){
            throw new CustomException("katılmaz");
        }else{
            System.out.println("approved");
        }
    }

    public static void main(String[] args) {
        check(169);
    }

}
