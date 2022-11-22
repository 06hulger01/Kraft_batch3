package day_17_Methods;

import java.util.Scanner;

public class Day_16_Summary {
    public static void main(String[] args) {
/*
        System.out.println("program başaladı");

        for (int i = 1; i <=10 ; i++) {

            System.out.println(i+" merhaba");
           continue;

        }

        System.out.println("program sonlanıyor");
*/
/*

        System.out.println("program başladı");

      disLoop:  for (int i = 0; i <3 ; i++) {
            System.out.println("dış loop");
         icLoop:   for (int j = 0; j < 2; j++) {
                        if(j==1){
                            continue disLoop;
                        }
                        System.out.println("iç loop");

                     }

        }
        System.out.println("program sonlandı");

*/


        //banka menüsü 1 hesabımdaki parayı görme
           //          2 para ekleme
           //          3 kart iade
            // para ekleme
                     //  1 havale
                    //   2 eft
                    //   3 bir önceki menüye dön
                    //   4 kart iade

        /*
        Scanner scan=new Scanner(System.in);
        int para=2000;
     firstLoop:   while (true){
            System.out.println("Bankamıza hoş geldiniz");
            System.out.println("yapmak istediğiniz işlemi seçiniz?");
            System.out.println("1 hesabımdaki parayı görme");
            System.out.println("2 para ekleme");
            System.out.println("3 kart iade");

            int x= scan.nextInt();

            if(x==1){
                System.out.println("bankadaki hesabınızdaki para miktarı : "+para);
            }else if(x==2){

               while(true){
                    System.out.println("Para ekleme sayfasına hoş geldiniz");
                    System.out.println("1 EFT");
                    System.out.println("2 HAVALE");
                    System.out.println("3 Bir Önceki menüye dön");
                    System.out.println("4 Kart iade");
                    System.out.print("secim: ");
                    int secim=scan.nextInt();
                    if(secim==1){
                        System.out.println("eft yapıldı");
                    }else if(secim==2){
                        System.out.println("havale yapıldı");
                    }else if(secim==3){
                        break;  //continue firstLoop;
                    }else if(secim==4){
                        break firstLoop;
                    }else{
                        System.out.println("hatalı giriş");
                        continue firstLoop; //break;
                    }
                }

            }else if(x==3){
                break;
            }else {
                System.out.println("hatalı giriş");
            }



        }

*/

        int j=15;

       firsLoop: for(int i=0; i<10; i++){
            System.out.println(i+" i");
            for (; true ; ) {
                System.out.println(j);
                j++;
                if(j==20){
                    continue firsLoop;
                }
                if(j==22){
                    break firsLoop;
                }
                System.out.println("merhaba");
            }



        }









    }
}
