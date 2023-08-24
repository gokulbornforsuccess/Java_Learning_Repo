package Core_Java_Concepts;

public class StaticClass{
    public static void main(String[] args) {
        A.count=100;
        System.out.println(A.count);
    }
}
class A{
    public static int count;
}
