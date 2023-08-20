package Core_Java_Concepts;

public class OverloadingOverriding {
    static int add(int i1,int i2){
        return i1+i2;
    }
    static float add(float i1, float i2){
        return i1+i2;
    }
    public static void main(String[] args) {
        System.out.println(add(10,11));
        System.out.println(add(11.5F,12.5F));

    }
}
class override{
    static int sum(int i1,int i2){
        System.out.println("Method inside override Class");
        return i1+i2;
    }
}
