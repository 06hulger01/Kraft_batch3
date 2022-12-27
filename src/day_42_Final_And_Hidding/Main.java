package day_42_Final_And_Hidding;

import java.util.ArrayList;

public class Main {



    public static void main(String[] args) {
   /* final int[] array={1,1,1};
        System.out.println(array);
        int[] array2={10,10,10};
        System.out.println(array2);
        array2=array;
        System.out.println("array = " + array);
        System.out.println(array2[0]);
        */
      /* final ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);

        ArrayList<Integer> arrayList2=new ArrayList<>();
        arrayList2.add(20);
        arrayList2.add(30);
        //arrayList=arrayList2;
       Account account=new Account();
       account.faizHesapla(); */

/*

   B bObjesi=new B();
   C cObjesi=new C();
        System.out.println("bObjesi.x = " + bObjesi.x);
        System.out.println("cObjesi.x = " + cObjesi.x);
*/
        // ArrayList kullanarak kayma miktarına göre sağa doğru kaydırın   kayma miktarı=2
        // 4,5,1,2,3   kayma mikarı=1   5,1,2,3,4  kayma miktarı=3   3,4,5,1,2
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("arrayList.toString() = " + arrayList.toString());
      //  1-2-3-4-5    3-5-1
       int kaymaMiktari=2;
        for (int i = 0; i <kaymaMiktari ; i++) {
            arrayList.add(0,arrayList.remove(arrayList.size()-1));
        }
        System.out.println("arrayList.toString() = " + arrayList.toString());

    }








}
