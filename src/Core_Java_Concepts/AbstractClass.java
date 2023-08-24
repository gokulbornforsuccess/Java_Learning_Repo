package Core_Java_Concepts;

abstract class B1{
    public void meth2(){
        System.out.println("Abstract Method");
    }
}
class AbstractClass extends B1{
    public static void main(String[] args) {
        AbstractClass xx=new AbstractClass();
        xx.meth2();
    }
}