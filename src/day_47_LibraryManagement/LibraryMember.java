package day_47_LibraryManagement;

public class LibraryMember extends Personel {


    public LibraryMember(String fullName, String personelType) {
        super(fullName, personelType);
    }

    @Override
    public void addPersonel() {
        System.out.println("Üyelerin personel ekleme yetkisi yoktur");
    }
}
