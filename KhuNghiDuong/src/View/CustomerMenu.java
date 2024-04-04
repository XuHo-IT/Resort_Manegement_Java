package View;

public class CustomerMenu extends DisplayMenu {
    public CustomerMenu() {
        super(new String[]{"Display list Customers", "Add new Customer", "Edit Customer", "Return main menu"});
    }

    public void display() {
        System.out.println("----CUSTOMER MANAGEMENT-----");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + "." + options[i]);
        }
    }
    public void handleChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Displaying list Customer");
                break;
            case 2:
                System.out.println("Adding new Customer");
                break;
            case 3:
                System.out.println("Editing Customer");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

