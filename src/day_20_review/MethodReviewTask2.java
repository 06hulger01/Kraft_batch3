package day_20_review;

import java.util.Scanner;

public class MethodReviewTask2 {
//    Konsoldan kullanıcıdan 2 sayı almanızı sağlayan bir
//metodu çağırın. İkinci sayı 3 ün katı olan bir sayı değilse,
//başka bir metodtan geçirin ve 3. katı olacak şekilde size
//döndürsün. Sonra bu sayıları kabul eden başka bir
//metotla da sayıları toplayın.

    public static void main(String[] args) {
//        startProcess();
//        sumOfNums(5,makeMultipleOfThree(4));

        startProcess("dugun kartı için ismlerinizi giriniz");
    }

    public static void startProcess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("2 sayı giriniz");
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();
        if (sayi2%3!=0){
            sumOfNums(sayi1,makeMultipleOfThree(sayi2));

        }else{
            sumOfNums(sayi1,sayi2);
        }
    }
    public static int makeMultipleOfThree(int a){
        int multipleOf3;
        if (a%3>1){
            multipleOf3=a+1;
        }else{
            multipleOf3=a-1;
        }
        return multipleOf3;
    }
    public static void sumOfNums(int a, int b){
        System.out.println(a+b);
    }



  public static void startProcess(String message){
      Scanner sc = new Scanner(System.in);
      System.out.println(message);
      String s = sc.nextLine();
      String s2 = sc.nextLine();
      if (s.equals(s2)){
          goingProcess();
      }else{
          goingProcess(s,s2);
      }
  }
  public static void goingProcess(){
      String s = "gitmiş olduğunuz kelimeler aynı farklı kelime giriniz";
      startProcess(s);
  }
  public static void goingProcess(String a, String b){
      System.out.println("------------------------");
      System.out.println("*****"+a+" ve "+b+ "******");
      System.out.println("kasımda guzel bir gunde");
      System.out.println("mutlu gunumuzde sizi bekleriz");
      System.out.println("----------------------------");
  }

}
