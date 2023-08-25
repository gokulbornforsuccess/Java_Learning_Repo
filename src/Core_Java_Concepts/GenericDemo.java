package Core_Java_Concepts;

public class GenericDemo implements xx{
    public static void main(String[] args) {
        GenericDemo bx=new GenericDemo();
        bx.methx("Gokul");
    }
}
interface xx {
    default <T> void methx(T obj){
        System.out.println(obj);
    }
}
