package day_34_ArrayList;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {
//        get() indexOf() LastIndexOf() clear()

        ArrayList<String> names = new ArrayList<>();

        names.add("Seyma");
        names.add("Cengiz");
        names.add("Ferid");
        names.add("Emre");
        names.add("Bülent");
        names.add("Zafer");
        names.add("Özlem");
        names.add("Vena");

        for (String s : names){
            System.out.print(s+" ");
        }
        System.out.println();

        System.out.println("names.get(4) = " + names.get(4));

        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i)+" ");
        }

        System.out.println();

        names.set(4,"Özlem");
        System.out.println("names = " + names);
        System.out.println("\nnames.indexOf('Özlem') = " + names.indexOf("Özlem"));


        System.out.println("names = " + names);

        System.out.println("names.lastIndexOf('Özlem') = " + names.lastIndexOf("Özlem"));

        names.clear();
        System.out.println("names.size() = " + names.size());


    }
}
