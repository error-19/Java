package foreachLoop;

import java.util.ArrayList;
import java.util.Objects;

public class foreach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        ArrayList<String> name = new ArrayList<>();
        name.add("shamim sorkar");
        name.add("Tonoy Chnadra sil");
        name.add("Supto");
        name.add("Raiyan Islam Badon");
        name.add("Rotno");
        for (String n : name) {
            System.out.println(n);
        }
        ArrayList<Object> obj = new ArrayList<>();
        obj.add("I am Call from object!");
        obj.add("shamim sorkar");
        obj.add("Tonoy Chnadra sil");
        obj.add("Supto");
        obj.add("Raiyan Islam Badon");
        obj.add("Rotno");

        obj.add(80);
        obj.add(90);
        obj.add(30);
        obj.add(340);
        obj.add(5670);
        obj.add(33);
        for (Object i : obj) {
            System.out.println(i);
        }


    }
}

