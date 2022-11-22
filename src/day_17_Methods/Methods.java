package day_17_Methods;

public class Methods {
    public static void main(String[] args) {

        System.out.println("program başladı");
        kos();
        uyu();
        System.out.println("program sonlanıyor");
    }

    public static void kos(){
        System.out.println("Ali Koşuyor");
        yemekYe();
        System.out.println("Ali koşmaktan yoruldu çünkü yemek yedi");
    }

    public static  void yemekYe(){
        menu();
        System.out.println("Ali yemek yiyor");
    }

    public static void uyu(){
        System.out.println("Ali uyuyor");
    }
//menu adında bir metod oluşturun bu metosdun içerinde 1-kebap,2-çorba,3-tatlı,4-salata,5-içecek
// olacak şekilde ekrana bir menü getirin ve bu menu metodunu main metodu içerinde çağırın
public static void menu(){

    System.out.println("1-kebap,2-çorba,3-tatlı,4-salata,5-içecek");
}

}
