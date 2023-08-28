package Core_Java_Concepts;

public class Address {
    private String State;
    private long pincode;

    public Address(String state, long pincode) {
        State = state;
        this.pincode = pincode;
    }

    public void setState(String state) {
        State = state;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return State;
    }

    public long getPincode() {
        return pincode;
    }
}
