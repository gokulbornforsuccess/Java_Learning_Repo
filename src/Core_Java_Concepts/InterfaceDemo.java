package Core_Java_Concepts;
interface Int1{
    void meth1();
    default void meth2(){
        System.out.println("Sample meth2");
    }
    static void meth3(){
        System.out.println("Sample meth3");
    }

}
public class InterfaceDemo implements Int1 {
    public static void main(String[] args) {
        InterfaceDemo a= new InterfaceDemo();
        a.meth1();
        a.meth2();
        Int1.meth3();
    }
    @Override
    public void meth1() {
        System.out.println("Sample meth1");

    }
    public void meth2() {
        System.out.println("Override meth2");
    }
}
