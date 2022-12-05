package day_26_String_Lab;

public class String_Lab_1 {

    //Soru 1:Kullanıcıdan bir input alın ve inputun ilk 3 harfini ekrana yazdıran programı
    //yazınız
    //Not: 3 harfden daha az ise inputun kendini ekrana getrirecek metodu yazınız.
    //methotName(String str)
  //Merhaba  Mer
    //Ali Ali
    //Al  Al

    public static String firstThreeLetters(String str){

        if(str.length()<=3){
            return str;
        }
        return str.substring(0,3);

    }
//Dinamik bir kod yazalım kullanıcı kaç harf döndürmek istiyor.
    public static String firstLetters(String str,int harfSayisi){


        if(str.length()<=harfSayisi || harfSayisi>=str.length() ){
            return str;
        }

        return str.substring(0,harfSayisi);

    }

    //Soru 2: Kullanıcıdan bir dize sözcük alın ve bu sözcükteki tüm boşluklara
    // % karakterini atayın
   // harun bey merhabalar nasılsınız
    //harun%bey%merhabalar%nasılsınız

public static String insertLetters(String str){

      return str.replace(" ","%");

}
    //metodumuzu dinamikleştirelim
    public static String insertLetters(String str,String target,String param){

        return str.replace(target,param);

    }

    //Soru 3: Kullanıcın girdiği kelimenin ilk yarısını döndüren metodu yazınız.uzunluk tek ise bir üstünü de
    //döndürsün ; Harun Har  - emel   em  - kalemKağıt  Kalem-  kalem kal

    public static String firstHalfLetters(String str){

        if(str.length()%2==0){
            return str.substring(0,str.length()/2);
        }

            return str.substring(0,str.length()/2+1);

    }

    public static String firstHalfLetters2(String str){

        return str.substring(0,(int)Math.ceil((double) str.length()/2));

    }

    // Soru 4:Kullanıcıdan bir kelime alın ve bu kelimenin harflerin 3 defa ardı ardına yazdırın
    // harun   hhhaaarrruuunnn        ankara  aaannnkkkaaarrraaa

    public static String returnThreeLetters(String str){

        //h a r u n
        //0 1 2 3 4
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <3 ; j++) {
              //  result=result+str.charAt(i);
                result+=str.substring(i,i+1);

            }

        }
        return result;

    }
    public static String returnThreeLetters(String str,int donusSayisi){

        //h a r u n
        //0 1 2 3 4
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <donusSayisi ; j++) {
                //  result=result+str.charAt(i);
                result+=str.substring(i,i+1);

            }

        }
        return result;

    }

    //Soru 5: Kullanıcıdan bir kelime ve bir karakter alın ve bu karakterin kelimenin içerisinde
    //kaç adet olduğunu bulun? (Büyük küçük harf önemsiz)  Ankara ,a   3   Emel,e 2


    public static int howManyLetters(String str, String letter){
        int result=0;

        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i,i+1).equalsIgnoreCase(letter)){
                result++;
            }
        }
        return result;
    }

    public static int howManyLetters2(String str, char letter){
        int result=0;
        String a= String.valueOf(letter);

        for (int i = 0; i <str.length() ; i++) {
            if(str.substring(i+i+1).equalsIgnoreCase(String.valueOf(letter))){
                result++;
            }
        }
        return result;
    }




    //Soru 6: birsayının polindrom olup olmadığını kontrol eden bir metod yazınız?
      //  101  true 105 false  1221 true 1223 false

    public static boolean isPolindrome(int sayi){
//tersinin kendisine eşit olup olmadığını kontrol ediyoruz
        String str= String.valueOf(sayi);
        String result="";
        for (int i=str.length()-1; i>=0; i--){   //4 3 2 1 0
            result+=str.charAt(i);               //n u r a h

        }

            return str.equals(result);
    }
    public static boolean isPolindrome(String str){
//tersinin kendisine eşit olup olmadığını kontrol ediyoruz

        String result="";
        for (int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);

        }

        return str.equals(result);
    }


    //Soru 7: soruKullanıcıdan bir kelime ve bir arama kelimesi alın  ve bu  kelimenin içerisinde
    //kaç adet arama kelimesi olduğunu bulun? (Büyük küçük harf önemsiz)  Ankaran ,an   2   Emel,el 1

    public static  int howmanyletters2(String str, String target){
        int result=0;

        //0123456
        //Ankaran________     ankara
        //                       7    - 6=1
        for (int i = 0; i <str.length()-target.length()+1 ; i++) {
            if(str.substring(i,i+target.length()).equalsIgnoreCase(target)){
                result++;
            }
        }
        return result;

    }

    public static void main(String[] args) {
     /*int a=12345;
       String str=String.valueOf(a);
        System.out.println(str);

        String b="12456";
        System.out.println(Integer.parseInt(b)/2);
*/

        System.out.println(howmanyletters2("ankaran","ankara"));


    }


}
