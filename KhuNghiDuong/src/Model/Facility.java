package Model;

import Repository.FacilityRepository;
import Service.IFacilityService;
import View.Validation;

import java.util.Scanner;

public class Facility implements IFacilityService, FacilityRepository {
    protected String serviceID;
    protected String serviceName;
    protected double usableArea;
    protected double rentalCost;
    protected int maximumPeople;
    protected String  rentalType;

    public Facility(String serviceID, String serviceName, double usableArea, double rentalCost, int maximumPeople, String rentalType) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String toString() {
        return "Service{" +
                "serviceID='" + serviceID + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCost=" + rentalCost +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }
    public Facility addNew(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter serviceID");
        this.serviceID = sc.nextLine();
        System.out.println("Enter serviceName");
        this.serviceName= sc.nextLine();
        System.out.println("Enter usableArea");
        this.usableArea= sc.nextInt();
        System.out.println("Enter rentalCost");
        this.rentalCost = sc.nextDouble();
        System.out.println("Enter maximumPeople");
        this.maximumPeople = sc.nextInt();
        System.out.println("Enter rentalType");
        this.rentalType = sc.nextLine();
        return this;
    }
}
