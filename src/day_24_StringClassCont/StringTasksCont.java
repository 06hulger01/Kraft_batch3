package day_24_StringClassCont;

public class StringTasksCont {

    public static void main(String[] args) {
//        System.out.println(trim("     merhaba dünya      "));
//        System.out.println(dateStamp("18/10/2022 20:50:55"));
//        System.out.println(findFirstCharInSecond("şeyma", "çalışkan çalışkan"));
//        System.out.println(countY("javaYı Seviyor muyum?"));
//        System.out.println(sesliHarfler("iyi bir ütü varm"));
//        searchWord("Sevgi bahçeleri konusu bence one alınmalı");
//        System.out.println(threeLast3("özlem", 5, 2));
        System.out.println(middleThree("cengiz"));
        System.out.println(middleThree("ferid"));
    }

    //task7
//    Bir method yazın ve verilen string in önünde ve arkasında
//boşluk varsa boşlukları alıp geri döndürsün.
    public static String trim(String str) {
        return str.trim();
    }

    //task8
//    18/10/2022 20:50:55 tarih bildirimini tarih damgasına
//    döndürün 18102019145055
//          18102022 205055
    public static String dateStamp(String str) {
        //way1
//        String repl = str.replace("/", "");
//        String repl2 = repl.replace(":", "");
//        String replace = repl2.replace(" ", "");
//        return replace;

        //way2
        return str.replace("/", "")
                .replace(":", "")
                .replace(" ", "");
    }


//Basit bir yapay zeka tasarlayın bir method ile kullanıcıdan bir
//cümle alsın ikinci bir method ile girilen cümlede letter dışında
//bir değer(3-5 - +) varmı onu kontrol etsin.
// +
// letter dısındaki değerleri bir string de store edip dondursun(ödev)


//task9
//    Kullanıcıdan 2 kelime yazmasını isteyin ilk kelimenin baş harfi
//    2. kelimede varsa index ini alın.
    public static int findFirstCharInSecond(String str, String str2) {
        return str2.indexOf(str.charAt(0));
    }
//task10
//    "javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren
//    bir program yazın.

    public static int countY(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y' || str.charAt(i) == 'Y') {
                count++;
            }
            //        way2
//            if (str.toLowerCase().charAt(i)=='y'){
//                count++;
//            }
        }
        return count;

//        way3
//        return str.length() - str.replace("y","")
//                .replace("Y","")
//                .length();

//        way4
//        return str.length() - str.toLowerCase()
//                .replace("y","")
//                .length();


    }

//task11
//    Aldığınız mesajın sesli harflerini a,e,i formatında konsola
//    yazdırın.

    public static String sesliHarfler(String str) {
        String holder = "";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'ü', '0', 'ö', 'ı':
                    if (i != str.length() - 1) {
                        holder += str.charAt(i) + ",";
                    } else {
                        holder += str.charAt(i);
                    }
            }
        }
        return holder.substring(0, holder.length() - 1);// sondaki virgülü alır.
        //substring()
    }

    //task12
//        Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini
//        isteyin cümle içinde sev köküne sahip bir kelime var ise bir
//        method what a lovely person(ne hoş bir insan) mesajı
//        döndürsün.
    public static void searchWord(String str) {
        if (str.toLowerCase().contains("sev")) {
            System.out.println("ne güzel bir insan");
        } else {
            System.out.println("ok");
        }
    }

//task13
//    İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static String threeLast3(String str, int i, int t) {
        String holder = "";
        for (int j = 0; j < i; j++) {
            holder += str.substring(str.length() - t);
        }
        return holder;
    }

    //task14
//    İsminizin ortadaki 3 harfini veren bir method yazın. Length i çift sayı
//olan string değerleri dikkate almayın
    public static String middleThree(String str) {
        return str.substring(str.length()/2-1,str.length()/2+2);
    }
}
