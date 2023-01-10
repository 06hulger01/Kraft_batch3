package day_52_Collection_Map;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Map<Integer,Urun> urunlerim=new TreeMap<>();

        Urun kek=new Urun();
        kek.name="pop kek";
        kek.fiyat=24.99;

        Urun cekirdek=new Urun();
        cekirdek.name="Tadım çekirdek 300 gr";
        cekirdek.fiyat=22.00;

        urunlerim.put(14,kek);
        urunlerim.put(8,cekirdek);

        System.out.println(urunlerim.entrySet());

        System.out.println(urunlerim.get(8).name);
        System.out.println(urunlerim.get(8).fiyat);

    }
}
