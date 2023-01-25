package HW7.addressBook.main;

import java.util.ArrayList;
import java.util.List;

import HW7.addressBook.model.Model;
import HW7.addressBook.model.agents.Company;
import HW7.addressBook.model.agents.ListAgent;
import HW7.addressBook.model.agents.Person;
import HW7.addressBook.model.communication.Address;
import HW7.addressBook.model.communication.Communication;
import HW7.addressBook.model.communication.Email;
import HW7.addressBook.model.communication.PhoneNumber;
import HW7.addressBook.model.communication.Telegram;
import HW7.addressBook.model.communication.VK;
import HW7.addressBook.presenter.Presenter;
import HW7.addressBook.view.View;

public class Main {
    public static void main(String[] args) {
        List<ListAgent> listAgents = new ArrayList<>();
        List<Communication> nameCommunications = new ArrayList<>();
        Person petr = new Person("Petr", nameCommunications);
        nameCommunications.add(new PhoneNumber("8 926 555 45 45"));
        nameCommunications.add(new Email("89265554545@mail.ru"));
        nameCommunications.add(new Address("Kirovogradskaia 9"));
        nameCommunications.add(new Telegram("Petr_tg"));
        nameCommunications.add(new VK("Petr5545"));

        List<Communication> companyCommunications = new ArrayList<>();
        Company pik = new Company("Pik", companyCommunications);
        companyCommunications.add(new PhoneNumber("8 800 888 88 88"));
        companyCommunications.add(new Address("New Arbat 10"));
        companyCommunications.add(new Email("pik@mail.ru"));

        listAgents.add(petr);
        listAgents.add(pik);

        Presenter presenter = new Presenter(new View(), new Model(listAgents));
        presenter.start();
    }
}
