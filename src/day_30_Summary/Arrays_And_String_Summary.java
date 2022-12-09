package day_30_Summary;

import java.util.Arrays;
import java.util.Locale;

public class Arrays_And_String_Summary {
/*
    public static void main(String[] args) {
/*
        double  array[]={0,10,20,30,40,50,60,80};
        double  array2[]=new double[5];
        double[]  array3= {10,20,30};

        System.out.println(Arrays.toString(array));
        //arrayin içerisindeki max sayıyı bulalım

      double max=array[0];  //0
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>=max){
                max=array[i];
            }
        }
        System.out.println(max);



        String a="Merhaba";
        double  array5[]=new double[5];
        System.out.println(a.length());
        System.out.println(array5.length);


        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        for (double x:array) {
            if(x==10){

            }      //x=array[0], x=array[1],x=array[2].........x=array[7]
        }

// Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//  değiştiren metodu yazınız. merhaba a e  merhebe

        String str="merhaba";

        System.out.println(replace(str, "a", "e"));


    }
*/
    // Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//  alın ve sadece ilkini  değiştiren metodu yazınız. replaceFirst metodunu yazın

    public static String replace(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(target)){
                arry[i]=param;
            }
            result+=arry[i];
        }
        return result;
    }

    public static String replaceFirst(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(target) && count==0){
                arry[i]=param;
                count++;
            }
            result+=arry[i];
        }
        return result;
    }

    public static String replaceFirst2(String str, String word1, String word2){
        String [] arryString=str.split("");
        String result="";
        boolean firts=true;
        for (int i = 0; i < arryString.length; i++) {
            if(arryString[i].equals(word1) && firts){
                result+=word2;
                firts=false;
            }else {
                result+=arryString[i];
            }
        }
        return result;
    }



    // Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//  alın ve max 2 taneyi değiştiren  metodu yazınız. adanada ayran iç  edenada ayran iç

    public static String replaceTwo(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(target) && count<2){
                arry[i]=param;
                count++;
            }
            result+=arry[i];
        }
        return result;
    }

    // Kullanıcıdan bir kelime , değiştirmek istediği harfi/harfleri ve yeni harfi/harfleri
//  alın ve  bulduğu 3. harfi değiştiren  metodu yazınız. adanada ayran iç  adaneda ayran iç


    public static String replaceThree(String str,String target,String param){
        String[] arry=str.split("");
        String result="";
        int count=0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i].equals(target)){
                count++;
                if(count==3){
                    arry[i]=param;
                }
            }
            result+=arry[i];
        }
        return result;
    }

    public static String[] replaceArray(String str,String target,String param){
       String[] array=str.replace(" ","").split("");
       String[] result=new String[array.length];
       int i=0;
        for (String harf: array) {
            if(harf.equals(target)){
                result[i]=param;
            }else{
                result[i]=harf;
            }
            i++;
        }
        return result;

    }


    public static String[] replaceArray2(String str,String target,String param){
        String[] array=str.replace(" ","").split("");
        String[] result=new String[array.length];

        for (int i = 0; i < array.length ; i++) {
            if(array[i].equals(target)){
                array[i]=param;
            }
            result[i]=array[i];
        }
        return result;

    }

    //Kullanıcıdan bir kelime ve bir harf alın
    // kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string döndüren programı yazınız.
    //Array kullanarak

    public static void main(String[] args) {

       /* String str="uzun kollu gömlek L bden Fiyat:5000";
        String str2="Kısa kollu gömlek M bden Fiyat:5000";
        String[] arr=str.split("Fiyat:");
        System.out.println(Integer.valueOf(arr[1])==5000);

        System.out.println(replaceThree("adanada ayran iç", "a", "e")); */

        System.out.println(Arrays.toString(replaceArray("adanada ayran iç", "a", "e")));

    }

}
