package Core_Java_Concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        for (int i=1; i<10 ; i++){
            a.add(i);
        }
        List<Integer> odd = a.stream().filter(i-> i%2==0).collect(Collectors.toList());
        List<Integer> add = a.stream().map(i-> i+5).collect(Collectors.toList());
        List<Integer> distinct = a.stream().distinct().collect(Collectors.toList());
        List<Integer> sorted = a.stream().sorted().collect(Collectors.toList());
        Integer reduce = a.stream().reduce(Integer::sum).get();
        System.out.println("odd:"+odd);
        System.out.println("add:"+add);
        System.out.println("distinct:"+distinct);
        System.out.println("sorted:"+sorted);
        System.out.println("reduce:"+reduce);





    }


}
