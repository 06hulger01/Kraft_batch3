package day_47_LibraryManagement;

import java.util.Scanner;

public class LibraryPersonel extends Personel{


    public LibraryPersonel(String fullName, String personelType) {
        super(fullName, personelType);
    }



    @Override
    public void addPersonel() {

        System.out.println("-------------Personel ekleme sayfası-----------");
        System.out.println("1-Üye Ekle\n2-Kütüphane Personeli Ekle\n3-Çıkış");
        System.out.print("Seçim: ");
        Scanner scan=new Scanner(System.in);
        int secim= scan.nextInt();
        scan.nextLine();
        if(secim==1){
            System.out.print("Personel Fullname: ");
            String fullName= scan.nextLine();
            Personel member=new LibraryMember(fullName,"Üye");
            totalPersonel.add(member);
        }else if(secim==2){

            System.out.print("Personel Fullname: ");
            String fullName= scan.nextLine();
            Personel admin=new LibraryPersonel(fullName,"Admin");
            totalPersonel.add(admin);
        }else if(secim==3) {
            System.out.println("Ekleme sayfasından çıkılıyor");
            return;
        }else {
            System.out.println("hatalı giriş 1-2-3 değerlerinden birini seçiniz");
        }
            addPersonel();



    }

    @Override
    public void getAllPersonel() {
        for (Personel personel:totalPersonel) {
            System.out.println(personel.personelId+" "+personel.fullName+" "+personel.personelType);
        }

    }
}
