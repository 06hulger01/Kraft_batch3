package day_47_LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Personel admin=new LibraryPersonel("Harun","Admin");
        Library.addPersonel(admin);
        admin.addPersonel();
        admin.getAllPersonel();

    }


}
