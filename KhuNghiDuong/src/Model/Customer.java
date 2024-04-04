package Model;

import Repository.CustomerRepository;
import Service.ICustomerService;
import View.Validation;

import java.util.Date;
import java.util.Scanner;

public class Customer extends Person implements ICustomerService, CustomerRepository {
    private String customerType;
    private String address;

    public Customer(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email, String customerType, String address) {
        super(ID, name, dob, gender, cid, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(){

    }
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer: " +
                super.toString() +
                ", customerType='" + customerType +
                ", address='" + address ;

    }
    public Person addNew() {
        super.addNew();
        Validation val = new Validation();
        Scanner sc = new Scanner(System.in);
        String tempCustomerType;
        boolean isValid;
        do {
            System.out.println("Enter CustomerType (Format: (Diamond|Platinum|Gold|Silver|Member)):");
            tempCustomerType = sc.nextLine();
            isValid = val.inputCustomerType(tempCustomerType, "(Diamond|Platinum|Gold|Silver|Member)");
            if (!isValid) {
                System.out.println("Invalid UserCustomerType format. Please enter in the format Diamond|Platinum|Gold|Silver|Member.");
            }
        } while (!isValid);
        this.customerType = tempCustomerType;
        System.out.println("Enter address: ");
        this.address=sc.nextLine();
        return this;
    }

}
