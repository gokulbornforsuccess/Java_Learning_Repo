package Core_Java_Concepts;

public class Encapsulation extends X{
    public static void main(String[] args) {
        Encapsulation g=new Encapsulation();
        g.setter(10);
        System.out.println(g.getter());
    }

}
class X{
    private int x=10;
    public int getter(){
        return x;
    }
    public void setter(int x){
        this.x=x;
    }
}
