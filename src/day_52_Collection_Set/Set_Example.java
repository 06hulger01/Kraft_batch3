package day_52_Collection_Set;

import java.util.*;

public class Set_Example {

    public static void main(String[] args) {
     /*   HashSet<String> hashSet=new HashSet<>(Arrays.asList("Ahmet","Seyma","Ferid"));
        hashSet.add("Harun");
        hashSet.add("Harun");
        hashSet.add("Seyma");
        hashSet.add("Seyma");
      //  System.out.println(hashSet);
      //  HashSet<Integer> hashSet2=new HashSet<>(Arrays.asList(1,6,3,2,9,7));
      //  TreeSet<Integer> treeSet=new TreeSet<>(Arrays.asList(1,6,3,2,9,7));
       // System.out.println(hashSet2);
       // System.out.println(treeSet);

       /
      */

        Integer [] arr={1,2,3,6,8,45,33,69,78,1,2,3,6,8};


        Set<Integer> hashSet=new HashSet<>(Arrays.asList(arr));
        Set<Integer> treeSet=new TreeSet<>(Arrays.asList(arr));


       // System.out.println(hashSet);
      //  System.out.println(treeSet);

        Iterator<Integer> iterator= hashSet.iterator();
        System.out.println(hashSet);

       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }



        //  System.out.println(treeSet3);




      /* Object arr[]= hashSet.toArray();
       hashSet.forEach(item-> System.out.println(item));
        System.out.println(hashSet);

        //list içerisinde bulunan polindrom (terside kendisine
        // eşit olan kelimeler) kelimeleri ekrana yazdıran metodu yazınız.(aynı kelimeleri ekrana yazma-sın)

        List<String> list=new ArrayList<>(Arrays.asList("kaşık","adanada","kazak","radar","ses","harun","ses"));
        polindromKelimeBul6(list); */


    }

    public static void polindromKelimeBul6(List<String> list){
        Set<String> set=new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String reverse = "";
            for (int j = str.length()-1; j >=0;  j--) {
                reverse+=str.charAt(j);
            }
            if(str.equalsIgnoreCase(reverse)){
                set.add(str);
            }
        }
        set.forEach(item-> System.out.print(item+" "));

    }
}
