package day_52_Collection_Set;

import java.util.*;

public class Set_Example_2 {

    public static void main(String[] args) {

       // String str="Bugün son dersimiz hepinizi çok seviyoruz arkadaşlar başarılarınızın" +
        //        "devamını diliyoruz";
        //yukarıdaki kelime içerisinde kaç farklı harf vardır?
      //  System.out.println(benzersizHarfAdet(str));


        Set<Integer> set=new HashSet<>();
        set.add(5);
        set.add(10);
        set.add(5);
        set.add(35);
        set.add(17);
        System.out.println(set);


        System.out.println(set.remove(5));
        System.out.println(set);

    }

    public  static int benzersizHarfAdet(String str){
        String[] arr=str.replace(" ","").split("");
        Set<String> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
       return set.size();

    }
}
