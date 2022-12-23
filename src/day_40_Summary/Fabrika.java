package day_40_Summary;

public class Fabrika {

    String fabrikaAdi;
    double depolamaAlani;
    boolean isContainArge;
    int isciSayisi;
    public static double vergiOrani;



    public Fabrika(){
        System.out.println("Fabrika oluşturuldu.");
    }
    public Fabrika(String fabrikaAdi){
        this(fabrikaAdi,1000);
          this.fabrikaAdi=fabrikaAdi;
    }
    public Fabrika(String fabrikaAdi,double depolamaAlani){
       // this(fabrikaAdi);
        this.depolamaAlani=depolamaAlani;
    }

    public void depolamaAlaniniArttir(double artisMiktari){
        this.depolamaAlani+=artisMiktari;
    }

    public int metreKareBasiOran(){
        return (int) (this.depolamaAlani/this.isciSayisi);
          }






}
