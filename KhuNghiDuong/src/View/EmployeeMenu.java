package View;

public class EmployeeMenu extends DisplayMenu {
    public EmployeeMenu() {
        super(new String[]{"Display list Employees","Add new Employee","Edit Employee","Return main menu"});
    }
    public void display(){
        System.out.println("----EMPLOYEE MANAGEMENT-----");
        for (int i=0;i< options.length;i++){
            System.out.println((i+1)+"."+options[i]);
        }
    }
    public void handleChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Displaying list Employees");
                break;
            case 2:
                System.out.println("Adding new Employee");
                break;
            case 3:
                System.out.println("Editing Employee");
                break;
            case 4:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

}
