package Model;

import View.Validation;

import java.util.Date;
import java.util.Scanner;

public class Employee extends Person  {

    private String level;
    private String position;
    private double salary;

    public Employee(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email, String level,String position, double salary) {
        super(ID, name, dob, gender, cid, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(){

    }


    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                ", level='" + level  +
                ", position=" + position +
                ", salary=" + salary;

    }
    public Person addNew(){
        super.addNew();
        Validation val = new Validation();
        Scanner sc = new Scanner(System.in);
        String tempEmployeeLevel;
        boolean isValid;
        do {
            System.out.println("Enter EmployeeLevel (Format: (\n" +"Intermediate|College|University|Postgraduate)):");
            tempEmployeeLevel = sc.nextLine();
            isValid = val.inputEmployeePosition(tempEmployeeLevel, "(Intermediate|College|University|Postgraduate)");
            if (!isValid) {
                System.out.println("Invalid EmployeeLevel format. Please enter in the format Intermediate|College|University|Postgraduate.");
            }
        } while (!isValid);
        this.level = tempEmployeeLevel;

        String tempEmployeePosition;
        do {
            System.out.println("Enter EmployeePosition(Format: (\n" +"Receptionist|server|specialist|supervisor|manager|director)):");
            tempEmployeePosition = sc.nextLine();
            isValid = val.inputEmployeePosition(tempEmployeePosition, "(Receptionist|server|specialist|supervisor|manager|director)");
            if (!isValid) {
                System.out.println("Invalid EmployeeLevel format. Please enter in the format Receptionist|server|specialist|supervisor|manager|director.");
            }
        } while (!isValid);
        this.position = tempEmployeePosition;

        Double tempSalary;
        do {
            System.out.println("Enter Salary(Format: Salary>0");
            tempSalary = sc.nextDouble();
            isValid = val.validateSalary(tempSalary);
            if (!isValid) {
                System.out.println("Invalid EmployeeLevel format. Please enter in the format Salary>0.");
            }
        } while (!isValid);
        this.salary = tempSalary;
        return this;
    }
}
