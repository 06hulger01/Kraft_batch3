package day_47_LibraryManagement;

import java.util.ArrayList;

public abstract class Library {

   static ArrayList<Personel> totalPersonel=new ArrayList<>();
   static   ArrayList<Book> books=new ArrayList<>();


    public abstract void addPersonel();
    public abstract void getAllPersonel();
    public static void addPersonel(Personel personel) {
        totalPersonel.add(personel);
    }

}
