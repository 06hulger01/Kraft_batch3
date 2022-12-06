package day_27_String_Lab_Cont;

public class String_Lab_Cont_2 {

  // soru 10: Kullanıcan bir kelime ve bir harf alın kelimenin içerisindeki
    // bu harflerin tümünü temizleyin Merhaba,a   Merhb
public  static String harfTemizle(String str, String target){
    return str.replace(target,"");
}


//soru 11: kullanıcıdan 2 kelime alın 2. kelimenin 1. kelimenin başından
// veya ilk karakterden sonra gelip gelmediğini kontrol edin
// Kinlenmek kin true
// "kin tutmak", "kin"  true
// Ekin ektim çöllere "kin" true
// Keskin sirke küpüne zarar,kin false

//ekin
    public static boolean message(String str,String a){

        return str.substring(0,a.length()+1).contains(a);
    }

    public static boolean message2(String str,String a){
        if (str.length()<2){
            return false;
        }
        return str.startsWith(a)||str.substring(1).startsWith(a);
    }

   // kullanıcıdan 2 kelime alın uzun kelimeyi başta 2 defa yazdırın kısa keimeyi
    // ortada 10 defa uzun kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    // ("mehmet","Ayşe") mehmetmehmetAyşeAyşe...........AyşeMehmetMehmet
    public static String ikiDefa(String a,String b){
        String result="";
        if(a.length()>=b.length()){
            result=a+a;
            for (int i = 0; i <10 ; i++) {
                result+=b;
            }
            result=result+a+a;
        }
        else{
            result=b+b;
            for (int i = 0; i <10 ; i++) {
                result+=a;
            }
            result=result+b+b;
        }return result;

    }


//------------------------------------------
    //kullanıcıdan bir kelime alın ve ilk 3 karakterini yazdırın 3 karakter
    // ve altında ise kelimeyi aynen yazsın
    // sonrasında gelen karakterler için ..... yadırın
    // örnek. Merhaba   Mer....
    // örnek  Pi     Pi
    // örnek Ahmet   Ahm..

    public static String ilk3Harf(String kelime) {

        String result = "";
        if(kelime.length()<=3){
            return kelime;
        }
        for (int i = 0; i < 3; i++) {
            result+=kelime.charAt(i);
        }
        for (int i = 3; i < kelime.length(); i++) {
            result+=".";

        }
        return result;
    }
    public static String ilk3Harf2(String kelime) {

        String result = kelime.substring(0,3);


        if(kelime.length()<=3){
            return kelime;
        }
        for (int i = 0; i < kelime.length()-3; i++) {
            result+=".";
        }
        return result;

    }

    //Kullanıcıdan bir kelime alın ve bu kelimenin
    // ilk 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.(büyük harf dikkat
    // edilmeyecek)
    //ankara false
    //Kafka  true

    public static boolean wordEndTwo(String str1){
        return str1.substring(0,2).equalsIgnoreCase(str1.substring(str1.length()-2));

    }
    public static boolean wordEndTwo2(String str1){
        return str1.endsWith(str1.substring(0,2));
    }
    public static boolean wordEndTwo3(String str1){
        return str1.startsWith(str1.substring(str1.length()-2));
    }

    public static void main(String[] args) {


    }

}
