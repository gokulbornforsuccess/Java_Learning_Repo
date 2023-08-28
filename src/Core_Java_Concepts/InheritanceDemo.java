package Core_Java_Concepts;

class A1 extends Object{
    A1(int b){
        System.out.println("Parameter passed in class A1:"+b);
    }
}
class A2 extends A1{
    A2(int a, int b){
        super(b);
        System.out.println("Parameter passed in class A2:"+a);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        A2 obj = new A2(10,11);
    }
}
