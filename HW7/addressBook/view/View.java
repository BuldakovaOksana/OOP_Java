package HW7.addressBook.view;

import java.util.List;
import java.util.Scanner;

import HW7.addressBook.model.agents.ListAgent;
import HW7.addressBook.model.communication.Address;
import HW7.addressBook.model.communication.Communication;
import HW7.addressBook.model.communication.Email;
import HW7.addressBook.model.communication.PhoneNumber;
import HW7.addressBook.model.communication.Telegram;
import HW7.addressBook.model.communication.VK;

public class View {
    private void showCommunicationMenu() {
        System.out.println(" [1 + Enter] - PhoneNumber");
        System.out.println(" [2 + Enter] - Email");
        System.out.println(" [3 + Enter] - VK");
        System.out.println(" [4 + Enter] - Telegram");
        System.out.println(" [5 + Enter] - Address");
    }

    public void showListAgent(List<ListAgent> listAgents) {
        if (listAgents.isEmpty()) {
            System.out.println("Contact not found");
        } else {
            for (ListAgent listAgent : listAgents) {
                System.out.println(listAgent.toString());
                System.out.println("______________________________________");
            }
        }
    }

    public void showAllContacts(List<ListAgent> listAgents) {
        System.out.println("________________________________");
        if (listAgents.isEmpty()) {
            System.out.println("Contact not found");
        } else {
            for (ListAgent listAgent : listAgents) {
                System.out.println(listAgent.getName());
                System.out.println("____________________________");
            }
        }
    }

    public void showMenu() {
        System.out.println(" [1 + Enter] - View the list of all contacts");
        System.out.println(" [2 + Enter] - Find a contact");
        System.out.println(" [3 + Enter] - Add a contact");
        System.out.println(" [4 + Enter] - Delete a contact");
        System.out.println(" [5 + Enter] - Add a new communication method");
        System.out.println(" [6 + Enter] - Delete a method of communication");
        System.out.println(" [0 + Enter] - Exiting the application");

    }

    public void greeting() {
        System.out.println("You are welcomed by the application \"My contacts\"!");
    }

    public void bye() {
        System.out.println("Thank you for using the \"My Contacts\" application.\n All the best!");
    }

    public void addAgentMenu() {
        System.out.println("Select the contact type:");
        System.out.println(" [1 + Enter] - Physical person");
        System.out.println(" [2 + Enter] - Legal person");
    }

    public Communication communicationMenu(Scanner scanner) {
        showCommunicationMenu();
        int choise = scanner.nextInt();
        String value = "";
        Communication communication = null;

        switch (choise) {
            case 1:
                System.out.println("Enter your phone number:");
                value = scanner.next();
                communication = new PhoneNumber(value);
                break;
            case 2:
                System.out.println("Enter your Email:");
                value = scanner.next();
                communication = new Email(value);
                break;
            case 3:
                System.out.println("Enter your VK:");
                value = scanner.next();
                communication = new VK(value);
                break;
            case 4:
                System.out.println("Enter your Telegram:");
                value = scanner.next();
                communication = new Telegram(value);
                break;
            case 5:
                System.out.println("Enter your address:");
                value = scanner.next();
                communication = new Address(value);
                break;

            default:
                break;
        }
        return communication;
    }

    public String getContactName(Scanner scanner) {
        System.out.println("Enter the name of the contact to whom you want to add/remove the communication method:");
        String getContactName = scanner.next();
        return getContactName;
    }

    public String getContactValue(Scanner scanner) {
        System.out.println("Enter the phone number/address/vk/tg/email you want to delete:");
        String getContactValue = scanner.next();
        return getContactValue;
    }

}
