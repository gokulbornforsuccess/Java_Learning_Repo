package Core_Java_Concepts;

public class Sample {
    public static void main(String[] args) {
        try{
            SubSample o1=new SubSample();
            SubSample o2=new SubSample("Rahul",35,76.44F);
            System.out.println("Name: "+o1.name+" Age: "+o1.age+" Percentage: "+o1.percentage);
            System.out.println("Name: "+o2.name+" Age: "+o2.age+" Percentage: "+o2.percentage);
            throw new ArrayIndexOutOfBoundsException("Sample Exception");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
