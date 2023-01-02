package day_47_LibraryManagement;

import java.util.ArrayList;

public abstract class Personel extends Library {

    String fullName;
    String personelId;
    ArrayList<Book> personelBook=new ArrayList<>();
    String personelType;
    static int counter;

    public Personel(String fullName,String personelType){
        this.fullName=fullName;
        this.personelType=personelType;
        counter++;
        this.personelId=personelType+counter;

    }




}
