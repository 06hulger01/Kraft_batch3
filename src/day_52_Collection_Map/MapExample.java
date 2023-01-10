package day_52_Collection_Map;

import day_41_inheritanceAndAccesModifier.Person;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
/*
        Map<Integer,String> mapOgrenci=new HashMap<>();
        mapOgrenci.put(12,"Ferid yılmaz");
        mapOgrenci.put(24,"Harun şafak");
        mapOgrenci.put(15,"Emre Static");
        System.out.println(mapOgrenci.size());

        System.out.println(mapOgrenci.get(24));
*/

        Map<String,Double> urunFiyatMap=new HashMap<>();
        urunFiyatMap.put("Armut",24.99);
        urunFiyatMap.put("Elma",45.66);
        urunFiyatMap.put("vişne",23.99);
        urunFiyatMap.put("portakal",10.63);
        urunFiyatMap.put("Karpuz",50.44);
       // System.out.println(urunFiyatMap.size());
        urunFiyatMap.put("Karpuz",32.89);
        urunFiyatMap.put("Ceviz",null);

        Map<String,Double> urunFiyatMap2=new TreeMap<>();
        urunFiyatMap2.put("Armut",24.99);
        urunFiyatMap2.put("Elma",45.66);
        urunFiyatMap2.put("vişne",23.99);
        urunFiyatMap2.put("portakal",10.63);
        urunFiyatMap2.put("Karpuz",50.44);
        // System.out.println(urunFiyatMap.size());
        urunFiyatMap2.put("Karpuz",32.89);
        urunFiyatMap2.put("Ceviz",null);



        Map<String,Double> urunFiyatMap3=new LinkedHashMap<>();
        urunFiyatMap3.put("Armut",24.99);
        urunFiyatMap3.put("Elma",45.66);
        urunFiyatMap3.put("vişne",23.99);
        urunFiyatMap3.put("portakal",10.63);
        urunFiyatMap3.put("Karpuz",50.44);
        // System.out.println(urunFiyatMap.size());
        urunFiyatMap3.put("Karpuz",32.89);
        urunFiyatMap3.put("Ceviz",null);
      //  System.out.println(urunFiyatMap.size());
      //  System.out.println(urunFiyatMap.get("Ceviz"));


       // urunFiyatMap3.forEach((k,v)-> System.out.println(k+" "+v));

        Set<String> set=urunFiyatMap3.keySet();
        urunFiyatMap3.replace("Ceviz",44.55);
        System.out.println(urunFiyatMap3.containsKey("Ceviz"));

        urunFiyatMap3.remove("Ceviz");
        System.out.println(urunFiyatMap3.get("Ceviz"));
        System.out.println(urunFiyatMap3.values());
        System.out.println(urunFiyatMap3.entrySet());



/*
        for (String key: set) {
            System.out.println(urunFiyatMap3.get(key));
        }
*/



    }
}
