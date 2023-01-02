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
        }else {
            System.out.println("Ekleme sayfasından çıkılıyor");
        }

        System.out.println("Personel eklemeye devam etmek istiyor musunuz (Evet/Hayır)");
        System.out.print("seçim: "); String secim2=scan.next();
        if(secim2.equalsIgnoreCase("evet")){
            addPersonel();
        }


    }
}
