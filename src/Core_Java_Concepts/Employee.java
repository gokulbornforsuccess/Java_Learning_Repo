package Core_Java_Concepts;

public class Employee {

    private String name;
    private long id;

    private Address add;

    public Employee(String name, long id, String state, long pincode) {
        this.name = name;
        this.id = id;
        Address add=new Address(state,pincode);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", state=" + add.getState() +
                ", pincode=" + add.getPincode() +
                '}';
    }
}
