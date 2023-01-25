package HW7.addressBook.model.communication;

public class PhoneNumber implements Communication {
    
    private String name;

    public PhoneNumber(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "PhoneNumber: " + name;
    }


    @Override
    public String getName() {
        return name;
    }


}
