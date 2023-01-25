package HW7.addressBook.model.agents;

import java.util.List;

import HW7.addressBook.model.communication.Communication;

public class Company extends ListAgent {

    public Company(String name, List<Communication> communications) {
        super(name, communications);
    }

    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Company name: " + super.name + "\n");
        for (Communication communication : super.communications) {
            sBuilder.append(" " + communication.toString() + "\n");
        }
        return sBuilder.toString();
    }

}
