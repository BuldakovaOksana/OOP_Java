package HW7.addressBook.presenter;

import java.util.Scanner;

import HW7.addressBook.model.Model;
import HW7.addressBook.view.View;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void start() {
        view.greeting();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            view.showMenu();
            int choise = scanner.nextInt();
            switch (choise) {
                case 1:
                    view.showAllContacts(model.getListAgents());
                    break;

                case 2:
                    System.out.println("Enter the contact name/organization name to search for:");
                    String name = scanner.next();
                    view.showListAgent(model.fineAgentByName(name));
                    break;

                case 3:
                    view.addAgentMenu();
                    int AgentChoise = scanner.nextInt();
                    System.out.println("Enter the name of the new contact:");
                    String newName = scanner.next();
                    model.addAgent(AgentChoise, newName, view.communicationMenu(scanner));
                    System.out.println("Contact added!");
                    break;

                case 4:
                    System.out.println("Enter the name of the contact you want to delete:");
                    String removeName = scanner.next();
                    model.removeAgent(removeName);
                    System.out.println("Contact deleted!");
                    break;

                case 5:
                    model.addNewCommunication(view.getContactName(scanner), view.communicationMenu(scanner));
                    System.out.println("Communication added!");
                    break;

                case 6:
                    model.removeCommunication(view.getContactName(scanner), view.getContactName(scanner));
                    System.out.println("Communication added!");
                    break;

                case 0:
                    view.bye();
                    flag = false;
                    scanner.close();
                    break;

                default:
                    break;
            }
        }
    }

}
