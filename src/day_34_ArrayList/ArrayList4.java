package day_34_ArrayList;

import java.util.ArrayList;

public class ArrayList4 {
    public static void main(String[] args) {
//        addAll() removeAll()

        ArrayList<String> position = new ArrayList<>();
        position.add("QA");
        position.add("Developer");
        position.add("UXDesiner");
        position.add("Deveops Engineer");
        position.add("Scrum Master");

        ArrayList<String> tools = new ArrayList<>();
        tools.add("JAVA");
        tools.add("SELENIUM");
        tools.add("FIGMA");
        tools.add("AZURE");
        tools.add("JIRA");

        position.addAll(tools);
        System.out.println("position = " + position);
        System.out.println("tools = " + tools);

        tools.addAll(position);
        System.out.println("tools = " + tools);

        tools.removeAll(position);
        System.out.println("tools = " + tools);

        ArrayList<String> names = new ArrayList<>();

        names.add("ahmet");
        names.add("mehmet");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("ahmet");
        names2.add("ahmet");
        names2.add("mehmet");
        names2.add("mehmet");
        names2.add("ali");

        names2.removeAll(names);
        System.out.println("names2 = " + names2);


    }
}
