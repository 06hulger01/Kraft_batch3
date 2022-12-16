package day_34_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {

//    contains() containsAll()     /copy   /subList()
    public static void main(String[] args) {

        ArrayList<String> weekDays = new ArrayList<>();
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        System.out.println("weekDays = " + weekDays);

        ArrayList<String> allDays = new ArrayList<>(weekDays);// way of copy 1

        ArrayList<String> allDays2 = new ArrayList<>();
        allDays2.addAll(weekDays);//way of copy 2

        System.out.println("allDays = " + allDays);
        System.out.println("allDays2 = " + allDays2);
        // both way above is copying values, not copying of referance
        // yukarıdaki her iki yolda list ler içindeki elementleri kopyalıyor referans ları değil.
        // aynı lste ile yeni objectler uretildi

//        List<String> strings = allDays2.subList(2, 4);
//        strings.add("merhaba");
//        System.out.println("strings = " + strings);//[Wednesday, Thursday, merhaba]
//        System.out.println("allDays2 = " + allDays2);//[Monday, Tuesday, Wednesday, Thursday, merhaba, Friday]

        ArrayList<String> allDays3 = new ArrayList<>(allDays2.subList(2, 4));
        System.out.println("allDays3 = " + allDays3);
        allDays3.add("merhaba");
        System.out.println("allDays2 = " + allDays2);
        System.out.println("allDays3 = " + allDays3);

//        allDays = [Monday, Tuesday, Wednesday, Thursday, Friday]

        allDays.add("Saturday");
        allDays.add("Sunday");
        System.out.println("allDays = " + allDays);

        System.out.println("allDays.contains('Thursday') = " + allDays.contains("Thursday"));//true
//        if (allDays.contains("Thursday")) {
//            allDays.indexOf("Thursday");
//        }
        System.out.println("allDays.containsAll(weekDays) = " + allDays.containsAll(weekDays));//true
        System.out.println("weekDays.containsAll(allDays) = " + weekDays.containsAll(allDays));//false


    }
}
