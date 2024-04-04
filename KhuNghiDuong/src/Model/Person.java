package Model;

import View.Validation;

import java.util.Date;
import java.util.Scanner;

import static View.Validation.ParseString;

public abstract class Person {
    protected String ID;
    protected String name;
    protected Date dob;
    protected String gender;
    protected String cid;
    protected String phoneNumber;
    protected String email;

    public Person(String ID, String name, Date dob, String gender, String cid, String phoneNumber, String email) {
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.cid = cid;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public Person(){

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  ", ID= " + ID  +
                ", name='" + name  +
                ", dob=" + dob +
                ", gender='" + gender  +
                ", cid='" + cid  +
                ", phoneNumber='" + phoneNumber  +
                ", email='" + email  +
                '}';
    }
    public Person addNew(){
        Validation val = new Validation();
        Scanner sc = new Scanner(System.in);
        String tempUserID;
        boolean isValid;
        do {
            System.out.println("Enter ID (Format: NV-xxxx):");
            tempUserID = sc.nextLine();
            isValid = val.validateCustomerId(tempUserID);
            if (!isValid) {
                System.out.println("Invalid Id format. Please enter in the format NV-xxxx.");
            }
        } while (!isValid);
        this.ID = tempUserID;

        String tempName;
        do {
            System.out.println("Enter Name (Format: Uppercase first letter):");
            tempName = sc.nextLine();
            isValid = val.validateName(tempName);
            if (!isValid) {
                System.out.println("Invalid Name format. Please enter in the format Uppercase first letter.");
            }
        } while (!isValid);
        this.name = tempName;

        Date tempDate;
         do {
            System.out.println("Enter Date(Format: YY-MM-DD):");
            String temp = sc.nextLine();
            tempDate=ParseString(temp);
            isValid = val.validateAge(tempDate);
            if (!isValid) {
                System.out.println("Invalid CustomerName format. Please enter in the formatYY-MM-DD.");
            }
        } while (!isValid);
        this.dob = tempDate;

        String tempGender;
        do {
            System.out.println("Enter Gender (Format: Man/Woman/Other):");
            tempGender = sc.nextLine();
            isValid = val.validateName(tempGender);
            if (!isValid) {
                System.out.println("Invalid Name format. Please enter in the format  Man/Woman/Other.");
            }
        } while (!isValid);
        this.name = tempGender;

        String tempCID;
         do {
            System.out.println("Enter CID (Format: Number and Length=9/Length=12):");
            tempCID = sc.nextLine();
            isValid = val.validateName(tempCID);
            if (!isValid) {
                System.out.println("Invalid CID format. Please enter in the format  Number and Length=9/Length=12.");
            }
        } while (!isValid);
        this.cid = tempCID;

        String tempPhoneNumber;
        do {
            System.out.println("Enter PhoneNumber (Format: Number ):");
            tempPhoneNumber = sc.nextLine();
            isValid = val.validatePhoneNumber(tempPhoneNumber);
            if (!isValid) {
                System.out.println("Invalid PhoneNumber format. Please enter in the format  Number .");
            }
        } while (!isValid);
        this.cid = tempPhoneNumber;

        System.out.println("Enter Email: ");
        this.email = sc.nextLine();
        return this;
    }
}
