package day_40_Summary;

import java.util.Random;
import java.util.Scanner;

public class KraftBank {
   private   int customerId;
   private String customerFullName;
   private boolean isSms;
   private double customerAccount;
   private String customerToken;
public static String staticDegisken="Emre bey";
public String normalDegisken;
public static int musteriSayisi;
private static String userName;
    private static  String passWord;


    static {
         Scanner scan=new Scanner(System.in);
        System.out.print("Username: ");
        userName= scan.next();
        System.out.print("Password: ");
        passWord= scan.next();

    }


    {
        musteriSayisi++;

        Random random=new Random();
        int sayi=random.nextInt(9000)+1000;
        this.customerToken= passWord+userName.substring(0,2)+1;
       // System.out.println(this.customerToken);
    }

    public String getCustomerFullName() {
        return customerFullName;
    }


    public boolean getIsSms() {
        return isSms;
    }

    public void setIsSms(boolean sms) {
        isSms = sms;
    }


    public KraftBank(int customerId, String customerFullName, boolean isSms){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
       // this.customerToken=this.tokenUret();
    }
    public KraftBank(int customerId,String customerFullName,boolean isSms,double customerAccount){
        this.customerId=customerId;
        this.customerFullName=customerFullName;
        this.isSms=isSms;
        this.customerAccount=customerAccount;
       // this.customerToken=this.tokenUret();
    }

    public int getCustomerId(){
        return this.customerId;
    }
    public double getcustomerAccount(String token){
        if(this.customerToken.equals(token)){
            return this.customerAccount;
        }
        return 0;
    }


    private String tokenUret(){
        Random random=new Random();
        int sayi=random.nextInt(9000)+1000;
        return this.customerId+this.customerFullName.substring(0,2)+sayi;

    }



   public void addMoney(double money){
        this.customerAccount+=money;
    }




}
