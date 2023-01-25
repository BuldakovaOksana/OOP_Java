package HW7.addressBook.model.communication;

public class Address implements Communication  {

    private String name;

    public Address(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Address:" + name;
    }



    @Override
    public String getName() {
        return name;
    }
    
}
