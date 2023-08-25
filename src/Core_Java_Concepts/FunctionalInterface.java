package Core_Java_Concepts;
@java.lang.FunctionalInterface
interface Int4{
        void intMeth();
}
public class FunctionalInterface{

    public static void main(String[] args) {
        Int4 obj1 = ()->{System.out.println("Sample");};
        obj1.intMeth();
    }

}
