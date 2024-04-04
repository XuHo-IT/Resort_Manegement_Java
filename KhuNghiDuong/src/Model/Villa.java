package Model;

import java.util.Scanner;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int floorNumber;

    public Villa(String serviceID, String serviceName, double usableArea, double rentalCost, int maximumPeople, String rentalType, String roomStandard, double poolArea, int floorNumber) {
        super(serviceID, serviceName, usableArea, rentalCost, maximumPeople, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public Villa(){

    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Villa: " + super.toString() +
                ", roomStandard='" + roomStandard +
                ", poolArea=" + poolArea +
                ", floorNumber=" + floorNumber ;

    }
    public Facility addNew(){
        super.addNew();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roomStandard");
        this.roomStandard= sc.nextLine();
        System.out.println("Enter poolArea");
        this.poolArea= sc.nextDouble();
        System.out.println("Enter floorNumber");
        this.floorNumber = sc.nextInt();
        return this;
    }
}
