package HW7.addressBook.model.agents;

import java.util.List;

import HW7.addressBook.model.communication.Communication;

public class Person extends ListAgent {

    public Person(String name, List<Communication> communications) {
        super(name, communications);
    }

}
