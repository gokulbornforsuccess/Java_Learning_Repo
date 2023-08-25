package Core_Java_Concepts;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a1= new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a1.forEach(i-> System.out.println(i));

    }
}
