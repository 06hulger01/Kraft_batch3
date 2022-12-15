package day_34_ArrayList;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {

//        size()  add()  set() isEmpty()

//        add() ve size()
        ArrayList<String> names = new ArrayList<>();
        System.out.println("names.size() = " + names.size());

        names.add("Yunus");
        names.add("Bülent");
        names.add("Cengiz");
        names.add("Emre");

        System.out.println("names.size() = " + names.size());

        System.out.println("names = " + names);

        for (String s : names){
            System.out.println(s);
        }
//        set()

        names.set(0,"Ferid");
        System.out.println("names = " + names);
//        [Ferid, Bülent, Cengiz, Emre]

//        diferences between set() and add()

        names.add(0,"Yunus");
        System.out.println("names = " + names);
// set(index,element) methodu elemt i set eder yani uzerine yzar
// add(index,element) methodu elemneti belirtilen indexe yazar diğer elementleri kaydırır.

        ArrayList<String> names2 = new ArrayList<>();

        System.out.println("names.isEmpty() = " + names.isEmpty());
        System.out.println(names.size()==0);

        System.out.println("names2.isEmpty() = " + names2.isEmpty());
        System.out.println(names2.size()==0);

        names2.add(" ");
        System.out.println("names2.isEmpty() = " + names2.isEmpty());
        System.out.println("names2.size() = " + names2.size());

        System.out.println("names2 = " + names2);

        for (String s : names2){
            System.out.println("s = "+ s);
        }

        System.out.println("names2.toString() = " + names2.toString());

    }
}
